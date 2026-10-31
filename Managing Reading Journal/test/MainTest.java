import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link Main}, the console menu of the Managing Reading Journal use case.
 * <p>
 * The menu reads from the keyboard and prints to the screen, so each test gives it the lines a
 * user would type, runs it, and checks what it printed. This tests the menu the way a real user
 * would use it: adding, viewing, editing, deleting, cancelling and typing invalid input.
 * </p>
 * @author Khadija Saeed Albasri 202200734
 */
public class MainTest {
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;

    // Puts the real keyboard and screen back after each test.
    @AfterEach
    public void restoreConsole() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    /**
     * Runs the menu as if a user typed the given lines, and returns everything it printed.
     * The color codes are removed so the tests can check the plain text.
     *
     * @param lines what the user types, one line per answer (an empty string means just pressing Enter)
     * @return the menu's output without color codes
     */
    private String runMain(String... lines) {
        String typed = String.join("\n", lines) + "\n";
        System.setIn(new ByteArrayInputStream(typed.getBytes(StandardCharsets.UTF_8)));
        ByteArrayOutputStream printed = new ByteArrayOutputStream();
        System.setOut(new PrintStream(printed, true, StandardCharsets.UTF_8));

        Main.main(new String[0]);

        System.setOut(originalOut);
        return printed.toString(StandardCharsets.UTF_8).replaceAll("\u001B\\[[0-9;]*m", "");
    }

    // Tests that choosing 5 straight away exits with a goodbye message and an empty journal.
    @Test
    public void testExit() {
        String output = runMain("5");

        assertTrue(output.contains("Your journal has 0 entries"));
        assertTrue(output.contains("Goodbye!"));
    }

    // Tests that a menu choice that isn't 1 to 5, or isn't a number, shows an error instead of crashing.
    @Test
    public void testInvalidMenuChoice() {
        String output = runMain("9", "", "abc", "", "5");

        assertTrue(output.contains("Invalid selection. Please enter a number between 1 and 5."));
        assertTrue(output.contains("Goodbye!"));
    }

    // Tests adding an entry with only notes.
    @Test
    public void testAddEntryWithNotes() {
        String output = runMain("1", "Dune", "y", "Spice everywhere", "n", "n", "", "5");

        assertTrue(output.contains("The journal entry was added successfully!"));
        assertTrue(output.contains("Notes:  Spice everywhere"));
        assertTrue(output.contains("Your journal has 1 entry"));
    }

    // Tests that a rating that is too high or not a number is asked for again.
    @Test
    public void testInvalidRatingIsAskedAgain() {
        String output = runMain("1", "Dune", "n", "n", "y", "9", "four", "4", "", "5");

        assertTrue(output.contains("The rating has to be from 1 to 5, please re-enter"));
        assertTrue(output.contains("Invalid input. Please enter a whole number from 1 to 5."));
        assertTrue(output.contains("Rating: 4/5 stars"));
    }

    // Tests that an answer other than y or n is asked for again.
    @Test
    public void testInvalidYesNoIsAskedAgain() {
        String output = runMain("1", "Dune", "maybe", "y", "A note", "n", "n", "", "5");

        assertTrue(output.contains("Invalid input. Please enter y/n."));
        assertTrue(output.contains("The journal entry was added successfully!"));
    }

    // Tests that saying no to notes, review and rating saves nothing.
    @Test
    public void testEntryWithNoPartsIsNotSaved() {
        String output = runMain("1", "Dune", "n", "n", "n", "", "5");

        assertTrue(output.contains("nothing was saved."));
        assertFalse(output.contains("added successfully"));
    }

    // Tests that typing 0 part way through adding an entry cancels it.
    @Test
    public void testTypingZeroCancels() {
        String output = runMain("1", "Dune", "y", "0", "", "5");

        assertTrue(output.contains("Cancelled. Nothing was changed."));
        assertFalse(output.contains("added successfully"));
        assertFalse(output.contains("Your journal has 1 entry"));
    }

    // Tests that viewing an empty journal shows a message instead of nothing.
    @Test
    public void testViewEmptyJournal() {
        String output = runMain("2", "", "5");

        assertTrue(output.contains("Your journal is empty."));
    }

    // Tests that viewing entries only shows the parts that were filled in.
    @Test
    public void testViewShowsOnlyFilledParts() {
        String output = runMain("1", "Dune", "y", "A note", "n", "n", "", "2", "", "5");

        String viewSection = output.substring(output.indexOf("--- Your Journal Entries ---"));
        assertTrue(viewSection.contains("Notes:  A note"));
        assertFalse(viewSection.contains("Review:"));
        assertFalse(viewSection.contains("Rating:"));
    }

    // Tests that the list for choosing an entry shows what each entry contains.
    @Test
    public void testEntryListShowsParts() {
        String output = runMain("1", "Dune", "y", "A note", "n", "y", "3", "", "3", "0", "", "5");

        assertTrue(output.contains("Dune (") && output.contains(") - notes, rating"));
    }

    // Tests editing an entry: changing the review and removing the rating.
    @Test
    public void testEditChangeAndRemove() {
        String output = runMain(
                "1", "Dune", "n", "y", "Old review", "y", "4", "",
                "3", "1", "n", "c", "New review", "r", "",
                "5");

        String afterEdit = output.substring(output.indexOf("The journal entry was updated successfully!"));
        afterEdit = afterEdit.substring(0, afterEdit.indexOf("Press Enter"));
        assertTrue(afterEdit.contains("Review: New review"));
        assertFalse(afterEdit.contains("Rating:"));
    }

    // Tests that editing cannot remove the only part of an entry.
    @Test
    public void testEditCannotRemoveLastPart() {
        String output = runMain(
                "1", "Dune", "y", "Only part", "n", "n", "",
                "3", "1", "r", "n", "n", "",
                "5");

        assertTrue(output.contains("An entry needs at least one part, so nothing was changed."));
        assertFalse(output.contains("updated successfully"));
    }

    // Tests that choosing an entry number that doesn't exist is asked for again.
    @Test
    public void testChoosingMissingEntryIsAskedAgain() {
        String output = runMain(
                "1", "Dune", "y", "A note", "n", "n", "",
                "4", "7", "1", "n", "",
                "5");

        assertTrue(output.contains("That entry does not exist, please re-enter."));
    }

    // Tests that deleting asks for confirmation and removes the entry when the user says yes.
    @Test
    public void testDeleteWithConfirmation() {
        String output = runMain(
                "1", "Dune", "y", "A note", "n", "n", "",
                "4", "1", "y", "",
                "5");

        assertTrue(output.contains("Are you sure you want to delete this journal entry?"));
        assertTrue(output.contains("The journal entry was deleted successfully."));
        String lastCount = output.substring(output.lastIndexOf("Your journal has"));
        assertTrue(lastCount.startsWith("Your journal has 0 entries"));
    }

    // Tests that answering no to the delete question keeps the entry.
    @Test
    public void testDeleteCancelledByNo() {
        String output = runMain(
                "1", "Dune", "y", "A note", "n", "n", "",
                "4", "1", "n", "",
                "5");

        assertTrue(output.contains("The journal entry was not deleted."));
        String lastCount = output.substring(output.lastIndexOf("Your journal has"));
        assertTrue(lastCount.startsWith("Your journal has 1 entry"));
    }
}
