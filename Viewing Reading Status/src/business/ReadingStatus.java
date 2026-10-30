// The possible reading statuses of a book, stored as constant text values.
// Used by the Viewing Reading Status use case to group and filter books.
public class ReadingStatus {
    public static final String TO_READ = "To Read";            // book not started yet
    public static final String READING = "Currently Reading";  // book started but not finished
    public static final String FINISHED = "Finished";          // all pages read
    public static final String UNKNOWN = "Unknown";            // status text could not be understood
}
