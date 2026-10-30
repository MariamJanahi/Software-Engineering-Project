import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import static org.junit.jupiter.api.Assertions.*;

public class mainTest {

    // Tests that selecting option 5 displays the exit message.
    @Test
    public void testExitMessage() {
        // Save the original input and output streams.
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        // Capture the program's printed output.
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            // Simulate the user entering option 5.
            System.setIn(new ByteArrayInputStream(
                    "5\n".getBytes(StandardCharsets.UTF_8)));

            // Redirect console output to the test output stream.
            System.setOut(new PrintStream(output));

            // Run the main program.
            main.main(new String[0]);

            // Verify that the exit message is displayed.
            assertTrue(output.toString(StandardCharsets.UTF_8)
                    .contains("Goodbye!"));

        } finally {
            // Restore the original input and output streams.
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    // Tests that an invalid menu choice displays an error message.
    @Test
    public void testInvalidMenuChoice() {
        // Save the original input and output streams.
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        // Capture the program's printed output.
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            // Simulate entering an invalid choice followed by exit.
            System.setIn(new ByteArrayInputStream(
                    "9\n5\n".getBytes(StandardCharsets.UTF_8)));

            // Redirect console output to the test output stream.
            System.setOut(new PrintStream(output));

            // Run the main program.
            main.main(new String[0]);

            // Verify that the invalid-choice message is displayed.
            assertTrue(output.toString(StandardCharsets.UTF_8)
                    .contains("Invalid choice. Choose from 1 to 5."));

        } finally {
            // Restore the original input and output streams.
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }
}
