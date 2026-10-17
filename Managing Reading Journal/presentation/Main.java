import java.util.ArrayList;
import java.util.Scanner;

/**
 * The {@code Main} class is the console menu for the Managing Reading Journal use case.
 * <p>
 * This is the presentation layer. It shows the menu, reads what the user types, and passes it to
 * {@link JournalManager}, which checks the rules and saves the entries. From the main menu the user
 * can add a journal entry, view their entries, edit an entry or delete one.
 * </p>
 * <p>
 * A journal entry can hold notes/thoughts, a review, a rating, or any mix of the three. When adding
 * an entry, the user is asked about each part separately and can say no to the ones they don't want.
 * Typing 0 at any prompt cancels what they were doing and goes back to the main menu.
 * </p>
 *
 * @author Khadija Saeed Albasri 202200734
 */
public class Main {
    private static final String RESET = "\u001B[0m";
    private static final String MAGENTA = "\u001B[35m";
    private static final String RED = "\u001B[31m";
    private static final String CANCEL = "0";

    /**
     * Thrown by the ask methods when the user types 0, and caught once in the menu loop.
     * This way every question can be cancelled without checking for it after each one.
     */
    private static class CancelledException extends RuntimeException {
        private static final long serialVersionUID = 1L; // Required by Java for exception classes
    }

    /**
     * Runs the menu in a loop until the user chooses to exit. Each option is handled by its
     * own method below.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        JournalManager manager = new JournalManager();
        int selection;

        System.out.println(MAGENTA + "Reading Journal 📖" + RESET);

        do {
            printEntryCount(manager);
            System.out.println("Select a number from 1 to 5:");
            System.out.println("1 ✏️ to " + MAGENTA + "add" + RESET + " a journal entry");
            System.out.println("2 📖 to " + MAGENTA + "view" + RESET + " your journal entries");
            System.out.println("3 🔧 to " + MAGENTA + "edit" + RESET + " a journal entry");
            System.out.println("4 🗑️ to " + MAGENTA + "delete" + RESET + " a journal entry");
            System.out.println("5 🛑 to " + MAGENTA + "exit" + RESET + " the program");

            selection = readSelection(kbd, 5);
            System.out.println();

            try {
                switch (selection) {
                    case 1:
                        addEntry(kbd, manager);
                        break;
                    case 2:
                        viewEntries(manager);
                        break;
                    case 3:
                        editEntry(kbd, manager);
                        break;
                    case 4:
                        deleteEntry(kbd, manager);
                        break;
                    case 5:
                        System.out.println(MAGENTA + "Thank you" + RESET + " for using the Reading Journal." + MAGENTA + " Goodbye!" + RESET);
                        break;
                }
            } catch (CancelledException e) {
                System.out.println(MAGENTA + "Cancelled." + RESET + " Nothing was changed.");
            } catch (IllegalArgumentException e) {
                // A rule broken in the business layer, shown to the user instead of crashing
                System.out.println(RED + "Error: " + RESET + e.getMessage());
            }

            if (selection != 5) {
                pressEnterToContinue(kbd);
            }
        } while (selection != 5);

        kbd.close();
    }

    /**
     * Adds a new journal entry. The user is told what an entry can include, then asked for the
     * book title and whether they want to add notes/thoughts, a review and a rating. They can
     * choose any one of these, any two, or all three.
     *
     * @param kbd the scanner reading from the keyboard
     * @param manager the journal manager to save the entry through
     */
    private static void addEntry(Scanner kbd, JournalManager manager) {
        System.out.println(MAGENTA + "--- Add a Journal Entry ---" + RESET);
        System.out.println("A journal entry can include " + MAGENTA + "notes/thoughts" + RESET + ", a " + MAGENTA + "review" + RESET
                + ", a " + MAGENTA + "rating" + RESET + ", or all three.");
        System.out.println("You will be asked about each one, so you only add what you want.");
        System.out.println("Type " + MAGENTA + "0" + RESET + " at any time to cancel and go back to the main menu.");
        System.out.println();

        String title = askText(kbd, "Enter the " + MAGENTA + "title" + RESET + " of the book", "Book title");

        String notes = "";
        if (askYesNo(kbd, "Do you want to add " + MAGENTA + "notes/thoughts" + RESET + "?")) {
            notes = askText(kbd, "Enter your " + MAGENTA + "notes/thoughts" + RESET, "Notes");
        }

        String review = "";
        if (askYesNo(kbd, "Do you want to add a " + MAGENTA + "review" + RESET + "?")) {
            review = askText(kbd, "Enter your " + MAGENTA + "review" + RESET, "Review");
        }

        int rating = JournalManager.NO_RATING;
        if (askYesNo(kbd, "Do you want to add a " + MAGENTA + "rating" + RESET + "?")) {
            rating = askRating(kbd);
        }

        if (notes.isEmpty() && review.isEmpty() && rating == JournalManager.NO_RATING) {
            System.out.println("You didn't add notes/thoughts, a review or a rating, so " + MAGENTA + "nothing was saved." + RESET);
            return;
        }

        JournalEntry entry = manager.addEntry(title, notes, review, rating);
        System.out.println();
        System.out.println("The journal entry was " + MAGENTA + "added successfully!" + RESET);
        printEntry(entry);
    }

    /**
     * Prints every journal entry. Each entry only shows the parts that were filled in.
     *
     * @param manager the journal manager to read the entries from
     */
    private static void viewEntries(JournalManager manager) {
        System.out.println(MAGENTA + "--- Your Journal Entries ---" + RESET);
        ArrayList<JournalEntry> entries = manager.getAllEntries();
        if (entries.isEmpty()) {
            System.out.println("Your journal is " + MAGENTA + "empty" + RESET + ". Choose option 1 to add an entry.");
            return;
        }
        for (JournalEntry entry : entries) {
            printEntry(entry);
            System.out.println();
        }
    }

    /**
     * Edits a journal entry. The user picks the entry, then is asked about each part one at a time.
     * A part the entry already has can be changed, removed or kept, and a part it doesn't have
     * can be added.
     *
     * @param kbd the scanner reading from the keyboard
     * @param manager the journal manager to edit the entry through
     */
    private static void editEntry(Scanner kbd, JournalManager manager) {
        System.out.println(MAGENTA + "--- Edit a Journal Entry ---" + RESET);
        JournalEntry entry = chooseEntry(kbd, manager);
        if (entry == null) {
            return;
        }

        System.out.println();
        printEntry(entry);
        System.out.println();
        System.out.println("Type " + MAGENTA + "0" + RESET + " at any time to cancel without changing anything.");

        // All answers are collected before anything is saved, so cancelling part way leaves the entry as it was
        char notesAction = askPartAction(kbd, "notes/thoughts", "notes/thoughts", entry.hasNotes());
        String newNotes = "";
        if (notesAction == 'c') {
            newNotes = askText(kbd, "Enter the new " + MAGENTA + "notes/thoughts" + RESET, "Notes");
        }

        char reviewAction = askPartAction(kbd, "review", "a review", entry.hasReview());
        String newReview = "";
        if (reviewAction == 'c') {
            newReview = askText(kbd, "Enter the new " + MAGENTA + "review" + RESET, "Review");
        }

        char ratingAction = askPartAction(kbd, "rating", "a rating", entry.hasRating());
        int newRating = JournalManager.NO_RATING;
        if (ratingAction == 'c') {
            newRating = askRating(kbd);
        }

        if (notesAction == 'k' && reviewAction == 'k' && ratingAction == 'k') {
            System.out.println(MAGENTA + "Nothing was changed." + RESET);
            return;
        }

        // Checked before saving so the user is told straight away, instead of the entry being left half edited
        boolean keepsNotes = notesAction == 'c' || (notesAction == 'k' && entry.hasNotes());
        boolean keepsReview = reviewAction == 'c' || (reviewAction == 'k' && entry.hasReview());
        boolean keepsRating = ratingAction == 'c' || (ratingAction == 'k' && entry.hasRating());
        if (!keepsNotes && !keepsReview && !keepsRating) {
            System.out.println("An entry needs at least one part, so " + MAGENTA + "nothing was changed." + RESET);
            System.out.println("To remove everything, delete the entry instead (option 4).");
            return;
        }

        // Changes are saved before removals, so removing a part never leaves the entry empty part way through
        int entryId = entry.getEntryId();
        if (notesAction == 'c') {
            manager.editNotes(entryId, newNotes);
        }
        if (reviewAction == 'c') {
            manager.editReview(entryId, newReview);
        }
        if (ratingAction == 'c') {
            manager.editRating(entryId, newRating);
        }
        if (notesAction == 'r') {
            manager.removeNotes(entryId);
        }
        if (reviewAction == 'r') {
            manager.removeReview(entryId);
        }
        if (ratingAction == 'r') {
            manager.removeRating(entryId);
        }

        System.out.println();
        System.out.println("The journal entry was " + MAGENTA + "updated successfully!" + RESET);
        printEntry(manager.getEntry(entryId));
    }

    /**
     * Deletes a journal entry. The user picks the entry, sees it, and has to confirm before it is deleted.
     *
     * @param kbd the scanner reading from the keyboard
     * @param manager the journal manager to delete the entry through
     */
    private static void deleteEntry(Scanner kbd, JournalManager manager) {
        System.out.println(MAGENTA + "--- Delete a Journal Entry ---" + RESET);
        JournalEntry entry = chooseEntry(kbd, manager);
        if (entry == null) {
            return;
        }

        System.out.println();
        printEntry(entry);
        System.out.println();

        if (askYesNo(kbd, "Are you sure you want to " + RED + "delete" + RESET + " this journal entry?")) {
            manager.deleteEntry(entry.getEntryId());
            System.out.println("The journal entry was " + MAGENTA + "deleted successfully." + RESET);
        } else {
            System.out.println("The journal entry was " + MAGENTA + "not deleted." + RESET);
        }
    }

    /**
     * Shows a short list of entries by ID, book title, date and what each one contains, then asks
     * the user which one to use.
     *
     * @param kbd the scanner reading from the keyboard
     * @param manager the journal manager to look the entry up in
     * @return the chosen entry, or null if the journal is empty
     * @throws CancelledException if the user types 0
     */
    private static JournalEntry chooseEntry(Scanner kbd, JournalManager manager) {
        ArrayList<JournalEntry> entries = manager.getAllEntries();
        if (entries.isEmpty()) {
            System.out.println("Your journal is " + MAGENTA + "empty" + RESET + ". Choose option 1 to add an entry first.");
            return null;
        }

        for (JournalEntry entry : entries) {
            System.out.println("  #" + entry.getEntryId() + " " + entry.getBookTitle() + " (" + entry.getDateWritten() + ") - " + describeParts(entry));
        }

        System.out.println("Enter the " + MAGENTA + "entry number" + RESET + " (or 0 to go back)");
        while (true) {
            String line = readOrCancel(kbd);
            try {
                JournalEntry entry = manager.getEntry(Integer.parseInt(line));
                if (entry != null) {
                    return entry;
                }
                System.out.println("That entry " + MAGENTA + "does not exist" + RESET + ", please re-enter.");
            } catch (NumberFormatException e) {
                System.out.println(RED + "Invalid" + RESET + " input. Please enter an entry number from the list.");
            }
        }
    }

    /**
     * Prints one journal entry. Only the parts that were filled in are shown, for example:
     * <pre>
     * #2 The Hobbit | 2026-10-17
     *    Review: Loved the riddles chapter
     *    Rating: 4/5 stars
     * </pre>
     *
     * @param entry the entry to print
     */
    private static void printEntry(JournalEntry entry) {
        String header = "#" + entry.getEntryId() + " " + MAGENTA + entry.getBookTitle() + RESET + " | " + entry.getDateWritten();
        if (entry.getDateEdited() != null) {
            header += " (edited " + entry.getDateEdited() + ")";
        }
        System.out.println(header);
        if (entry.hasNotes()) {
            System.out.println("   Notes:  " + entry.getNotes());
        }
        if (entry.hasReview()) {
            System.out.println("   Review: " + entry.getReview());
        }
        if (entry.hasRating()) {
            System.out.println("   Rating: " + entry.getRating() + "/5 stars");
        }
    }

    /**
     * Lists the parts an entry contains, for example "notes" or "review, rating".
     *
     * @param entry the entry to describe
     * @return the names of the filled-in parts, separated by commas
     */
    private static String describeParts(JournalEntry entry) {
        ArrayList<String> parts = new ArrayList<>();
        if (entry.hasNotes()) {
            parts.add("notes");
        }
        if (entry.hasReview()) {
            parts.add("review");
        }
        if (entry.hasRating()) {
            parts.add("rating");
        }
        return String.join(", ", parts);
    }

    /**
     * Asks what to do with one part of an entry while editing. If the entry has the part, the user
     * can change, remove or keep it. If it doesn't, the user is asked whether to add it.
     *
     * @param kbd the scanner reading from the keyboard
     * @param partName the name of the part (for example "review")
     * @param addPhrase how the part is named in the add question (for example "a review")
     * @param hasPart whether the entry already has this part
     * @return 'c' to change or add the part, 'r' to remove it, or 'k' to keep it as it is
     * @throws CancelledException if the user types 0
     */
    private static char askPartAction(Scanner kbd, String partName, String addPhrase, boolean hasPart) {
        if (hasPart) {
            return askChoice(kbd, "What do you want to do with the " + MAGENTA + partName + RESET
                    + "? (c = change, r = remove, k = keep)", "crk");
        }
        return askYesNo(kbd, "Do you want to add " + MAGENTA + addPhrase + RESET + "?") ? 'c' : 'k';
    }

    /**
     * Asks for some text and keeps asking until something is typed.
     *
     * @param kbd the scanner reading from the keyboard
     * @param prompt the message to show
     * @param label what is being asked for, used in the error message (for example "Review")
     * @return the text typed by the user
     * @throws CancelledException if the user types 0
     */
    private static String askText(Scanner kbd, String prompt, String label) {
        System.out.println(prompt);
        String text = readOrCancel(kbd);
        while (text.isEmpty()) {
            System.out.println(label + " cannot be empty, " + MAGENTA + "please re-enter" + RESET);
            text = readOrCancel(kbd);
        }
        return text;
    }

    /**
     * Asks a yes or no question and keeps asking until the user answers y or n.
     *
     * @param kbd the scanner reading from the keyboard
     * @param question the question to show
     * @return true for yes, false for no
     * @throws CancelledException if the user types 0
     */
    private static boolean askYesNo(Scanner kbd, String question) {
        return askChoice(kbd, question + " (y/n)", "yn") == 'y';
    }

    /**
     * Asks a question with single-letter answers and keeps asking until one of them is typed.
     * Upper or lower case both work.
     *
     * @param kbd the scanner reading from the keyboard
     * @param question the question to show, including the choices
     * @param letters the allowed answers, for example "yn" or "crk"
     * @return the letter the user chose, in lower case
     * @throws CancelledException if the user types 0
     */
    private static char askChoice(Scanner kbd, String question, String letters) {
        System.out.println(question);
        while (true) {
            String answer = readOrCancel(kbd).toLowerCase();
            if (answer.length() == 1 && letters.contains(answer)) {
                return answer.charAt(0);
            }
            System.out.println(RED + "Invalid" + RESET + " input. Please enter " + String.join("/", letters.split("")) + ".");
        }
    }

    /**
     * Asks for a rating and keeps asking until a whole number from 1 to 5 is typed.
     *
     * @param kbd the scanner reading from the keyboard
     * @return the rating
     * @throws CancelledException if the user types 0
     */
    private static int askRating(Scanner kbd) {
        System.out.println("Enter your " + MAGENTA + "rating" + RESET + " from 1 to 5");
        while (true) {
            String line = readOrCancel(kbd);
            try {
                int rating = Integer.parseInt(line);
                if (rating >= JournalManager.MIN_RATING && rating <= JournalManager.MAX_RATING) {
                    return rating;
                }
                System.out.println("The rating has to be from 1 to 5, " + MAGENTA + "please re-enter" + RESET);
            } catch (NumberFormatException e) {
                System.out.println(RED + "Invalid" + RESET + " input. Please enter a whole number from 1 to 5.");
            }
        }
    }

    /**
     * Reads one line from the keyboard. Every question uses this, which is what lets the user
     * cancel from anywhere by typing 0.
     *
     * @param kbd the scanner reading from the keyboard
     * @return the line typed by the user, with spaces at the start and end removed
     * @throws CancelledException if the user types 0
     */
    private static String readOrCancel(Scanner kbd) {
        String line = kbd.nextLine().trim();
        if (line.equals(CANCEL)) {
            throw new CancelledException();
        }
        return line;
    }

    /**
     * Reads a menu selection.
     *
     * @param kbd the scanner reading from the keyboard
     * @param max the highest option on the menu
     * @return the selection from 1 to max, or -1 if the input was not a valid option
     */
    private static int readSelection(Scanner kbd, int max) {
        String line = kbd.nextLine().trim();
        try {
            int selection = Integer.parseInt(line);
            if (selection >= 1 && selection <= max) {
                return selection;
            }
        } catch (NumberFormatException e) {
            // Not a number, handled by the message below
        }
        System.out.println(RED + "Invalid" + RESET + " selection. Please enter a number between 1 and " + max + ".");
        return -1;
    }

    /**
     * Prints a box above the menu showing how many entries are in the journal.
     *
     * @param manager the journal manager to count the entries from
     */
    private static void printEntryCount(JournalManager manager) {
        int count = manager.getEntryCount();
        String text = " Your journal has " + count + (count == 1 ? " entry " : " entries ");
        String border = "─".repeat(text.length()); // Measured before the color codes are added, so the box lines up
        System.out.println(" ┌" + border + "┐");
        System.out.println(" |" + text.replace(String.valueOf(count), RED + count + RESET) + "|");
        System.out.println(" └" + border + "┘");
    }

    /**
     * Waits for the user to press Enter before going back to the main menu, so they have time to
     * read the result.
     *
     * @param kbd the scanner reading from the keyboard
     */
    private static void pressEnterToContinue(Scanner kbd) {
        System.out.println();
        System.out.println("Press " + MAGENTA + "Enter" + RESET + " to return to the main menu.");
        kbd.nextLine();
        System.out.println();
    }
}
