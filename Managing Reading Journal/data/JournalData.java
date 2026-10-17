import java.util.ArrayList;

/**
 * Stores all the journal entries while the program is running.
 * <p>
 * This is the data layer of the Managing Reading Journal use case. It keeps the entries in an
 * {@link ArrayList} and hands out a new ID for every entry it stores, starting from 1, so no two
 * entries share an ID. It does not check whether the data makes sense, that is done by
 * {@code JournalManager} in the business layer before anything reaches this class.
 * </p>
 * @author Khadija Saeed Albasri 202200734
 */
public class JournalData {
    private ArrayList<JournalEntry> entries;
    private int nextEntryId;

    /**
     * Creates an empty journal. The first entry stored will get the ID 1.
     */
    public JournalData() {
        entries = new ArrayList<>();
        nextEntryId = 1;
    }

    /**
     * Creates a new entry with the next available ID and stores it.
     *
     * @param bookTitle the title of the book the entry is about
     * @param notes the notes and thoughts, or an empty string
     * @param review the review, or an empty string
     * @param rating the star rating, or 0 if there is none
     * @return the entry that was stored, including its new ID
     */
    public JournalEntry addEntry(String bookTitle, String notes, String review, int rating) {
        JournalEntry entry = new JournalEntry(nextEntryId, bookTitle, notes, review, rating);
        entries.add(entry);
        nextEntryId++;
        return entry;
    }

    /**
     * Finds an entry by its ID.
     *
     * @param entryId the ID of the entry to look for
     * @return the matching entry, or null if no entry has that ID
     */
    public JournalEntry getEntry(int entryId) {
        for (JournalEntry entry : entries) {
            if (entry.getEntryId() == entryId) {
                return entry;
            }
        }
        return null;
    }

    /**
     * Returns every entry in the journal. A copy of the list is returned so that other classes
     * cannot add or remove entries without going through this class.
     *
     * @return a copy of the list of all entries, in the order they were written
     */
    public ArrayList<JournalEntry> getAllEntries() {
        return new ArrayList<>(entries);
    }

    /**
     * Removes an entry from the journal. Its ID is not reused.
     *
     * @param entryId the ID of the entry to remove
     * @return true if the entry was found and removed, false if no entry has that ID
     */
    public boolean deleteEntry(int entryId) {
        JournalEntry entry = getEntry(entryId);
        if (entry == null) {
            return false;
        }
        entries.remove(entry);
        return true;
    }

    /**
     * Returns how many entries are stored.
     *
     * @return the number of entries in the journal
     */
    public int getEntryCount() {
        return entries.size();
    }
}
