import java.util.Scanner; // Imports Scanner to read input from the user.

public class main {
    public static void main(String[] args) {
        // Create a Scanner to read input from the user.
        Scanner input = new Scanner(System.in);

        // Create the data layer object to manage all stored books.
        ReadingProgressData data = new ReadingProgressData();

        // Store the user's menu selection.
        int choice = 0;

        // Repeat the menu until the user selects option 5.
        while (choice != 5) {
            // Display the main menu options.
            System.out.println("\n====Book Tracker====");
            System.out.println("1. Add a New Book");
            System.out.println("2. Update Reading Progress");
            System.out.println("3. View a Book's Progress");
            System.out.println("4. View All Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            // Validate that the menu selection is an integer.
            if (!input.hasNextInt()) {
                System.out.println("Please enter a number.");

                // Clear the invalid input.
                input.nextLine();
                continue;
            }

            // Read the selected menu option.
            choice = input.nextInt();

            // Consume the remaining newline character.
            input.nextLine();

            // Execute the operation selected by the user.
            switch (choice) {
                case 1:
                    // Read the new book's title.
                    System.out.print("Enter book title: ");
                    String title = input.nextLine().trim();

                    // Read and validate the total number of pages.
                    System.out.print("Enter total pages: ");

                    if (!input.hasNextInt()) {
                        System.out.println("Invalid page number.");
                        input.nextLine();
                        break;
                    }

                    int totalPages = input.nextInt();
                    input.nextLine();

                    // Reject an empty title or a non-positive page count.
                    if (title.isEmpty() || totalPages <= 0) {
                        System.out.println("Title cannot be empty and pages must be positive.");
                        break;
                    }

                    // Create a ReadingProgress object for the new book.
                    ReadingProgress newBook = new ReadingProgress(title, totalPages);

                    // Add the book and report whether the operation succeeded.
                    if (data.addBook(newBook)) {
                        System.out.println("Book added successfully!");
                    } else {
                        System.out.println("A book with this title already exists.");
                    }
                    break;

                case 2:
                    // Ask for the title of the book to update.
                    System.out.print("Enter book title: ");
                    String updateTitle = input.nextLine().trim();

                    // Retrieve the book's reading progress record.
                    ReadingProgress updateBook = data.getProgress(updateTitle);

                    // Stop if the requested book does not exist.
                    if (updateBook == null) {
                        System.out.println("Book not found.");
                        break;
                    }

                    // Read the new current page.
                    System.out.print("Enter current page: ");

                    if (!input.hasNextInt()) {
                        System.out.println("Invalid page number.");
                        input.nextLine();
                        break;
                    }

                    int page = input.nextInt();
                    input.nextLine();

                    // Update the page and handle invalid page numbers.
                    try {
                        updateBook.updateCurrentPage(page);
                        System.out.println("Reading progress updated successfully!");
                    } catch (IllegalArgumentException e) {
                        // Display the validation error message.
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    // Ask for the title of the book to display.
                    System.out.print("Enter book title: ");
                    String viewTitle = input.nextLine().trim();

                    // Retrieve the selected book.
                    ReadingProgress book = data.getProgress(viewTitle);

                    // Display an error if the book is not found.
                    if (book == null) {
                        System.out.println("Book not found.");
                    } else {
                        // Display the selected book's reading information.
                        System.out.println("\n--- Reading Progress ---");
                        System.out.println("Book: " + book.getBookTitle());
                        System.out.println("Current Page: " + book.getCurrentPage());
                        System.out.println("Total Pages: " + book.getTotalPages());

                        // Display progress with one decimal place.
                        System.out.printf("Progress: %.1f%%%n", book.getProgressPercentage());

                        System.out.println("Remaining Pages: " + book.getRemainingPages());
                    }
                    break;

                case 4:
                    // Display all stored books and their reading progress.
                    System.out.println("\n--- All Books ---");

                    // Check whether the collection contains any books.
                    if (data.getAllBooks().isEmpty()) {
                        System.out.println("No books added yet.");
                    } else {

                        // Iterate through every stored book.
                        for (ReadingProgress b : data.getAllBooks()) {
                            System.out.printf("%s | Page %d/%d | Progress: %.1f%%%n", b.getBookTitle(), b.getCurrentPage(), b.getTotalPages(), b.getProgressPercentage());
                        }
                    }
                    break;

                case 5:
                    // Display a message before exiting the menu loop.
                    System.out.println("Goodbye!");
                    break;

                default:
                    // Handle menu choices outside the valid range.
                    System.out.println("Invalid choice. Choose from 1 to 5.");
            }
        }
        // Close the Scanner when the program finishes.
        input.close();
    }
}

