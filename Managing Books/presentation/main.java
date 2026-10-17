import java.util.Scanner;
// the main class that runs the book management system .
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManager Manager = new BookManager();
        int Choice = 0;
        // looping until the user choises one . 
        while (Choice != 5) {
            System.out.println("\n--- Book Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
           // making sure  that the user enters an integer for the menu choice .
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Choice must be a number between 1 and 5.");
                System.out.print("Enter your choice (1-5): ");
                scanner.next();
            }

            Choice = scanner.nextInt();
            scanner.nextLine();  // clear the input .
            
           // Option 1: Add a new book .
            if (Choice == 1) {
                System.out.print("Enter Book ID: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Book ID must be an integer.");
                    System.out.print("Enter Book ID: ");
                    scanner.next();
                }
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Title: ");
                String title = scanner.nextLine();

                System.out.print("Enter Author: ");
                String author = scanner.nextLine();

                System.out.print("Enter Genre: ");
                String genre = scanner.nextLine();

                System.out.print("Enter Status: ");
                String status = scanner.nextLine();

                Manager.AddBook(id, title, author, genre, status);
                System.out.println("Book added successfully!");
             // Option 2: Display all saved books .
            } else if (Choice == 2) {
                System.out.println("\n--- Book List ---");
                int count = Manager.getBookCount();

                if (count == 0) {
                    System.out.println("No books found in storage.");
                } else {
                    Book[] books = Manager.getAllBooks();
                    for (int i = 0; i < count; i++) {
                        System.out.println("ID: " + books[i].getBookID() + " | Title: " + books[i].getTitle() + " | Author: " + books[i].getAuthor() + " | Genre: " + books[i].getGenre() + " | Status: " + books[i].getStatus());
                    }
                }
            // Option 3: Update an existing books details .
            } else if (Choice == 3) {
                System.out.print("Enter Book ID to update: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Book ID must be an integer.");
                    System.out.print("Enter Book ID to update: ");
                    scanner.next();
                }
                int id = scanner.nextInt();
                scanner.nextLine();
               // Check if the book ID exists before asking for new details .
                boolean exists = false;
                int count = Manager.getBookCount();
                Book[] books = Manager.getAllBooks();
                for (int i = 0; i < count; i++) {
                    if (books[i].getBookID() == id) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    System.out.println("Error: Book ID not found.");
                } else {
                    System.out.print("Enter New Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter New Author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter New Genre: ");
                    String genre = scanner.nextLine();

                    System.out.print("Enter New Status: ");
                    String status = scanner.nextLine();

                    Manager.UpdateBook(id, title, author, genre, status);
                    System.out.println("Book updated successfully!");
                }
             // Option 4: Delete a book by ID . 
            } else if (Choice == 4) {
                System.out.print("Enter Book ID to delete: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Book ID must be an integer.");
                    System.out.print("Enter Book ID to delete: ");
                    scanner.next();
                }
                int id = scanner.nextInt();
                scanner.nextLine();

                boolean deleted = Manager.DeleteBook(id);
                if (deleted) {
                    System.out.println("Book deleted successfully!");
                } else {
                    System.out.println("Error: Book ID not found.");
                }
             // Option 5: Exit the application . 
            } else if (Choice == 5) {
                System.out.println("Exiting application. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        scanner.close();  // Close the scanner .
    }
}
