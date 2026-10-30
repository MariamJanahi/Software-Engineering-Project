import java.util.Collection;  // Imports the Collection interface to return all books.
import java.util.LinkedHashMap;  // Imports LinkedHashMap to preserve the insertion order.
import java.util.Map;  // Imports the Map interface to store books using keys and values.

public class ReadingProgressData {
    // Stores each book title as a key and its ReadingProgress object as a value.
    private Map<String, ReadingProgress> progressData;

    // LinkedHashMap preserves the insertion order of the books.
    public ReadingProgressData() {
        progressData = new LinkedHashMap<>();
    }

    // Adds a book if its title does not already exist.
    public boolean addBook(ReadingProgress progress) {
        // Get the book title.
        String title = progress.getBookTitle();

        // Check whether the book title already exists.
        if (progressData.containsKey(title.toLowerCase())) {
            return false;
        }

        // Store the book using its lowercase title as the key.
        progressData.put(title.toLowerCase(), progress);

        // Indicate that the book was added successfully.
        return true;
    }

    // Finds and returns a book using its title.
    public ReadingProgress getProgress(String bookTitle) {
        return progressData.get(bookTitle.toLowerCase());
    }

    // Returns all stored books.
    public Collection<ReadingProgress> getAllBooks() {
        return progressData.values();
    }

    // Checks whether a book exists in the collection.
    public boolean bookExists(String bookTitle) {
        return progressData.containsKey(bookTitle.toLowerCase());
    }
}


