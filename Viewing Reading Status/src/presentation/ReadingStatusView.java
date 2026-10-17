import java.util.List;
import java.util.Scanner;

// PRESENTATION LAYER for the Viewing Reading Status use case.
// Shows the menu, reads the user's choices, and prints results.
// All decisions and calculations are delegated to ReadingStatusService.
public class ReadingStatusView {
    private final ReadingStatusService service; // business layer
    private final Scanner scanner;              // reads user input

    // Creates the view with the service it uses and a Scanner for input.
    public ReadingStatusView(ReadingStatusService service, Scanner scanner) {
        this.service = service;
        this.scanner = scanner;
    }

    // Runs the menu until the user chooses Exit (option 0).
    public void start() {
        String choice = "";
        while (!choice.equals("0")) {
            printMenu();
            choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    showBooks(service.viewAllBooks());
                    break;
                case "2":
                    filterByStatus();
                    break;
                case "3":
                    showBookDetails();
                    break;
                case "4":
                    showSummary();
                    break;
                case "0":
                    System.out.println("Leaving Reading Status.");
                    break;
                default:
                    System.out.println("Invalid choice. Choose from 0 to 4.");
            }
        }
    }

    // Prints the menu options.
    private void printMenu() {
        System.out.println("\n=== Viewing Reading Status ===");
        System.out.println("1. View all books and their status");
        System.out.println("2. View books by status");
        System.out.println("3. View a book's reading details");
        System.out.println("4. View status summary");
        System.out.println("0. Back / Exit");
        System.out.print("Choose an option: ");
    }

    // Prints a list of books, or a message if the list is empty.
    private void showBooks(List<ReadingStatusRecord> records) {
        if (records.isEmpty()) {
            System.out.println("No books found.");
            return;
        }
        for (ReadingStatusRecord record : records) {
            System.out.printf("%s by %s | %s | Progress: %.1f%%%n",
                    record.getTitle(), record.getAuthor(), record.getStatus(),
                    service.calculateProgressPercent(record));
        }
    }

    // Asks which status to filter by, then prints the matching books.
    private void filterByStatus() {
        System.out.print("Status (1 = To Read, 2 = Reading, 3 = Finished): ");
        String input = scanner.nextLine().trim();
        switch (input) {
            case "1":
                showBooks(service.viewBooksByStatus(ReadingStatus.TO_READ));
                break;
            case "2":
                showBooks(service.viewBooksByStatus(ReadingStatus.READING));
                break;
            case "3":
                showBooks(service.viewBooksByStatus(ReadingStatus.FINISHED));
                break;
            default:
                System.out.println("Invalid status choice.");
        }
    }

    // Asks for a title and prints that book's full reading details.
    private void showBookDetails() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        try {
            ReadingStatusRecord record = service.viewBookDetails(title);
            System.out.println("\n--- Reading Status ---");
            System.out.println("Book: " + record.getTitle());
            System.out.println("Author: " + record.getAuthor());
            System.out.println("Genre: " + record.getGenre());
            System.out.println("Status: " + record.getStatus());
            if (record.hasProgress()) {
                System.out.println("Pages: " + record.getCurrentPage() + " / " + record.getTotalPages());
                System.out.printf("Progress: %.1f%%%n", service.calculateProgressPercent(record));
            } else {
                System.out.println("No reading progress recorded yet.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // e.g. "Book not found."
        }
    }

    // Prints how many books are in each status (Unknown only if there are any).
    private void showSummary() {
        System.out.println("\n--- Status Summary ---");
        System.out.println(ReadingStatus.TO_READ + ": " + service.countBooksByStatus(ReadingStatus.TO_READ));
        System.out.println(ReadingStatus.READING + ": " + service.countBooksByStatus(ReadingStatus.READING));
        System.out.println(ReadingStatus.FINISHED + ": " + service.countBooksByStatus(ReadingStatus.FINISHED));
        int unknown = service.countBooksByStatus(ReadingStatus.UNKNOWN);
        if (unknown > 0) { // only show Unknown when at least one book has it
            System.out.println(ReadingStatus.UNKNOWN + ": " + unknown);
        }
    }
}
