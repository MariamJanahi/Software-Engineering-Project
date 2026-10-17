// represnting a single book entity  with it details . 
public class Book {
 // book attributes .  
    private int BookID;
    private String Title ;
    private String Author;
    private String Genre;
    private String Status;

// constructor to initialize a new book object . 
    public Book(int bookId , String title , String author , String genre, String status){
        this.BookID = bookId;
        this.Title = title;
        this.Author = author;
        this.Genre = genre;
        this.Status = status;
    }

// getters and setter .
    public int getBookID() {
        return BookID;
    }
    public void setBookID(int bookID) {
        this.BookID = bookID ;
    }
    public String getTitle() {
        return Title ;
    }
    public void setTitle (String title) {
        this.Title = title ;
    }
    public String getAuthor() {
        return Author ;
    }
    public void setAuthor(String author) {
        this.Author = author ;
    }
    public String getGenre (){
        return Genre ;
    }

    public void setGenre(String genre) {
        this.Genre = genre ;
    }
    public String getStatus() {
        return Status ;
    }

    public void setStatus(String status) {
        this.Status = status;
    }
}
