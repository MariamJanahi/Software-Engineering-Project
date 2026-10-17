// Combines one book's details (from Mariam's Book) with its reading progress
// (from Aisha's ReadingProgress) so the status can be viewed in one place.
public class ReadingStatusRecord {
    private final String title;        // book title
    private final String author;       // book author ("N/A" if not stored)
    private final String genre;        // book genre ("N/A" if not stored)
    private final String storedStatus; // free-text status typed in Managing Books (may be null)
    private final int totalPages;      // total pages (0 if no progress record exists)
    private final int currentPage;     // pages reached so far
    private final boolean hasProgress; // true if a reading-progress record exists for this book
    private String status;             // final status text, decided by the business layer

    // Creates a record. The status starts as UNKNOWN until the business layer sets it.
    public ReadingStatusRecord(String title, String author, String genre, String storedStatus,
                               int totalPages, int currentPage, boolean hasProgress) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.storedStatus = storedStatus;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
        this.hasProgress = hasProgress;
        this.status = ReadingStatus.UNKNOWN;
    }

    // Returns the book title.
    public String getTitle() { return title; }

    // Returns the book author.
    public String getAuthor() { return author; }

    // Returns the book genre.
    public String getGenre() { return genre; }

    // Returns the status text saved by the Managing Books use case.
    public String getStoredStatus() { return storedStatus; }

    // Returns the total number of pages (0 if unknown).
    public int getTotalPages() { return totalPages; }

    // Returns the current page reached.
    public int getCurrentPage() { return currentPage; }

    // Returns true if a reading-progress record exists for this book.
    public boolean hasProgress() { return hasProgress; }

    // Returns the final reading status text (one of the ReadingStatus constants).
    public String getStatus() { return status; }

    // Sets the final reading status (called by the business layer).
    public void setStatus(String status) { this.status = status; }
}
