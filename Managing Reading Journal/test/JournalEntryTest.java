import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link JournalEntry}, the class that holds one journal entry.
 * <p>
 * These check that an entry keeps the values it was created with, records the right dates,
 * and reports correctly which parts (notes, review, rating) it has.
 * </p>
 * @author Khadija Saeed Albasri 202200734
 */
public class JournalEntryTest {

    // Tests that the constructor stores every value it is given.
    @Test
    public void testConstructorStoresValues() {
        JournalEntry entry = new JournalEntry(3, "Dune", "Spice everywhere", "Worth it", 4);

        assertEquals(3, entry.getEntryId());
        assertEquals("Dune", entry.getBookTitle());
        assertEquals("Spice everywhere", entry.getNotes());
        assertEquals("Worth it", entry.getReview());
        assertEquals(4, entry.getRating());
    }

    // Tests that a new entry is dated today and has not been edited yet.
    @Test
    public void testNewEntryDates() {
        JournalEntry entry = new JournalEntry(1, "Dune", "A note", "", 0);

        assertEquals(LocalDate.now(), entry.getDateWritten());
        assertNull(entry.getDateEdited());
    }

    // Tests that changing the notes updates them and records the edit date.
    @Test
    public void testSetNotesRecordsEditDate() {
        JournalEntry entry = new JournalEntry(1, "Dune", "Old note", "", 0);

        entry.setNotes("New note");

        assertEquals("New note", entry.getNotes());
        assertEquals(LocalDate.now(), entry.getDateEdited());
    }

    // Tests that changing the review updates it and records the edit date.
    @Test
    public void testSetReviewRecordsEditDate() {
        JournalEntry entry = new JournalEntry(1, "Dune", "", "Old review", 0);

        entry.setReview("New review");

        assertEquals("New review", entry.getReview());
        assertEquals(LocalDate.now(), entry.getDateEdited());
    }

    // Tests that changing the rating updates it and records the edit date.
    @Test
    public void testSetRatingRecordsEditDate() {
        JournalEntry entry = new JournalEntry(1, "Dune", "", "", 2);

        entry.setRating(5);

        assertEquals(5, entry.getRating());
        assertEquals(LocalDate.now(), entry.getDateEdited());
    }

    // Tests that an entry with all three parts reports having each of them.
    @Test
    public void testHasAllParts() {
        JournalEntry entry = new JournalEntry(1, "Dune", "A note", "A review", 3);

        assertTrue(entry.hasNotes());
        assertTrue(entry.hasReview());
        assertTrue(entry.hasRating());
    }

    // Tests that an entry with only notes reports not having a review or rating.
    @Test
    public void testHasOnlyNotes() {
        JournalEntry entry = new JournalEntry(1, "Dune", "A note", "", 0);

        assertTrue(entry.hasNotes());
        assertFalse(entry.hasReview());
        assertFalse(entry.hasRating());
    }

    // Tests that removing a part (setting it back to empty or 0) makes the entry stop reporting it.
    @Test
    public void testPartsCanBeCleared() {
        JournalEntry entry = new JournalEntry(1, "Dune", "A note", "A review", 3);

        entry.setReview("");
        entry.setRating(0);

        assertTrue(entry.hasNotes());
        assertFalse(entry.hasReview());
        assertFalse(entry.hasRating());
    }
}
