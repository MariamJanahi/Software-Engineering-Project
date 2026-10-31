import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Tests for ReadingStatusMain (the entry point).
// The keyboard (System.in) is replaced with simulated input and the console output is captured,
// so the whole program (data -> business -> presentation) is run end to end.
class ReadingStatusMainTest {
    private InputStream originalIn;       // the real keyboard input, restored after each test
    private PrintStream originalOut;      // the real console output, restored after each test
    private Locale originalLocale;        // the real default locale, restored after each test
    private ByteArrayOutputStream output; // collects everything the program prints

    // Capture the console output and use US number formatting.
    @BeforeEach
    void setUp() {
        originalIn = System.in;
        originalOut = System.out;
        originalLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    // Put the keyboard, console, and locale back to normal.
    @AfterEach
    void tearDown() {
        System.setIn(originalIn);
        System.setOut(originalOut);
        Locale.setDefault(originalLocale);
    }

    // Runs main() with the given simulated keyboard input and returns what it printed.
    private String runMain(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ReadingStatusMain.main(new String[0]);
        return output.toString();
    }

    // The program starts, shows the menu, and exits cleanly when 0 is chosen.
    @Test
    void programStartsAndExits() {
        String out = runMain("0\n");

        assertTrue(out.contains("=== Viewing Reading Status ==="));
        assertTrue(out.contains("Leaving Reading Status."));
    }

    // The sample books loaded by main() are visible through the menu.
    @Test
    void sampleBooksAreLoaded() {
        String out = runMain("1\n0\n");

        assertTrue(out.contains("Atomic Habits by James Clear | Finished | Progress: 100.0%"));
        assertTrue(out.contains("The Alchemist by Paulo Coelho | Currently Reading | Progress: 43.3%"));
        assertTrue(out.contains("Clean Code by Robert C. Martin | To Read | Progress: 0.0%"));
        assertTrue(out.contains("1984 by George Orwell | Currently Reading | Progress: 0.0%"));
    }

    // The summary of the sample data: 1 To Read, 2 Reading, 1 Finished.
    @Test
    void sampleSummaryIsCorrect() {
        String out = runMain("4\n0\n");

        assertTrue(out.contains("To Read: 1"));
        assertTrue(out.contains("Currently Reading: 2"));
        assertTrue(out.contains("Finished: 1"));
    }
}
