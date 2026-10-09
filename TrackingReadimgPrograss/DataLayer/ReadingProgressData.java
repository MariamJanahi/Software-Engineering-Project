import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadingProgressData {

    private Map<String, ReadingProgress> progressData;

    public ReadingProgressData() {
        progressData = new LinkedHashMap<>();
    }

    public boolean addBook(ReadingProgress progress) {
        String title = progress.getBookTitle();

        if (progressData.containsKey(title.toLowerCase())) {
            return false;
        }

        progressData.put(title.toLowerCase(), progress);
        return true;
    }

    public ReadingProgress getProgress(String bookTitle) {
        return progressData.get(bookTitle.toLowerCase());
    }

    public Collection<ReadingProgress> getAllBooks() {
        return progressData.values();
    }

    public boolean bookExists(String bookTitle) {
        return progressData.containsKey(bookTitle.toLowerCase());
    }
}


