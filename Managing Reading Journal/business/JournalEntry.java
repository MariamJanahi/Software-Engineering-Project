import java.time.LocalDate;

/**
 * Represents one entry in the reading journal.
 * <p>
 * This is the entity of the Managing Reading Journal use case, so it belongs to the business layer.
 * {@link JournalStorage} in the data layer stores these objects, and {@link JournalManager} decides
 * what is allowed to change in them.
 * </p>
 * <p>
 * An entry is about one book, identified by its title, and is dated the day it was written.
 * It can hold the reader's notes and thoughts, a review, a star rating from 1 to 5, or any mix
 * of the three. At least one of them is always filled in, this is checked by
 * {@code JournalManager} before the entry is created. A book can have many entries, for example
 * a few notes while reading and a review with a rating at the end.
 * </p>
 * <p>
 * The entry ID is given by {@link JournalStorage} when the entry is stored, so the entry can be
 * found again later to edit or delete it.
 * </p>
 * @author Khadija Saeed Albasri 202200734
 */
public class JournalEntry {
    private int entryId;
    private String bookTitle;
    private String notes;
    private String review;
    private int rating;
    private LocalDate dateWritten;
    private LocalDate dateEdited;

    /**
     * Creates a journal entry dated today. The date edited starts as null because the entry
     * has not been edited yet.
     *
     * @param entryId the unique ID given to this entry by {@link JournalStorage}
     * @param bookTitle the title of the book the entry is about
     * @param notes the reader's notes and thoughts, or an empty string if there are none
     * @param review the review of the book, or an empty string if there is none
     * @param rating the star rating from 1 to 5, or 0 if the book was not rated in this entry
     */
    public JournalEntry(int entryId, String bookTitle, String notes, String review, int rating) {
        this.entryId = entryId;
        this.bookTitle = bookTitle;
        this.notes = notes;
        this.review = review;
        this.rating = rating;
        this.dateWritten = LocalDate.now();
        this.dateEdited = null;
    }

    /**
     * Returns the unique ID of this entry.
     *
     * @return the entry ID
     */
    public int getEntryId() {
        return entryId;
    }

    /**
     * Returns the title of the book this entry is about.
     *
     * @return the book title
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Returns the reader's notes and thoughts.
     *
     * @return the notes, or an empty string if there are none
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Replaces the notes and records today as the date the entry was edited.
     *
     * @param notes the new notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
        this.dateEdited = LocalDate.now();
    }

    /**
     * Returns the review of the book.
     *
     * @return the review, or an empty string if there is none
     */
    public String getReview() {
        return review;
    }

    /**
     * Replaces the review and records today as the date the entry was edited.
     *
     * @param review the new review
     */
    public void setReview(String review) {
        this.review = review;
        this.dateEdited = LocalDate.now();
    }

    /**
     * Returns the star rating of the book.
     *
     * @return a rating from 1 to 5, or 0 if the book was not rated in this entry
     */
    public int getRating() {
        return rating;
    }

    /**
     * Replaces the star rating and records today as the date the entry was edited.
     *
     * @param rating the new rating from 1 to 5
     */
    public void setRating(int rating) {
        this.rating = rating;
        this.dateEdited = LocalDate.now();
    }

    /**
     * Returns the date the entry was written.
     *
     * @return the date written
     */
    public LocalDate getDateWritten() {
        return dateWritten;
    }

    /**
     * Returns the date the entry was last edited.
     *
     * @return the date edited, or null if the entry was never edited
     */
    public LocalDate getDateEdited() {
        return dateEdited;
    }

    /**
     * Checks whether the entry has notes.
     *
     * @return true if the entry has notes
     */
    public boolean hasNotes() {
        return !notes.isEmpty();
    }

    /**
     * Checks whether the entry has a review.
     *
     * @return true if the entry has a review
     */
    public boolean hasReview() {
        return !review.isEmpty();
    }

    /**
     * Checks whether the entry has a rating.
     *
     * @return true if the entry has a rating from 1 to 5
     */
    public boolean hasRating() {
        return rating != 0;
    }
}
