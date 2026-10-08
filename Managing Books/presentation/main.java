import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManager Manager = new BookManager();
        int Choice = 0;

        while (Choice != 5) {
            System.out.println("\n--- Book Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Error: Choice must be a number between 1 and 5.");
                System.out.print("Enter your choice (1-5): ");
                scanner.next();
            }

            Choice = scanner.nextInt();
            scanner.nextLine();

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

            } else if (Choice == 3) {
                System.out.print("Enter Book ID to update: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Book ID must be an integer.");
                    System.out.print("Enter Book ID to update: ");
                    scanner.next();
                }
                int id = scanner.nextInt();
                scanner.nextLine();

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

            } else if (Choice == 5) {
                System.out.println("Exiting application. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        scanner.close();
    }
}