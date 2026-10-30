 import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BookManagerTest {
    private BookManager manager;

    @BeforeEach
    public void setUp() {
     // Initialize a fresh BookManager instance before each test runs
        manager = new BookManager();
    }

    @Test
    public void testInitialState() {
     // Assert that a newly created manager has 0 books and a non-null array container
        assertEquals(0, manager.getBookCount());
        assertNotNull(manager.getAllBooks());
    }

    @Test
    public void testAddBook() {
     // Step 1: Add a new book to the manager
        manager.AddBook(101, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", "Reading");
        assertEquals(1, manager.getBookCount());
     
     // Step 2: Verify that the book's details are correctly stored at index 0
        Book[] books = manager.getAllBooks();
        assertEquals("The Lord of the Rings", books[0].getTitle());
        assertEquals(101, books[0].getBookID());
    }

    @Test
    public void testUpdateBookSuccessAndFailure() {
     // Set up initial book data
        manager.AddBook(101, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", "Reading");

     // Step 1: Test successful update with a valid book ID  
     boolean updated = manager.UpdateBook(101, "To Kill a Mockingbird", "Harper Lee", "Classic Fiction", "Completed");
        assertTrue(updated);
     
     // Verify the book details were successfully modified
        Book[] books = manager.getAllBooks();
        assertEquals("To Kill a Mockingbird", books[0].getTitle());
        assertEquals("Completed", books[0].getStatus());

// Step 2: Test updating a non-existent book ID (should fail)
     boolean failedUpdate = manager.UpdateBook(999, "Fake Title", "Author", "Genre", "Status");
        assertFalse(failedUpdate);
    }

    @Test
    public void testDeleteBookWithArraySwap() {
// Step 1: Add multiple books to test your last-element swap deletion logic
     manager.AddBook(1, "Pride and Prejudice", "Jane Austen", "Classic", "Reading");
        manager.AddBook(2, "Crime and Punishment", "Fyodor Dostoevsky", "Psychological Fiction", "Wishlist");
        manager.AddBook(3, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", "Completed");

        assertEquals(3, manager.getBookCount());

        // Step 2: Delete the first book (should trigger the swap with Book Three / LOTR)
        boolean deleted = manager.DeleteBook(1);
        assertTrue(deleted);
        assertEquals(2, manager.getBookCount());

        // Step 3: Verify The Lord of the Rings moved into index 0's spot and the tail is cleared
        Book[] books = manager.getAllBooks();
        assertEquals(3, books[0].getBookID());
        assertEquals("The Lord of the Rings", books[0].getTitle());
        assertNull(books[2]); // Last spot should now be cleared

        // Step 4: Test deleting a non-existent book ID (should fail)
        boolean failedDelete = manager.DeleteBook(999);
        assertFalse(failedDelete);
    }
}
