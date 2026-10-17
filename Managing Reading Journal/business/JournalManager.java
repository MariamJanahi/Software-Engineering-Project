import java.util.ArrayList;

/**
 * Handles the rules of the Managing Reading Journal use case.
 * <p>
 * This is the business layer. The presentation layer calls this class to add, edit and delete
 * journal entries. Before anything is saved in {@link JournalData}, this class checks it:
 * </p>
 * <ul>
 *     <li>the book title cannot be empty</li>
 *     <li>an entry needs at least one of notes, a review or a rating</li>
 *     <li>a rating must be a whole number from 1 to 5</li>
 *     <li>a part can be removed from an entry, but the entry has to keep at least one part
 *     (to remove everything, the entry should be deleted instead)</li>
 * </ul>
 * <p>
 * Breaking a rule throws an {@link IllegalArgumentException} with a message that can be shown to
 * the user. Using an entry ID that does not exist is not treated as an error, the method returns
 * false or null instead.
 * </p>
 * @author Khadija Saeed Albasri 202200734
 */
public class JournalManager {
    public static final int MIN_RATING = 1;
    public static final int MAX_RATING = 5;
    public static final int NO_RATING = 0;

    private JournalData data;

    /**
     * Creates a manager with a new, empty journal. This is the constructor the menu uses.
     */
    public JournalManager() {
        this(new JournalData());
    }

    /**
     * Creates a manager that works on a journal passed in from outside. This is mainly for the
     * JUnit tests, so a test can set up a journal and then check what the manager did to it.
     *
     * @param data the journal to read from and save to
     */
    public JournalManager(JournalData data) {
        this.data = data;
    }

    /**
     * Adds a new journal entry about a book. Notes, review and rating are each optional, but at
     * least one of them has to be given.
     *
     * @param bookTitle the title of the book
     * @param notes the reader's notes and thoughts, or null or empty to leave them out
     * @param review the review, or null or empty to leave it out
     * @param rating the star rating from 1 to 5, or {@link #NO_RATING} to leave it out
     * @return the saved entry, including its ID
     * @throws IllegalArgumentException if the title is empty, nothing was filled in,
     *                                  or the rating is not 0 or 1 to 5
     */
    public JournalEntry addEntry(String bookTitle, String notes, String review, int rating) {
        checkText(bookTitle, "Book title");

        // Null is treated the same as leaving the field empty
        String cleanNotes = (notes == null) ? "" : notes.trim();
        String cleanReview = (review == null) ? "" : review.trim();

        if (rating != NO_RATING) {
            checkRating(rating);
        }
        if (cleanNotes.isEmpty() && cleanReview.isEmpty() && rating == NO_RATING) {
            throw new IllegalArgumentException("A journal entry needs at least a note, a review or a rating.");
        }
        return data.addEntry(bookTitle.trim(), cleanNotes, cleanReview, rating);
    }

    /**
     * Replaces the notes of an entry.
     *
     * @param entryId the ID of the entry
     * @param newNotes the new notes
     * @return true if the notes were changed, false if no entry has that ID
     * @throws IllegalArgumentException if the new notes are empty
     */
    public boolean editNotes(int entryId, String newNotes) {
        JournalEntry entry = data.getEntry(entryId);
        if (entry == null) {
            return false;
        }
        checkText(newNotes, "Notes");
        entry.setNotes(newNotes.trim());
        return true;
    }

    /**
     * Replaces the review of an entry.
     *
     * @param entryId the ID of the entry
     * @param newReview the new review
     * @return true if the review was changed, false if no entry has that ID
     * @throws IllegalArgumentException if the new review is empty
     */
    public boolean editReview(int entryId, String newReview) {
        JournalEntry entry = data.getEntry(entryId);
        if (entry == null) {
            return false;
        }
        checkText(newReview, "Review");
        entry.setReview(newReview.trim());
        return true;
    }

    /**
     * Replaces the star rating of an entry.
     *
     * @param entryId the ID of the entry
     * @param newRating the new rating from 1 to 5
     * @return true if the rating was changed, false if no entry has that ID
     * @throws IllegalArgumentException if the rating is not 1 to 5
     */
    public boolean editRating(int entryId, int newRating) {
        JournalEntry entry = data.getEntry(entryId);
        if (entry == null) {
            return false;
        }
        checkRating(newRating);
        entry.setRating(newRating);
        return true;
    }

    /**
     * Removes the notes from an entry.
     *
     * @param entryId the ID of the entry
     * @return true if the notes were removed, false if no entry has that ID
     * @throws IllegalArgumentException if the entry has no notes, or the notes are the only part left
     */
    public boolean removeNotes(int entryId) {
        JournalEntry entry = data.getEntry(entryId);
        if (entry == null) {
            return false;
        }
        checkCanRemove(entry, entry.hasNotes(), "notes");
        entry.setNotes("");
        return true;
    }

    /**
     * Removes the review from an entry.
     *
     * @param entryId the ID of the entry
     * @return true if the review was removed, false if no entry has that ID
     * @throws IllegalArgumentException if the entry has no review, or the review is the only part left
     */
    public boolean removeReview(int entryId) {
        JournalEntry entry = data.getEntry(entryId);
        if (entry == null) {
            return false;
        }
        checkCanRemove(entry, entry.hasReview(), "review");
        entry.setReview("");
        return true;
    }

    /**
     * Removes the rating from an entry.
     *
     * @param entryId the ID of the entry
     * @return true if the rating was removed, false if no entry has that ID
     * @throws IllegalArgumentException if the entry has no rating, or the rating is the only part left
     */
    public boolean removeRating(int entryId) {
        JournalEntry entry = data.getEntry(entryId);
        if (entry == null) {
            return false;
        }
        checkCanRemove(entry, entry.hasRating(), "rating");
        entry.setRating(NO_RATING);
        return true;
    }

    /**
     * Deletes an entry from the journal.
     *
     * @param entryId the ID of the entry to delete
     * @return true if the entry was deleted, false if no entry has that ID
     */
    public boolean deleteEntry(int entryId) {
        return data.deleteEntry(entryId);
    }

    /**
     * Finds an entry by its ID.
     *
     * @param entryId the ID of the entry
     * @return the entry, or null if no entry has that ID
     */
    public JournalEntry getEntry(int entryId) {
        return data.getEntry(entryId);
    }

    /**
     * Returns every entry in the journal.
     *
     * @return all entries in the order they were written, empty if there are none
     */
    public ArrayList<JournalEntry> getAllEntries() {
        return data.getAllEntries();
    }

    /**
     * Returns how many entries are in the journal.
     *
     * @return the number of entries
     */
    public int getEntryCount() {
        return data.getEntryCount();
    }

    /**
     * Makes sure some text was given.
     *
     * @param text the text to check
     * @param label what the text is, used in the error message (for example "Review")
     * @throws IllegalArgumentException if the text is null or only spaces
     */
    private void checkText(String text, String label) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException(label + " cannot be empty.");
        }
    }

    /**
     * Makes sure a part can be removed from an entry: the entry has to have that part, and it
     * cannot be the only part left.
     *
     * @param entry the entry the part is being removed from
     * @param hasPart whether the entry has the part
     * @param partName the name of the part, used in the error message (for example "review")
     * @throws IllegalArgumentException if the part is missing or it is the last part of the entry
     */
    private void checkCanRemove(JournalEntry entry, boolean hasPart, String partName) {
        if (!hasPart) {
            throw new IllegalArgumentException("This entry has no " + partName + " to remove.");
        }
        int parts = 0;
        if (entry.hasNotes()) {
            parts++;
        }
        if (entry.hasReview()) {
            parts++;
        }
        if (entry.hasRating()) {
            parts++;
        }
        if (parts == 1) {
            throw new IllegalArgumentException("An entry needs at least one part. Delete the entry instead.");
        }
    }

    /**
     * Makes sure a rating is between {@link #MIN_RATING} and {@link #MAX_RATING}.
     *
     * @param rating the rating to check
     * @throws IllegalArgumentException if the rating is outside 1 to 5
     */
    private void checkRating(int rating) {
        if (rating < MIN_RATING || rating > MAX_RATING) {
            throw new IllegalArgumentException("Rating must be between " + MIN_RATING + " and " + MAX_RATING + ".");
        }
    }
}
