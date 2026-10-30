import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import data.Book;
public class BookTest {
        @Test
        public void testBookConstructorAndGetters() {
            Book book = new Book(1, "Pride and Prejudice", "Jane Austen", "Classic", "Reading");

            assertEquals(1, book.getBookID());
            assertEquals("Pride and Prejudice", book.getTitle());
            assertEquals("Jane Austen", book.getAuthor());
            assertEquals("Classic", book.getGenre());
            assertEquals("Reading", book.getStatus());
        }

        @Test
        public void testBookSetters() {
            Book book = new Book(1, "Old Title", "Old Author", "Old Genre", "Wishlist");

            book.setBookID(2);
            book.setTitle("Crime and Punishment");
            book.setAuthor("Fyodor Dostoevsky");
            book.setGenre("Psychological Fiction");
            book.setStatus("Completed");

            assertEquals(2, book.getBookID());
            assertEquals("Crime and Punishment", book.getTitle());
            assertEquals("Fyodor Dostoevsky", book.getAuthor());
            assertEquals("Psychological Fiction", book.getGenre());
            assertEquals("Completed", book.getStatus());
        }
    }

