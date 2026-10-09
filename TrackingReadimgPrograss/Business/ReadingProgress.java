public class ReadingProgress {

    private String bookTitle;
    private int totalPages;
    private int currentPage;

    public ReadingProgress(String bookTitle, int totalPages) {
        if (totalPages <= 0) {
            throw new IllegalArgumentException("Total pages must be greater than zero.");
        }

        this.bookTitle = bookTitle;
        this.totalPages = totalPages;
        this.currentPage = 0;
    }

    public void updateCurrentPage(int page) {
        if (page < 0 || page > totalPages) {
            throw new IllegalArgumentException("Page must be between 0 and " + totalPages);
        }

        currentPage = page;
    }

    public double getProgressPercentage() {
        return (double) currentPage / totalPages * 100;
    }

    public int getRemainingPages() {
        return totalPages - currentPage;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }
}

