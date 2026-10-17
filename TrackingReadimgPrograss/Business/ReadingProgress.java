public class ReadingProgress {

    private String bookTitle; // Stores the title of the book.
    private int totalPages; // Stores the total number of pages in the book.
    private int currentPage; // Stores the current page reached by the reader.

    // Initializes the book information.
    public ReadingProgress(String bookTitle, int totalPages) {
        // Ensure that the total number of pages is valid.
        if (totalPages <= 0) {
            throw new IllegalArgumentException("Total pages must be greater than zero.");
        }

        // Initialize the book's title and total pages.
        this.bookTitle = bookTitle;
        this.totalPages = totalPages;

        // Reading progress starts at page zero.
        this.currentPage = 0;
    }

    // Updates the current page after checking its validity.
    public void updateCurrentPage(int page) {
        // Validate the page number before updating progress.
        if (page < 0 || page > totalPages) {
            throw new IllegalArgumentException("Page must be between 0 and " + totalPages);
        }

        // Update the current page if the value is valid.
        currentPage = page;
    }

    // Calculates and returns the reading progress percentage.
    public double getProgressPercentage() {
        // Convert to double to allow decimal division.
        return (double) currentPage / totalPages * 100;
    }

    // Calculates the number of remaining pages.
    public int getRemainingPages() {
        // Subtract the current page from the total pages.
        return totalPages - currentPage;
    }

    // Returns the book title.
    public String getBookTitle() {
        return bookTitle;
    }

    // Returns the total number of pages.
    public int getTotalPages() {
        return totalPages;
    }

    // Returns the current page.
    public int getCurrentPage() {
        return currentPage;
    }
}

