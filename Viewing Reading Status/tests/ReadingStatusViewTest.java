import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Tests for ReadingStatusView (the presentation layer).
// User input is simulated with a Scanner over a String, and everything the view prints is
// captured so the tests can check the text. Every simulated input must end with "0" (Exit),
// otherwise the menu loop would wait for more input.
class ReadingStatusViewTest {
    private PrintStream originalOut;       // the real console output, restored after each test
    private Locale originalLocale;         // the real default locale, restored after each test
    private ByteArrayOutputStream output;  // collects everything the view prints
    private BookManager books;
    private ReadingProgressData progress;

    // Capture the console output, force US number formatting (so 43.3 is not printed as 43,3),
    // and prepare four sample books like the ones in ReadingStatusMain.
    @BeforeEach
    void setUp() {
        originalOut = System.out;
        originalLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        books = new BookManager();
        progress = new ReadingProgressData();
        books.AddBook(1, "Atomic Habits", "James Clear", "Self-help", "Finished");
        books.AddBook(2, "The Alchemist", "Paulo Coelho", "Fiction", "Reading");
        books.AddBook(3, "Clean Code", "Robert C. Martin", "Technology", "To Read");
        books.AddBook(4, "1984", "George Orwell", "Fiction", "reading");

        ReadingProgress atomic = new ReadingProgress("Atomic Habits", 320);
        atomic.updateCurrentPage(320);
        progress.addBook(atomic);
        ReadingProgress alchemist = new ReadingProgress("The Alchemist", 208);
        alchemist.updateCurrentPage(90);
        progress.addBook(alchemist);
    }

    // Put the console and locale back to normal.
    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        Locale.setDefault(originalLocale);
    }

    // Runs the view with the sample books and the given simulated keyboard input.
    private String run(String input) {
        return runWith(books, progress, input);
    }

    // Runs the view with the given data sources and returns everything it printed.
    private String runWith(BookManager bm, ReadingProgressData pd, String input) {
        ReadingStatusService service = new ReadingStatusService(new ReadingStatusData(bm, pd));
        new ReadingStatusView(service, new Scanner(input)).start();
        return output.toString();
    }

    // Choosing 0 shows the menu once and then leaves.
    @Test
    void exitShowsMenuAndLeavingMessage() {
        String out = run("0\n");

        assertTrue(out.contains("=== Viewing Reading Status ==="));
        assertTrue(out.contains("1. View all books and their status"));
        assertTrue(out.contains("Leaving Reading Status."));
    }

    // An invalid menu choice prints an error and the menu is shown again.
    @Test
    void invalidMenuChoiceShowsError() {
        String out = run("9\nabc\n0\n");

        assertTrue(out.contains("Invalid choice. Choose from 0 to 4."));
        assertTrue(out.contains("Leaving Reading Status."));
    }

    // Option 1 lists every book with author, final status, and progress percentage.
    @Test
    void optionOneListsAllBooks() {
        String out = run("1\n0\n");

        assertTrue(out.contains("Atomic Habits by James Clear | Finished | Progress: 100.0%"));
        assertTrue(out.contains("The Alchemist by Paulo Coelho | Currently Reading | Progress: 43.3%"));
        assertTrue(out.contains("Clean Code by Robert C. Martin | To Read | Progress: 0.0%"));
        assertTrue(out.contains("1984 by George Orwell | Currently Reading | Progress: 0.0%"));
    }

    // Option 1 with no books shows a friendly message.
    @Test
    void optionOneWithNoBooksShowsMessage() {
        String out = runWith(new BookManager(), new ReadingProgressData(), "1\n0\n");

        assertTrue(out.contains("No books found."));
    }

    // Option 2 -> 1 shows only "To Read" books.
    @Test
    void optionTwoFiltersToRead() {
        String out = run("2\n1\n0\n");

        assertTrue(out.contains("Clean Code"));
        assertFalse(out.contains("Atomic Habits"));
        assertFalse(out.contains("The Alchemist"));
    }

    // Option 2 -> 2 shows only "Currently Reading" books.
    @Test
    void optionTwoFiltersReading() {
        String out = run("2\n2\n0\n");

        assertTrue(out.contains("The Alchemist"));
        assertTrue(out.contains("1984"));
        assertFalse(out.contains("Atomic Habits"));
        assertFalse(out.contains("Clean Code"));
    }

    // Option 2 -> 3 shows only "Finished" books.
    @Test
    void optionTwoFiltersFinished() {
        String out = run("2\n3\n0\n");

        assertTrue(out.contains("Atomic Habits"));
        assertFalse(out.contains("The Alchemist"));
        assertFalse(out.contains("Clean Code"));
    }

    // Option 2 with an invalid sub-choice prints an error.
    @Test
    void optionTwoInvalidStatusChoice() {
        String out = run("2\n7\n0\n");

        assertTrue(out.contains("Invalid status choice."));
    }

    // Option 2 on an empty library shows the "No books found." message.
    @Test
    void optionTwoWithNoMatchingBooksShowsMessage() {
        String out = runWith(new BookManager(), new ReadingProgressData(), "2\n1\n0\n");

        assertTrue(out.contains("No books found."));
    }

    // Option 3 prints full details (including pages and progress) for a book that has progress.
    // The title is typed in lower case to check that the search ignores case.
    @Test
    void optionThreeShowsDetailsWithProgress() {
        String out = run("3\nthe alchemist\n0\n");

        assertTrue(out.contains("--- Reading Status ---"));
        assertTrue(out.contains("Book: The Alchemist"));
        assertTrue(out.contains("Author: Paulo Coelho"));
        assertTrue(out.contains("Genre: Fiction"));
        assertTrue(out.contains("Status: Currently Reading"));
        assertTrue(out.contains("Pages: 90 / 208"));
        assertTrue(out.contains("Progress: 43.3%"));
    }

    // Option 3 for a book without progress says that no progress is recorded.
    @Test
    void optionThreeShowsDetailsWithoutProgress() {
        String out = run("3\nClean Code\n0\n");

        assertTrue(out.contains("Book: Clean Code"));
        assertTrue(out.contains("Status: To Read"));
        assertTrue(out.contains("No reading progress recorded yet."));
        assertFalse(out.contains("Pages:"));
    }

    // Option 3 with a title that does not exist prints the business layer's error message.
    @Test
    void optionThreeBookNotFound() {
        String out = run("3\nNo Such Book\n0\n");

        assertTrue(out.contains("Book not found."));
    }

    // Option 3 with an empty title prints the "must not be empty" message.
    @Test
    void optionThreeEmptyTitle() {
        String out = run("3\n\n0\n");

        assertTrue(out.contains("Title must not be empty."));
    }

    // Option 4 prints how many books are in each status. Unknown is hidden when it is 0.
    @Test
    void optionFourShowsSummaryWithoutUnknown() {
        String out = run("4\n0\n");

        assertTrue(out.contains("--- Status Summary ---"));
        assertTrue(out.contains("To Read: 1"));
        assertTrue(out.contains("Currently Reading: 2"));
        assertTrue(out.contains("Finished: 1"));
        assertFalse(out.contains("Unknown:"));
    }

    // Option 4 shows the Unknown line when at least one book has an unrecognised status.
    @Test
    void optionFourShowsUnknownWhenPresent() {
        books.AddBook(5, "Mystery", "Someone", "Fiction", "???");

        String out = run("4\n0\n");

        assertTrue(out.contains("Unknown: 1"));
    }

    // The menu keeps running after an action, so several options can be used in one session.
    @Test
    void menuAllowsSeveralActionsInOneSession() {
        String out = run("4\n1\n0\n");

        assertTrue(out.contains("--- Status Summary ---"));
        assertTrue(out.contains("Atomic Habits by James Clear"));
        assertTrue(out.contains("Leaving Reading Status."));
    }
}
