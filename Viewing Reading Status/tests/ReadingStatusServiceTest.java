import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Tests for ReadingStatusService (the business layer).
// The data layer is replaced by a small stub that returns a fixed list of records,
// so these tests check only the business rules and do not depend on teammates' classes.
class ReadingStatusServiceTest {

    // ---------- helpers ----------

    // Builds a service whose data layer always returns the given records.
    private static ReadingStatusService serviceWith(ReadingStatusRecord... records) {
        ReadingStatusData stub = new ReadingStatusData(null, null) {
            @Override
            public List<ReadingStatusRecord> loadAllRecords() {
                return new ArrayList<>(Arrays.asList(records));
            }
        };
        return new ReadingStatusService(stub);
    }

    // A record that has a reading-progress entry.
    private static ReadingStatusRecord withProgress(String title, String storedStatus, int total, int current) {
        return new ReadingStatusRecord(title, "Author", "Genre", storedStatus, total, current, true);
    }

    // A record that has no reading-progress entry (only the status text from Managing Books).
    private static ReadingStatusRecord withoutProgress(String title, String storedStatus) {
        return new ReadingStatusRecord(title, "Author", "Genre", storedStatus, 0, 0, false);
    }

    // ---------- constructor ----------

    // The service must refuse a null data layer.
    @Test
    void constructorRejectsNullData() {
        assertThrows(IllegalArgumentException.class, () -> new ReadingStatusService(null));
    }

    // ---------- determineStatus ----------

    // Rule 1: with progress and page 0, the book is still "To Read".
    @Test
    void determineStatusProgressAtZeroIsToRead() {
        ReadingStatusService service = serviceWith();
        assertEquals(ReadingStatus.TO_READ, service.determineStatus(withProgress("A", "Finished", 100, 0)));
    }

    // Rule 1: with progress somewhere between 0 and the last page, the book is "Reading".
    @Test
    void determineStatusProgressInTheMiddleIsReading() {
        ReadingStatusService service = serviceWith();
        assertEquals(ReadingStatus.READING, service.determineStatus(withProgress("A", "To Read", 100, 50)));
        assertEquals(ReadingStatus.READING, service.determineStatus(withProgress("A", "To Read", 100, 1)));
        assertEquals(ReadingStatus.READING, service.determineStatus(withProgress("A", "To Read", 100, 99)));
    }

    // Rule 1: reaching the last page means "Finished".
    @Test
    void determineStatusProgressAtTotalIsFinished() {
        ReadingStatusService service = serviceWith();
        assertEquals(ReadingStatus.FINISHED, service.determineStatus(withProgress("A", "Reading", 100, 100)));
    }

    // Rule 1: a current page beyond the total is still treated as finished.
    @Test
    void determineStatusProgressBeyondTotalIsFinished() {
        ReadingStatusService service = serviceWith();
        assertEquals(ReadingStatus.FINISHED, service.determineStatus(withProgress("A", "Reading", 100, 150)));
    }

    // Rule 2: with no progress record, the stored status text decides.
    @Test
    void determineStatusWithoutProgressUsesStoredText() {
        ReadingStatusService service = serviceWith();
        assertEquals(ReadingStatus.FINISHED, service.determineStatus(withoutProgress("A", "Finished")));
        assertEquals(ReadingStatus.READING, service.determineStatus(withoutProgress("A", "reading")));
        assertEquals(ReadingStatus.TO_READ, service.determineStatus(withoutProgress("A", "To Read")));
    }

    // Rule 2 also applies when a progress record exists but its total pages is 0 (no usable page info).
    @Test
    void determineStatusProgressWithZeroTotalFallsBackToStoredText() {
        ReadingStatusService service = serviceWith();
        ReadingStatusRecord record = new ReadingStatusRecord("A", "Author", "Genre", "Finished", 0, 0, true);
        assertEquals(ReadingStatus.FINISHED, service.determineStatus(record));
    }

    // A null stored status with no progress cannot be understood, so the result is UNKNOWN.
    @Test
    void determineStatusWithoutProgressAndNullTextIsUnknown() {
        ReadingStatusService service = serviceWith();
        assertEquals(ReadingStatus.UNKNOWN, service.determineStatus(withoutProgress("A", null)));
    }

    // ---------- parseStatusText ----------

    // A null text gives UNKNOWN (no exception).
    @Test
    void parseStatusTextNullIsUnknown() {
        assertEquals(ReadingStatus.UNKNOWN, serviceWith().parseStatusText(null));
    }

    // Empty, blank, and unrelated text give UNKNOWN.
    @Test
    void parseStatusTextUnrecognisedIsUnknown() {
        ReadingStatusService service = serviceWith();
        assertEquals(ReadingStatus.UNKNOWN, service.parseStatusText(""));
        assertEquals(ReadingStatus.UNKNOWN, service.parseStatusText("   "));
        assertEquals(ReadingStatus.UNKNOWN, service.parseStatusText("xyz"));
    }

    // Words meaning "finished" are recognised, in any letter case.
    @Test
    void parseStatusTextFinishedWords() {
        ReadingStatusService service = serviceWith();
        assertEquals(ReadingStatus.FINISHED, service.parseStatusText("Finished"));
        assertEquals(ReadingStatus.FINISHED, service.parseStatusText("completed"));
        assertEquals(ReadingStatus.FINISHED, service.parseStatusText("COMPLETE"));
        assertEquals(ReadingStatus.FINISHED, service.parseStatusText("done"));
        assertEquals(ReadingStatus.FINISHED, service.parseStatusText("  DONE  "));
    }

    // Words meaning "not started" are recognised. "to read" must not be mistaken for "reading".
    @Test
    void parseStatusTextToReadWords() {
        ReadingStatusService service = serviceWith();
        assertEquals(ReadingStatus.TO_READ, service.parseStatusText("To Read"));
        assertEquals(ReadingStatus.TO_READ, service.parseStatusText("to-read"));
        assertEquals(ReadingStatus.TO_READ, service.parseStatusText("unread"));
        assertEquals(ReadingStatus.TO_READ, service.parseStatusText("Not Started"));
        assertEquals(ReadingStatus.TO_READ, service.parseStatusText("want to read"));
        assertEquals(ReadingStatus.TO_READ, service.parseStatusText("planned"));
    }

    // Words meaning "in progress" are recognised.
    @Test
    void parseStatusTextReadingWords() {
        ReadingStatusService service = serviceWith();
        assertEquals(ReadingStatus.READING, service.parseStatusText("Reading"));
        assertEquals(ReadingStatus.READING, service.parseStatusText("currently reading"));
        assertEquals(ReadingStatus.READING, service.parseStatusText("In Progress"));
        assertEquals(ReadingStatus.READING, service.parseStatusText("current"));
    }

    // ---------- calculateProgressPercent ----------

    // A null record is invalid input.
    @Test
    void calculateProgressPercentNullRecordThrows() {
        assertThrows(IllegalArgumentException.class, () -> serviceWith().calculateProgressPercent(null));
    }

    // No page information (total 0) gives 0.0 instead of dividing by zero.
    @Test
    void calculateProgressPercentZeroTotalIsZero() {
        assertEquals(0.0, serviceWith().calculateProgressPercent(withoutProgress("A", "Reading")), 0.0001);
    }

    // Normal cases: start, middle, decimal result, and end.
    @Test
    void calculateProgressPercentNormalValues() {
        ReadingStatusService service = serviceWith();
        assertEquals(0.0, service.calculateProgressPercent(withProgress("A", null, 200, 0)), 0.0001);
        assertEquals(25.0, service.calculateProgressPercent(withProgress("A", null, 200, 50)), 0.0001);
        assertEquals(43.2692, service.calculateProgressPercent(withProgress("A", null, 208, 90)), 0.001);
        assertEquals(100.0, service.calculateProgressPercent(withProgress("A", null, 200, 200)), 0.0001);
    }

    // ---------- viewAllBooks ----------

    // An empty data layer gives an empty list.
    @Test
    void viewAllBooksEmptyData() {
        assertTrue(serviceWith().viewAllBooks().isEmpty());
    }

    // Every returned record must already have its final status decided.
    @Test
    void viewAllBooksDecidesEachStatus() {
        ReadingStatusService service = serviceWith(
                withProgress("A", "Finished", 100, 0),   // progress wins -> To Read
                withProgress("B", "To Read", 100, 50),   // -> Reading
                withProgress("C", "Reading", 100, 100),  // -> Finished
                withoutProgress("D", "reading"),         // text -> Reading
                withoutProgress("E", "???"));            // -> Unknown

        List<ReadingStatusRecord> result = service.viewAllBooks();

        assertEquals(5, result.size());
        assertEquals(ReadingStatus.TO_READ, result.get(0).getStatus());
        assertEquals(ReadingStatus.READING, result.get(1).getStatus());
        assertEquals(ReadingStatus.FINISHED, result.get(2).getStatus());
        assertEquals(ReadingStatus.READING, result.get(3).getStatus());
        assertEquals(ReadingStatus.UNKNOWN, result.get(4).getStatus());
    }

    // ---------- viewBooksByStatus ----------

    // A null status is invalid input.
    @Test
    void viewBooksByStatusNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> serviceWith().viewBooksByStatus(null));
    }

    // Only the books with the requested status are returned.
    @Test
    void viewBooksByStatusFiltersCorrectly() {
        ReadingStatusService service = serviceWith(
                withProgress("A", null, 100, 100),
                withProgress("B", null, 100, 50),
                withoutProgress("C", "To Read"),
                withProgress("D", null, 100, 100));

        List<ReadingStatusRecord> finished = service.viewBooksByStatus(ReadingStatus.FINISHED);
        assertEquals(2, finished.size());
        assertEquals("A", finished.get(0).getTitle());
        assertEquals("D", finished.get(1).getTitle());

        List<ReadingStatusRecord> reading = service.viewBooksByStatus(ReadingStatus.READING);
        assertEquals(1, reading.size());
        assertEquals("B", reading.get(0).getTitle());
    }

    // When no book matches, the result is an empty list (not null).
    @Test
    void viewBooksByStatusNoMatchIsEmpty() {
        ReadingStatusService service = serviceWith(withProgress("A", null, 100, 100));
        assertTrue(service.viewBooksByStatus(ReadingStatus.TO_READ).isEmpty());
    }

    // ---------- viewBookDetails ----------

    // A null title is invalid.
    @Test
    void viewBookDetailsNullTitleThrows() {
        assertThrows(IllegalArgumentException.class, () -> serviceWith().viewBookDetails(null));
    }

    // An empty or blank title is invalid and gives the "must not be empty" message.
    @Test
    void viewBookDetailsBlankTitleThrows() {
        ReadingStatusService service = serviceWith(withProgress("Dune", null, 100, 10));
        IllegalArgumentException e1 = assertThrows(IllegalArgumentException.class, () -> service.viewBookDetails(""));
        IllegalArgumentException e2 = assertThrows(IllegalArgumentException.class, () -> service.viewBookDetails("   "));
        assertEquals("Title must not be empty.", e1.getMessage());
        assertEquals("Title must not be empty.", e2.getMessage());
    }

    // The search ignores letter case and surrounding spaces, and returns the record with its status set.
    @Test
    void viewBookDetailsFindsBookIgnoringCaseAndSpaces() {
        ReadingStatusService service = serviceWith(
                withProgress("Dune", null, 400, 400),
                withProgress("Emma", null, 300, 10));

        ReadingStatusRecord found = service.viewBookDetails("  dUnE  ");

        assertEquals("Dune", found.getTitle());
        assertEquals(ReadingStatus.FINISHED, found.getStatus());
    }

    // A title that does not exist gives the "Book not found." error.
    @Test
    void viewBookDetailsUnknownTitleThrows() {
        ReadingStatusService service = serviceWith(withProgress("Dune", null, 400, 10));
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> service.viewBookDetails("Missing Book"));
        assertEquals("Book not found.", e.getMessage());
    }

    // ---------- countBooksByStatus ----------

    // Counts books per status.
    @Test
    void countBooksByStatusCountsMatches() {
        ReadingStatusService service = serviceWith(
                withProgress("A", null, 100, 100),
                withProgress("B", null, 100, 50),
                withProgress("C", null, 100, 60),
                withoutProgress("D", "To Read"),
                withoutProgress("E", "???"));

        assertEquals(1, service.countBooksByStatus(ReadingStatus.TO_READ));
        assertEquals(2, service.countBooksByStatus(ReadingStatus.READING));
        assertEquals(1, service.countBooksByStatus(ReadingStatus.FINISHED));
        assertEquals(1, service.countBooksByStatus(ReadingStatus.UNKNOWN));
    }

    // With no books at all, every count is 0.
    @Test
    void countBooksByStatusEmptyIsZero() {
        assertEquals(0, serviceWith().countBooksByStatus(ReadingStatus.FINISHED));
    }
}
