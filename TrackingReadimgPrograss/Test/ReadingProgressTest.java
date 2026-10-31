import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReadingProgressTest {

    // Tests that a book is initialized with the correct information.
    @Test
    public void testBookInitialization() {
        ReadingProgress book = new ReadingProgress("Java", 100);

        // Check the book title, total pages, and initial current page.
        assertEquals("Java", book.getBookTitle());
        assertEquals(100, book.getTotalPages());
        assertEquals(0, book.getCurrentPage());
    }

    // Tests that the current reading page can be updated.
    @Test
    public void testUpdateCurrentPage() {
        ReadingProgress book = new ReadingProgress("Java", 100);

        // Update the current page to a valid page number.
        book.updateCurrentPage(40);

        // Check that the current page was updated correctly.
        assertEquals(40, book.getCurrentPage());
    }

    // Tests that the reading progress percentage is calculated correctly.
    @Test
    public void testProgressPercentage() {
        ReadingProgress book = new ReadingProgress("Java", 100);
        book.updateCurrentPage(40);

        // Check that reading 40 out of 100 pages gives 40 percent.
        assertEquals(40.0, book.getProgressPercentage(), 0.001);
    }

    // Tests that the number of remaining pages is calculated correctly.
    @Test
    public void testRemainingPages() {
        ReadingProgress book = new ReadingProgress("Java", 100);
        book.updateCurrentPage(40);

        // Check that 60 pages remain unread.
        assertEquals(60, book.getRemainingPages());
    }

    // Tests that a book cannot have zero total pages.
    @Test
    public void testInvalidTotalPages() {

        // Verify that an IllegalArgumentException is thrown.
        assertThrows(IllegalArgumentException.class, () -> {
            new ReadingProgress("Java", 0);
        });
    }

    // Tests that the current page cannot exceed the total pages.
    @Test
    public void testInvalidCurrentPage() {
        ReadingProgress book = new ReadingProgress("Java", 100);

        // Verify that updating to page 101 throws an exception.
        assertThrows(IllegalArgumentException.class, () -> {
            book.updateCurrentPage(101);
        });
    }

    // Tests that the progress is correct when the book is completed.
    @Test
    public void testReadingCompleted() {
        ReadingProgress book = new ReadingProgress("Java", 100);

        // Mark all pages as read.
        book.updateCurrentPage(100);

        // Check that progress is 100% and no pages remain.
        assertEquals(100.0, book.getProgressPercentage(), 0.001);
        assertEquals(0, book.getRemainingPages());
    }
}

