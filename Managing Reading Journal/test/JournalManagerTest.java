import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link JournalManager}, the business layer that holds all the journal rules.
 * <p>
 * Each rule is tested both ways: that valid input is saved, and that breaking the rule throws an
 * {@link IllegalArgumentException} and leaves the journal unchanged. The manager is given its own
 * {@link JournalStorage} so the tests can check what actually got stored.
 * </p>
 * @author Khadija Saeed Albasri 202200734
 */
public class JournalManagerTest {
    private JournalStorage storage;
    private JournalManager manager;

    // Creates new storage and a manager that uses it before each test.
    @BeforeEach
    public void setUp() {
        storage = new JournalStorage();
        manager = new JournalManager(storage);
    }

    // ---------- Adding entries ----------

    // Tests that an entry with only notes is saved.
    @Test
    public void testAddEntryWithNotesOnly() {
        JournalEntry entry = manager.addEntry("Dune", "Spice everywhere", "", JournalManager.NO_RATING);

        assertEquals(1, storage.getEntryCount());
        assertTrue(entry.hasNotes());
        assertFalse(entry.hasReview());
        assertFalse(entry.hasRating());
    }

    // Tests that an entry with only a review and a rating is saved.
    @Test
    public void testAddEntryWithReviewAndRating() {
        JournalEntry entry = manager.addEntry("Dune", "", "Worth it", 4);

        assertFalse(entry.hasNotes());
        assertEquals("Worth it", entry.getReview());
        assertEquals(4, entry.getRating());
    }

    // Tests that an entry with only a rating is saved.
    @Test
    public void testAddEntryWithRatingOnly() {
        JournalEntry entry = manager.addEntry("Dune", "", "", 3);

        assertEquals(3, entry.getRating());
        assertEquals(1, storage.getEntryCount());
    }

    // Tests that spaces at the start and end of the title and text are removed before saving.
    @Test
    public void testAddEntryTrimsSpaces() {
        JournalEntry entry = manager.addEntry("  Dune  ", "  A note  ", "  A review  ", 5);

        assertEquals("Dune", entry.getBookTitle());
        assertEquals("A note", entry.getNotes());
        assertEquals("A review", entry.getReview());
    }

    // Tests that null notes and review are treated the same as leaving them empty.
    @Test
    public void testAddEntryTreatsNullAsEmpty() {
        JournalEntry entry = manager.addEntry("Dune", null, null, 2);

        assertEquals("", entry.getNotes());
        assertEquals("", entry.getReview());
        assertEquals(2, entry.getRating());
    }

    // Tests that the lowest and highest allowed ratings (1 and 5) are accepted.
    @Test
    public void testAddEntryAcceptsRatingLimits() {
        assertEquals(1, manager.addEntry("Dune", "", "", JournalManager.MIN_RATING).getRating());
        assertEquals(5, manager.addEntry("Emma", "", "", JournalManager.MAX_RATING).getRating());
    }

    // Tests that an empty title is rejected and nothing is saved.
    @Test
    public void testAddEntryRejectsEmptyTitle() {
        assertThrows(IllegalArgumentException.class, () -> manager.addEntry("", "A note", "", 0));
        assertEquals(0, storage.getEntryCount());
    }

    // Tests that a title made only of spaces is rejected.
    @Test
    public void testAddEntryRejectsBlankTitle() {
        assertThrows(IllegalArgumentException.class, () -> manager.addEntry("   ", "A note", "", 0));
        assertEquals(0, storage.getEntryCount());
    }

    // Tests that a null title is rejected.
    @Test
    public void testAddEntryRejectsNullTitle() {
        assertThrows(IllegalArgumentException.class, () -> manager.addEntry(null, "A note", "", 0));
        assertEquals(0, storage.getEntryCount());
    }

    // Tests that an entry with no notes, no review and no rating is rejected.
    @Test
    public void testAddEntryRejectsEmptyEntry() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> manager.addEntry("Dune", "", "   ", JournalManager.NO_RATING));

        assertEquals("A journal entry needs at least a note, a review or a rating.", e.getMessage());
        assertEquals(0, storage.getEntryCount());
    }

    // Tests that a rating above 5 is rejected.
    @Test
    public void testAddEntryRejectsRatingTooHigh() {
        assertThrows(IllegalArgumentException.class, () -> manager.addEntry("Dune", "A note", "", 6));
        assertEquals(0, storage.getEntryCount());
    }

    // Tests that a negative rating is rejected.
    @Test
    public void testAddEntryRejectsNegativeRating() {
        assertThrows(IllegalArgumentException.class, () -> manager.addEntry("Dune", "A note", "", -1));
        assertEquals(0, storage.getEntryCount());
    }

    // ---------- Editing entries ----------

    // Tests that the notes of an entry can be changed.
    @Test
    public void testEditNotes() {
        manager.addEntry("Dune", "Old note", "", 0);

        assertTrue(manager.editNotes(1, "New note"));
        assertEquals("New note", manager.getEntry(1).getNotes());
    }

    // Tests that a review can be changed, and also added to an entry that didn't have one.
    @Test
    public void testEditReview() {
        manager.addEntry("Dune", "A note", "", 0);

        assertTrue(manager.editReview(1, "A new review"));
        assertEquals("A new review", manager.getEntry(1).getReview());
    }

    // Tests that the rating of an entry can be changed.
    @Test
    public void testEditRating() {
        manager.addEntry("Dune", "", "", 2);

        assertTrue(manager.editRating(1, 5));
        assertEquals(5, manager.getEntry(1).getRating());
    }

    // Tests that editing an entry that does not exist returns false.
    @Test
    public void testEditMissingEntryReturnsFalse() {
        assertFalse(manager.editNotes(99, "A note"));
        assertFalse(manager.editReview(99, "A review"));
        assertFalse(manager.editRating(99, 3));
    }

    // Tests that changing the notes to empty text is rejected and the old notes are kept.
    @Test
    public void testEditNotesRejectsEmpty() {
        manager.addEntry("Dune", "Keep me", "", 0);

        assertThrows(IllegalArgumentException.class, () -> manager.editNotes(1, " "));
        assertEquals("Keep me", manager.getEntry(1).getNotes());
    }

    // Tests that changing the review to empty text is rejected and the old review is kept.
    @Test
    public void testEditReviewRejectsEmpty() {
        manager.addEntry("Dune", "", "Keep me", 0);

        assertThrows(IllegalArgumentException.class, () -> manager.editReview(1, ""));
        assertEquals("Keep me", manager.getEntry(1).getReview());
    }

    // Tests that changing the rating to a number outside 1 to 5 is rejected and the old rating is kept.
    @Test
    public void testEditRatingRejectsOutOfRange() {
        manager.addEntry("Dune", "", "", 3);

        assertThrows(IllegalArgumentException.class, () -> manager.editRating(1, 0));
        assertThrows(IllegalArgumentException.class, () -> manager.editRating(1, 9));
        assertEquals(3, manager.getEntry(1).getRating());
    }

    // ---------- Removing parts ----------

    // Tests that a part can be removed when the entry still has another part.
    @Test
    public void testRemovePartWhenOthersRemain() {
        manager.addEntry("Dune", "A note", "A review", 4);

        assertTrue(manager.removeRating(1));
        assertTrue(manager.removeReview(1));

        JournalEntry entry = manager.getEntry(1);
        assertTrue(entry.hasNotes());
        assertFalse(entry.hasReview());
        assertFalse(entry.hasRating());
    }

    // Tests that the notes can be removed when a rating is left.
    @Test
    public void testRemoveNotes() {
        manager.addEntry("Dune", "A note", "", 4);

        assertTrue(manager.removeNotes(1));
        assertFalse(manager.getEntry(1).hasNotes());
    }

    // Tests that the last part of an entry cannot be removed, and the entry is left as it was.
    @Test
    public void testCannotRemoveLastPart() {
        manager.addEntry("Dune", "Only part", "", 0);

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> manager.removeNotes(1));

        assertEquals("An entry needs at least one part. Delete the entry instead.", e.getMessage());
        assertEquals("Only part", manager.getEntry(1).getNotes());
    }

    // Tests that removing a part the entry doesn't have is rejected.
    @Test
    public void testCannotRemoveMissingPart() {
        manager.addEntry("Dune", "A note", "", 0);

        assertThrows(IllegalArgumentException.class, () -> manager.removeReview(1));
        assertThrows(IllegalArgumentException.class, () -> manager.removeRating(1));
    }

    // Tests that removing a part from an entry that does not exist returns false.
    @Test
    public void testRemoveFromMissingEntryReturnsFalse() {
        assertFalse(manager.removeNotes(99));
        assertFalse(manager.removeReview(99));
        assertFalse(manager.removeRating(99));
    }

    // ---------- Deleting and reading entries ----------

    // Tests that deleting an entry removes it from the journal.
    @Test
    public void testDeleteEntry() {
        manager.addEntry("Dune", "A note", "", 0);

        assertTrue(manager.deleteEntry(1));
        assertNull(manager.getEntry(1));
        assertEquals(0, manager.getEntryCount());
    }

    // Tests that deleting an entry that does not exist returns false.
    @Test
    public void testDeleteMissingEntryReturnsFalse() {
        assertFalse(manager.deleteEntry(99));
    }

    // Tests that the count and the list of entries match what was added.
    @Test
    public void testCountAndListOfEntries() {
        manager.addEntry("Dune", "A note", "", 0);
        manager.addEntry("Dune", "", "A review", 5);

        assertEquals(2, manager.getEntryCount());
        assertEquals(2, manager.getAllEntries().size());
    }

    // Tests that the default constructor starts with an empty journal.
    @Test
    public void testDefaultConstructorStartsEmpty() {
        JournalManager freshManager = new JournalManager();

        assertEquals(0, freshManager.getEntryCount());
    }
}
