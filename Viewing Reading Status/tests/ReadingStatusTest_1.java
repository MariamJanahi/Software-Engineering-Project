import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Tests for the ReadingStatus constants class.
// These constants are compared by the business layer and printed by the presentation layer,
// so their exact text matters.
class ReadingStatusTest {

    // Each constant must hold the exact text that the rest of the use case expects.
    @Test
    void constantsHaveExpectedText() {
        assertEquals("To Read", ReadingStatus.TO_READ);
        assertEquals("Currently Reading", ReadingStatus.READING);
        assertEquals("Finished", ReadingStatus.FINISHED);
        assertEquals("Unknown", ReadingStatus.UNKNOWN);
    }

    // No two constants may share the same text, otherwise filtering and counting would mix statuses.
    @Test
    void constantsAreAllDifferent() {
        Set<String> values = new HashSet<>(Arrays.asList(
                ReadingStatus.TO_READ, ReadingStatus.READING,
                ReadingStatus.FINISHED, ReadingStatus.UNKNOWN));
        assertEquals(4, values.size());
    }
}
