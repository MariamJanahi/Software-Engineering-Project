// The possible reading states a book can be in.
// Used by the Viewing Reading Status use case to group and filter books.
public enum ReadingStatus {
    TO_READ("To Read"),
    READING("Currently Reading"),
    FINISHED("Finished"),
    UNKNOWN("Unknown"); // used when the saved status text cannot be understood

    // Text shown to the user.
    private final String label;

    // Creates a status with its display label.
    ReadingStatus(String label) {
        this.label = label;
    }

    // Returns the display label of this status.
    public String getLabel() {
        return label;
    }
}
