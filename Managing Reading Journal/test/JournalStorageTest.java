import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link JournalStorage}, the data layer that stores all the journal entries.
 * <p>
 * These check that entries are stored and found correctly, that IDs start at 1 and are never
 * reused, and that other classes cannot change the stored list without going through this class.
 * </p>
 * @author Khadija Saeed Albasri 202200734
 */
public class JournalStorageTest {
    private JournalStorage storage;

    // Creates new, empty storage before each test so the tests don't affect each other.
    @BeforeEach
    public void setUp() {
        storage = new JournalStorage();
    }

    // Tests that new storage starts with no entries.
    @Test
    public void testNewStorageIsEmpty() {
        assertEquals(0, storage.getEntryCount());
        assertTrue(storage.getAllEntries().isEmpty());
    }

    // Tests that the first entry gets ID 1 and each new entry gets the next ID.
    @Test
    public void testIdsStartAtOneAndIncrease() {
        JournalEntry first = storage.addEntry("Dune", "A note", "", 0);
        JournalEntry second = storage.addEntry("The Hobbit", "", "A review", 4);

        assertEquals(1, first.getEntryId());
        assertEquals(2, second.getEntryId());
        assertEquals(2, storage.getEntryCount());
    }

    // Tests that an added entry keeps the values it was given.
    @Test
    public void testAddEntryStoresValues() {
        JournalEntry entry = storage.addEntry("Dune", "A note", "A review", 5);

        assertEquals("Dune", entry.getBookTitle());
        assertEquals("A note", entry.getNotes());
        assertEquals("A review", entry.getReview());
        assertEquals(5, entry.getRating());
    }

    // Tests that an entry can be found again by its ID.
    @Test
    public void testGetEntryFindsById() {
        storage.addEntry("Dune", "A note", "", 0);
        JournalEntry hobbit = storage.addEntry("The Hobbit", "Another note", "", 0);

        assertSame(hobbit, storage.getEntry(2));
    }

    // Tests that looking up an ID that does not exist returns null.
    @Test
    public void testGetEntryMissingIdReturnsNull() {
        storage.addEntry("Dune", "A note", "", 0);

        assertNull(storage.getEntry(99));
    }

    // Tests that deleting an entry removes it and returns true.
    @Test
    public void testDeleteEntry() {
        storage.addEntry("Dune", "A note", "", 0);

        assertTrue(storage.deleteEntry(1));
        assertNull(storage.getEntry(1));
        assertEquals(0, storage.getEntryCount());
    }

    // Tests that deleting an ID that does not exist returns false and changes nothing.
    @Test
    public void testDeleteMissingEntryReturnsFalse() {
        storage.addEntry("Dune", "A note", "", 0);

        assertFalse(storage.deleteEntry(99));
        assertEquals(1, storage.getEntryCount());
    }

    // Tests that a deleted entry's ID is not given to the next new entry.
    @Test
    public void testIdsAreNotReusedAfterDelete() {
        storage.addEntry("Dune", "A note", "", 0);
        storage.addEntry("The Hobbit", "A note", "", 0);
        storage.deleteEntry(2);

        JournalEntry next = storage.addEntry("Emma", "A note", "", 0);

        assertEquals(3, next.getEntryId());
    }

    // Tests that entries are returned in the order they were added.
    @Test
    public void testEntriesKeepTheirOrder() {
        storage.addEntry("Dune", "A note", "", 0);
        storage.addEntry("The Hobbit", "A note", "", 0);
        storage.addEntry("Emma", "A note", "", 0);

        ArrayList<JournalEntry> all = storage.getAllEntries();

        assertEquals("Dune", all.get(0).getBookTitle());
        assertEquals("The Hobbit", all.get(1).getBookTitle());
        assertEquals("Emma", all.get(2).getBookTitle());
    }

    // Tests that changing the list returned by getAllEntries does not change what is stored.
    @Test
    public void testGetAllEntriesReturnsACopy() {
        storage.addEntry("Dune", "A note", "", 0);

        ArrayList<JournalEntry> copy = storage.getAllEntries();
        copy.clear();

        assertEquals(1, storage.getEntryCount());
    }
}
