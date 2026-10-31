import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Tests for ReadingStatusRecord (the object that joins book details with reading progress).
class ReadingStatusRecordTest {

    // The constructor must keep every value it receives, and the getters must return them.
    @Test
    void constructorStoresAllValues() {
        ReadingStatusRecord record = new ReadingStatusRecord(
                "Dune", "Frank Herbert", "Sci-Fi", "Reading", 400, 100, true);

        assertEquals("Dune", record.getTitle());
        assertEquals("Frank Herbert", record.getAuthor());
        assertEquals("Sci-Fi", record.getGenre());
        assertEquals("Reading", record.getStoredStatus());
        assertEquals(400, record.getTotalPages());
        assertEquals(100, record.getCurrentPage());
        assertTrue(record.hasProgress());
    }

    // Before the business layer decides, a new record must have the UNKNOWN status.
    @Test
    void statusStartsAsUnknown() {
        ReadingStatusRecord record = new ReadingStatusRecord(
                "Dune", "Frank Herbert", "Sci-Fi", "Reading", 400, 100, true);

        assertEquals(ReadingStatus.UNKNOWN, record.getStatus());
    }

    // setStatus must replace the current status, and it can be changed more than once.
    @Test
    void setStatusChangesTheStatus() {
        ReadingStatusRecord record = new ReadingStatusRecord(
                "Dune", "Frank Herbert", "Sci-Fi", "Reading", 400, 100, true);

        record.setStatus(ReadingStatus.READING);
        assertEquals(ReadingStatus.READING, record.getStatus());

        record.setStatus(ReadingStatus.FINISHED);
        assertEquals(ReadingStatus.FINISHED, record.getStatus());
    }

    // A book with no progress record has zero pages and hasProgress() is false.
    @Test
    void recordWithoutProgressHasZeroPages() {
        ReadingStatusRecord record = new ReadingStatusRecord(
                "Clean Code", "Robert C. Martin", "Technology", "To Read", 0, 0, false);

        assertFalse(record.hasProgress());
        assertEquals(0, record.getTotalPages());
        assertEquals(0, record.getCurrentPage());
    }

    // The stored status may be null (a book that exists only in the progress data).
    @Test
    void nullStoredStatusIsAllowed() {
        ReadingStatusRecord record = new ReadingStatusRecord(
                "Dune", "N/A", "N/A", null, 400, 10, true);

        assertNull(record.getStoredStatus());
    }
}
