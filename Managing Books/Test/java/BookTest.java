 import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
        @Test
        public void testBookConstructorAndGetters() {
         // Step 1: Create a new Book object with test data using the constructor
            Book book = new Book(1, "Pride and Prejudice", "Jane Austen", "Classic", "Reading");
         // Step 2: Assert that all getters correctly return the values passed into the constructor
            assertEquals(1, book.getBookID());
            assertEquals("Pride and Prejudice", book.getTitle());
            assertEquals("Jane Austen", book.getAuthor());
            assertEquals("Classic", book.getGenre());
            assertEquals("Reading", book.getStatus());
        }

        @Test
        public void testBookSetters() {
         // Step 1: Initialize a Book object with initial placeholder data
            Book book = new Book(1, "Old Title", "Old Author", "Old Genre", "Wishlist");
         // Step 2: Update each field using the setter methods
            book.setBookID(2);
            book.setTitle("Crime and Punishment");
            book.setAuthor("Fyodor Dostoevsky");
            book.setGenre("Psychological Fiction");
            book.setStatus("Completed");
         
         // Step 3: Assert that the getters now return the newly updated values
            assertEquals(2, book.getBookID());
            assertEquals("Crime and Punishment", book.getTitle());
            assertEquals("Fyodor Dostoevsky", book.getAuthor());
            assertEquals("Psychological Fiction", book.getGenre());
            assertEquals("Completed", book.getStatus());
        }
    }

