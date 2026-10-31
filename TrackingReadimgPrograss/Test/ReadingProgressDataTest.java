import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReadingProgressDataTest {

    // Tests that a new book can be added successfully.
    @Test
    public void testAddBook() {
        ReadingProgressData data = new ReadingProgressData();
        ReadingProgress book = new ReadingProgress("Java", 100);

        // Verify that adding the book returns true.
        assertTrue(data.addBook(book));
    }

    // Tests that duplicate book titles are rejected.
    @Test
    public void testDuplicateBook() {
        ReadingProgressData data = new ReadingProgressData();

        ReadingProgress firstBook =
                new ReadingProgress("Java", 100);
        ReadingProgress secondBook =
                new ReadingProgress("JAVA", 200);

        // Verify that the first book is added successfully.
        assertTrue(data.addBook(firstBook));

        // Verify that the duplicate title is rejected.
        assertFalse(data.addBook(secondBook));
    }

    // Tests that a book can be retrieved using its title.
    @Test
    public void testGetProgress() {
        ReadingProgressData data = new ReadingProgressData();
        ReadingProgress book = new ReadingProgress("Java", 100);

        // Add the book before searching for it.
        data.addBook(book);

        // Verify that the retrieved object is the same book.
        assertSame(book, data.getProgress("Java"));
    }

    // Tests that book searches are case-insensitive.
    @Test
    public void testGetProgressCaseInsensitive() {
        ReadingProgressData data = new ReadingProgressData();
        ReadingProgress book = new ReadingProgress("Java", 100);

        // Add the book to the data collection.
        data.addBook(book);

        // Search using uppercase and lowercase titles.
        assertSame(book, data.getProgress("JAVA"));
        assertSame(book, data.getProgress("java"));
    }

    // Tests searching for a book that does not exist.
    @Test
    public void testGetProgressForMissingBook() {
        ReadingProgressData data = new ReadingProgressData();

        // Verify that a missing book returns null.
        assertNull(data.getProgress("Python"));
    }

    // Tests that all added books are returned.
    @Test
    public void testGetAllBooks() {
        ReadingProgressData data = new ReadingProgressData();

        // Add two different books.
        data.addBook(new ReadingProgress("Java", 100));
        data.addBook(new ReadingProgress("Python", 200));

        // Verify that the collection contains two books.
        assertEquals(2, data.getAllBooks().size());
    }

    // Tests that the collection is empty initially.
    @Test
    public void testGetAllBooksWhenEmpty() {
        ReadingProgressData data = new ReadingProgressData();

        // Verify that no books are returned before adding any.
        assertTrue(data.getAllBooks().isEmpty());
    }
}
