 import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BookManagerTest {
    private BookManager manager;

    @BeforeEach
    public void setUp() {
        manager = new BookManager();
    }

    @Test
    public void testInitialState() {
        assertEquals(0, manager.getBookCount());
        assertNotNull(manager.getAllBooks());
    }

    @Test
    public void testAddBook() {
        manager.AddBook(101, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", "Reading");
        assertEquals(1, manager.getBookCount());

        Book[] books = manager.getAllBooks();
        assertEquals("The Lord of the Rings", books[0].getTitle());
        assertEquals(101, books[0].getBookID());
    }

    @Test
    public void testUpdateBookSuccessAndFailure() {
        manager.AddBook(101, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", "Reading");

        // Test successful update
        boolean updated = manager.UpdateBook(101, "To Kill a Mockingbird", "Harper Lee", "Classic Fiction", "Completed");
        assertTrue(updated);

        Book[] books = manager.getAllBooks();
        assertEquals("To Kill a Mockingbird", books[0].getTitle());
        assertEquals("Completed", books[0].getStatus());

        // Test updating non-existent book ID
        boolean failedUpdate = manager.UpdateBook(999, "Fake Title", "Author", "Genre", "Status");
        assertFalse(failedUpdate);
    }

    @Test
    public void testDeleteBookWithArraySwap() {
        // Add multiple books to test your last-element swap deletion logic
        manager.AddBook(1, "Pride and Prejudice", "Jane Austen", "Classic", "Reading");
        manager.AddBook(2, "Crime and Punishment", "Fyodor Dostoevsky", "Psychological Fiction", "Wishlist");
        manager.AddBook(3, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", "Completed");

        assertEquals(3, manager.getBookCount());

        // Delete the first book (should trigger the swap with Book Three / LOTR)
        boolean deleted = manager.DeleteBook(1);
        assertTrue(deleted);
        assertEquals(2, manager.getBookCount());

        // Verify The Lord of the Rings moved into index 0's spot
        Book[] books = manager.getAllBooks();
        assertEquals(3, books[0].getBookID());
        assertEquals("The Lord of the Rings", books[0].getTitle());
        assertNull(books[2]); // Last spot should now be cleared

        // Test deleting non-existent book ID
        boolean failedDelete = manager.DeleteBook(999);
        assertFalse(failedDelete);
    }
}
