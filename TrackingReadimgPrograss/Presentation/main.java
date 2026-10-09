import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ReadingProgressData data = new ReadingProgressData();

        int choice = 0;

        while (choice != 5) {

            System.out.println("\nBook Tracker");
            System.out.println("1. Add a New Book");
            System.out.println("2. Update Reading Progress");
            System.out.println("3. View a Book's Progress");
            System.out.println("4. View All Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            if (!input.hasNextInt()) {
                System.out.println("Please enter a number.");
                input.nextLine();
                continue;
            }

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter book title: ");
                    String title = input.nextLine().trim();

                    System.out.print("Enter total pages: ");

                    if (!input.hasNextInt()) {
                        System.out.println("Invalid page number.");
                        input.nextLine();
                        break;
                    }

                    int totalPages = input.nextInt();
                    input.nextLine();

                    if (title.isEmpty() || totalPages <= 0) {
                        System.out.println(
                                "Title cannot be empty and pages must be positive."
                        );
                        break;
                    }

                    ReadingProgress newBook =
                            new ReadingProgress(title, totalPages);

                    if (data.addBook(newBook)) {
                        System.out.println("Book added successfully!");
                    } else {
                        System.out.println(
                                "A book with this title already exists."
                        );
                    }
                    break;

                case 2:
                    System.out.print("Enter book title: ");
                    String updateTitle = input.nextLine().trim();

                    ReadingProgress updateBook =
                            data.getProgress(updateTitle);

                    if (updateBook == null) {
                        System.out.println("Book not found.");
                        break;
                    }

                    System.out.print("Enter current page: ");

                    if (!input.hasNextInt()) {
                        System.out.println("Invalid page number.");
                        input.nextLine();
                        break;
                    }

                    int page = input.nextInt();
                    input.nextLine();

                    try {
                        updateBook.updateCurrentPage(page);
                        System.out.println(
                                "Reading progress updated successfully!"
                        );
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter book title: ");
                    String viewTitle = input.nextLine().trim();

                    ReadingProgress book =
                            data.getProgress(viewTitle);

                    if (book == null) {
                        System.out.println("Book not found.");
                    } else {
                        System.out.println("\n--- Reading Progress ---");
                        System.out.println(
                                "Book: " + book.getBookTitle()
                        );
                        System.out.println(
                                "Current Page: " + book.getCurrentPage()
                        );
                        System.out.println(
                                "Total Pages: " + book.getTotalPages()
                        );
                        System.out.printf(
                                "Progress: %.1f%%%n",
                                book.getProgressPercentage()
                        );
                        System.out.println(
                                "Remaining Pages: " + book.getRemainingPages()
                        );
                    }
                    break;

                case 4:
                    System.out.println("\n--- All Books ---");

                    if (data.getAllBooks().isEmpty()) {
                        System.out.println("No books added yet.");
                    } else {
                        for (ReadingProgress b : data.getAllBooks()) {
                            System.out.printf(
                                    "%s | Page %d/%d | Progress: %.1f%%%n",
                                    b.getBookTitle(),
                                    b.getCurrentPage(),
                                    b.getTotalPages(),
                                    b.getProgressPercentage()
                            );
                        }
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Choose from 1 to 5."
                    );
            }
        }

        input.close();
    }
}

