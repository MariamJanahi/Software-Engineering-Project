import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// DATA LAYER for the Viewing Reading Status use case.
// Only reads data: books from Mariam's BookManager and progress from Aisha's
// ReadingProgressData, then joins them by title (ignoring upper/lower case).
public class ReadingStatusData {
    private final BookManager bookManager;          // source of book details
    private final ReadingProgressData progressData; // source of reading progress

    // Creates the data layer with the two existing data sources.
    public ReadingStatusData(BookManager bookManager, ReadingProgressData progressData) {
        this.bookManager = bookManager;
        this.progressData = progressData;
    }

    // Loads every book and joins it with its reading progress (if any).
    // Books that exist only in the progress data are included too.
    public List<ReadingStatusRecord> loadAllRecords() {
        List<ReadingStatusRecord> records = new ArrayList<>();
        Set<String> usedTitles = new HashSet<>(); // titles already added (lower case)

        // 1) Books from the Managing Books use case.
        Book[] books = bookManager.getAllBooks();
        int count = bookManager.getBookCount(); // only the first "count" slots hold books
        for (int i = 0; i < count; i++) {
            Book book = books[i];
            ReadingProgress progress = progressData.getProgress(book.getTitle()); // null if none
            if (progress == null) {
                records.add(new ReadingStatusRecord(book.getTitle(), book.getAuthor(),
                        book.getGenre(), book.getStatus(), 0, 0, false));
            } else {
                records.add(new ReadingStatusRecord(book.getTitle(), book.getAuthor(),
                        book.getGenre(), book.getStatus(),
                        progress.getTotalPages(), progress.getCurrentPage(), true));
            }
            usedTitles.add(book.getTitle().toLowerCase());
        }

        // 2) Books that only exist in the Tracking Reading Progress data.
        for (ReadingProgress progress : progressData.getAllBooks()) {
            if (!usedTitles.contains(progress.getBookTitle().toLowerCase())) {
                records.add(new ReadingStatusRecord(progress.getBookTitle(), "N/A", "N/A", null,
                        progress.getTotalPages(), progress.getCurrentPage(), true));
            }
        }
        return records;
    }
}
