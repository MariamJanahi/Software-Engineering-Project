import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

// BUSINESS LAYER for the Viewing Reading Status use case.
// Decides each book's status, filters books, and calculates progress and counts.
// It does not read input, print output, or know how data is stored.
public class ReadingStatusService {
    private final ReadingStatusData data; // data layer used to load books

    // Creates the service with its data layer (must not be null).
    public ReadingStatusService(ReadingStatusData data) {
        if (data == null) {
            throw new IllegalArgumentException("Data layer must not be null.");
        }
        this.data = data;
    }

    // Returns all books, each with its final status already decided.
    public List<ReadingStatusRecord> viewAllBooks() {
        List<ReadingStatusRecord> records = data.loadAllRecords();
        for (ReadingStatusRecord record : records) {
            record.setStatus(determineStatus(record));
        }
        return records;
    }

    // Returns only the books that have the given status.
    public List<ReadingStatusRecord> viewBooksByStatus(ReadingStatus status) {
        if (status == null) {
            throw new IllegalArgumentException("Status must not be null.");
        }
        List<ReadingStatusRecord> result = new ArrayList<>();
        for (ReadingStatusRecord record : viewAllBooks()) {
            if (record.getStatus() == status) {
                result.add(record);
            }
        }
        return result;
    }

    // Returns one book by title (case-insensitive).
    // Throws IllegalArgumentException if the title is empty or not found.
    public ReadingStatusRecord viewBookDetails(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title must not be empty.");
        }
        for (ReadingStatusRecord record : viewAllBooks()) {
            if (record.getTitle().equalsIgnoreCase(title.trim())) {
                return record;
            }
        }
        throw new IllegalArgumentException("Book not found.");
    }

    // Returns the percentage of pages read (0.0 to 100.0).
    // Returns 0.0 when no page information exists.
    public double calculateProgressPercent(ReadingStatusRecord record) {
        if (record == null) {
            throw new IllegalArgumentException("Record must not be null.");
        }
        if (record.getTotalPages() <= 0) {
            return 0.0;
        }
        return (double) record.getCurrentPage() / record.getTotalPages() * 100;
    }

    // Counts how many books are in each status (0 if none).
    public Map<ReadingStatus, Integer> getStatusSummary() {
        Map<ReadingStatus, Integer> summary = new EnumMap<>(ReadingStatus.class);
        for (ReadingStatus status : ReadingStatus.values()) {
            summary.put(status, 0);
        }
        for (ReadingStatusRecord record : viewAllBooks()) {
            summary.put(record.getStatus(), summary.get(record.getStatus()) + 1);
        }
        return summary;
    }

    // Decides a book's status.
    // Rule 1: if a progress record exists, use the pages (0 = To Read, all pages = Finished,
    //         anything in between = Reading).
    // Rule 2: otherwise, understand the status text typed in the Managing Books use case.
    public ReadingStatus determineStatus(ReadingStatusRecord record) {
        if (record.hasProgress() && record.getTotalPages() > 0) {
            if (record.getCurrentPage() <= 0) {
                return ReadingStatus.TO_READ;
            }
            if (record.getCurrentPage() >= record.getTotalPages()) {
                return ReadingStatus.FINISHED;
            }
            return ReadingStatus.READING;
        }
        return parseStatusText(record.getStoredStatus());
    }

    // Converts free text such as "reading" or "to read" into a ReadingStatus.
    // The order of the checks matters because "to read" also contains "read".
    public ReadingStatus parseStatusText(String text) {
        if (text == null) {
            return ReadingStatus.UNKNOWN;
        }
        String s = text.trim().toLowerCase();
        if (s.contains("finish") || s.contains("complete") || s.equals("done")) {
            return ReadingStatus.FINISHED;
        }
        if (s.contains("to read") || s.contains("to-read") || s.contains("unread")
                || s.contains("not started") || s.contains("want") || s.contains("planned")) {
            return ReadingStatus.TO_READ;
        }
        if (s.contains("reading") || s.contains("progress") || s.contains("current")) {
            return ReadingStatus.READING;
        }
        return ReadingStatus.UNKNOWN;
    }
}
