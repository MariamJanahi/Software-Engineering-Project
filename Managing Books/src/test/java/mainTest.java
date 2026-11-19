import presentation.main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class mainTest {
    @Test
    public void testMainClassInstantiation() {
        // Step 1: Instantiate an object of the main presentation layer class
        main presentationApp = new main();
     // Step 2: Assert that the application object was successfully created and is not null
        assertNotNull(presentationApp, "The main application class should instantiate successfully.");
    }
}
