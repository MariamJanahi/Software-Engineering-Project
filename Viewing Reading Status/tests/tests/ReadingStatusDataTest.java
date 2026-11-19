import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Tests for ReadingStatusData (the data layer).
// It uses the real BookManager and ReadingProgressData (both only keep data in memory),
// so these tests also check that the join between the two sources works.
class ReadingStatusDataTest {
    private BookManager bookManager;          // teammate's source of books
    private ReadingProgressData progressData; // teammate's source of progress

    // Start every test with two empty data sources.
    @BeforeEach
    void setUp() {
        bookManager = new BookManager();
        progressData = new ReadingProgressData();
    }

    // Builds the data layer from the current data sources.
    private ReadingStatusData data() {
        return new ReadingStatusData(bookManager, progressData);
    }

    // With no books and no progress, nothing is loaded.
    @Test
    void loadAllRecordsWithNoDataIsEmpty() {
        assertTrue(data().loadAllRecords().isEmpty());
    }

    // A book with no progress record becomes a record with hasProgress=false and zero pages.
    @Test
    void bookWithoutProgressHasNoProgress() {
        bookManager.AddBook(1, "Clean Code", "Robert C. Martin", "Technology", "To Read");

        List<ReadingStatusRecord> records = data().loadAllRecords();

        assertEquals(1, records.size());
        ReadingStatusRecord r = records.get(0);
        assertEquals("Clean Code", r.getTitle());
        assertEquals("Robert C. Martin", r.getAuthor());
        assertEquals("Technology", r.getGenre());
        assertEquals("To Read", r.getStoredStatus());
        assertFalse(r.hasProgress());
        assertEquals(0, r.getTotalPages());
        assertEquals(0, r.getCurrentPage());
    }

    // A book that has a progress record gets its pages copied in.
    @Test
    void bookWithProgressCopiesPages() {
        bookManager.AddBook(1, "The Alchemist", "Paulo Coelho", "Fiction", "Reading");
        ReadingProgress p = new ReadingProgress("The Alchemist", 208);
        p.updateCurrentPage(90);
        progressData.addBook(p);

        List<ReadingStatusRecord> records = data().loadAllRecords();

        assertEquals(1, records.size());
        ReadingStatusRecord r = records.get(0);
        assertTrue(r.hasProgress());
        assertEquals(208, r.getTotalPages());
        assertEquals(90, r.getCurrentPage());
        assertEquals("Paulo Coelho", r.getAuthor());
    }

    // Titles are joined ignoring upper/lower case, and the book is not listed twice.
    @Test
    void titleMatchingIgnoresCaseAndHasNoDuplicates() {
        bookManager.AddBook(1, "Clean Code", "Robert C. Martin", "Technology", "Reading");
        ReadingProgress p = new ReadingProgress("clean code", 450);
        p.updateCurrentPage(45);
        progressData.addBook(p);

        List<ReadingStatusRecord> records = data().loadAllRecords();

        assertEquals(1, records.size());
        assertTrue(records.get(0).hasProgress());
        assertEquals(45, records.get(0).getCurrentPage());
    }

    // A book that exists only in the progress data is still included, with "N/A" details and no stored status.
    @Test
    void progressOnlyBookIsIncluded() {
        ReadingProgress p = new ReadingProgress("Dune", 400);
        p.updateCurrentPage(100);
        progressData.addBook(p);

        List<ReadingStatusRecord> records = data().loadAllRecords();

        assertEquals(1, records.size());
        ReadingStatusRecord r = records.get(0);
        assertEquals("Dune", r.getTitle());
        assertEquals("N/A", r.getAuthor());
        assertEquals("N/A", r.getGenre());
        assertNull(r.getStoredStatus());
        assertTrue(r.hasProgress());
        assertEquals(400, r.getTotalPages());
        assertEquals(100, r.getCurrentPage());
    }

    // Managed books come first (in order), then books that exist only in the progress data.
    @Test
    void booksComeBeforeProgressOnlyBooks() {
        bookManager.AddBook(1, "First", "A", "G", "Reading");
        bookManager.AddBook(2, "Second", "B", "G", "To Read");
        progressData.addBook(new ReadingProgress("Third", 100));

        List<ReadingStatusRecord> records = data().loadAllRecords();

        assertEquals(3, records.size());
        assertEquals("First", records.get(0).getTitle());
        assertEquals("Second", records.get(1).getTitle());
        assertEquals("Third", records.get(2).getTitle());
    }

    // Empty slots of the BookManager array must be ignored, including after a book is deleted.
    @Test
    void deletedBooksAreNotLoaded() {
        bookManager.AddBook(1, "Keep", "A", "G", "Reading");
        bookManager.AddBook(2, "Remove", "B", "G", "Reading");
        bookManager.DeleteBook(2);

        List<ReadingStatusRecord> records = data().loadAllRecords();

        assertEquals(1, records.size());
        assertEquals("Keep", records.get(0).getTitle());
    }

    // Loading must reflect the data at the moment it is called (it does not cache old results).
    @Test
    void loadAllRecordsReflectsLaterChanges() {
        ReadingStatusData layer = data();
        assertEquals(0, layer.loadAllRecords().size());

        bookManager.AddBook(1, "New Book", "A", "G", "To Read");

        assertEquals(1, layer.loadAllRecords().size());
    }
}
