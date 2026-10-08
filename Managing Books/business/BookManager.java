
public class BookManager {

    private Book[] books;
    private int BookCount;

    public BookManager() {
        books = new Book[100];
        BookCount = 0;
    }

    public void AddBook(int bookId, String title, String author, String genre, String status) {
        if (BookCount < books.length) {
            Book newBook = new Book(bookId, title, author, genre, status);
            books[BookCount] = newBook;
            BookCount++;

        }
    }

    public Book[] getAllBooks() {
        return books;
    }

    public int getBookCount() {
        return BookCount;
    }
    public boolean UpdateBook(int bookId, String newTitle, String newAuthor, String newGenre, String newStatus) {
        for (int i = 0; i < BookCount; i++) {
            if (books[i].getBookID() == bookId) {
                books[i].setTitle(newTitle);
                books[i].setAuthor(newAuthor);
                books[i].setGenre(newGenre);
                books[i].setStatus(newStatus);
                return true;
            }
        }
        return false;
    }
    public boolean DeleteBook(int bookId) {
        for (int i = 0; i < BookCount; i++) {
            if (books[i].getBookID() == bookId) {

                books[i] = books[BookCount - 1];
                books[BookCount - 1] = null;
                BookCount--;

                return true;
            }
        }
        return false;
    }

}


