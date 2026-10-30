import java.util.Scanner;

// Entry point for the Viewing Reading Status use case.
// It is named ReadingStatusMain so it does not clash with the "main" classes
// of the other team members. It loads a few sample books through the other
// members' classes (their data is only kept in memory) and starts the screen.
public class ReadingStatusMain {
    public static void main(String[] args) {
        // Data sources created by the other use cases.
        BookManager bookManager = new BookManager();
        ReadingProgressData progressData = new ReadingProgressData();

        // Sample books (Managing Books).
        bookManager.AddBook(1, "Atomic Habits", "James Clear", "Self-help", "Finished");
        bookManager.AddBook(2, "The Alchemist", "Paulo Coelho", "Fiction", "Reading");
        bookManager.AddBook(3, "Clean Code", "Robert C. Martin", "Technology", "To Read");
        bookManager.AddBook(4, "1984", "George Orwell", "Fiction", "reading");

        // Sample progress (Tracking Reading Progress).
        ReadingProgress atomic = new ReadingProgress("Atomic Habits", 320);
        atomic.updateCurrentPage(320);
        progressData.addBook(atomic);
        ReadingProgress alchemist = new ReadingProgress("The Alchemist", 208);
        alchemist.updateCurrentPage(90);
        progressData.addBook(alchemist);

        // Connect the three layers: data -> business -> presentation.
        ReadingStatusData data = new ReadingStatusData(bookManager, progressData);
        ReadingStatusService service = new ReadingStatusService(data);
        Scanner scanner = new Scanner(System.in);
        new ReadingStatusView(service, scanner).start();
        scanner.close();
    }
}
