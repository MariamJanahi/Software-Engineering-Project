// this class is about managing books that includes adding , updating , deleting and retriving book records using a fixed size array .
public class BookManager {
// array to store the books .
    private Book[] books;
    
// to track and count the number of books stored in the array .
    private int BookCount;
    
//Constructing a new BookManager with a default capacity of 100 books and initializing the book count to zero.
    public BookManager() {
        books = new Book[100];
        BookCount = 0;
    }
    
// adding a new book to the maneger if there is avalible capacity .
    public void AddBook(int bookId, String title, String author, String genre, String status) {
    // only adding if the array is not full .
        if (BookCount < books.length) {
            Book newBook = new Book(bookId, title, author, genre, status);
            books[BookCount] = newBook;
            BookCount++;

        }
    }
// returns the all the books in the array .
    public Book[] getAllBooks() {
        return books;
    }

// returns the current number of books maneged in the array .
    public int getBookCount() {
        return BookCount;
    }

// updates the details of an existing book found by its ID . 
    public boolean UpdateBook(int bookId, String newTitle, String newAuthor, String newGenre, String newStatus) {
        // searching for the book bt its ID .
        for (int i = 0; i < BookCount; i++) {
            if (books[i].getBookID() == bookId) {
                books[i].setTitle(newTitle);
                books[i].setAuthor(newAuthor);
                books[i].setGenre(newGenre);
                books[i].setStatus(newStatus);
                return true; // update successful . 
            }
        }
        return false;  // book not found .
    }

// deletes a book by its ID .
    public boolean DeleteBook(int bookId) {
        for (int i = 0; i < BookCount; i++) {
            if (books[i].getBookID() == bookId) {
            // replace the deleted book with the last active book in the array .
                books[i] = books[BookCount - 1];
            // empty the last spot since it was moved .
                books[BookCount - 1] = null;
            // reduce the total book count .
                BookCount--;

                return true;  // deletion successful .
            }
        }
        return false; // book not found .
    }

}


