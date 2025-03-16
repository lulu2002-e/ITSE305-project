import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertTrue;

public class PresentationLayerTest {

    @Test
    public void testMenuDisplaysCorrectly() {
        String input = "5\n"; // Simulate user entering "5" (Exit)
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        PresentationLayer.main(new String[]{});

        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("--- Appointment Management System ---"));
        assertTrue(consoleOutput.contains("1. Book Appointment"));
        assertTrue(consoleOutput.contains("2. Reschedule Appointment"));
        assertTrue(consoleOutput.contains("3. Cancel Appointment"));
        assertTrue(consoleOutput.contains("4. View All Appointments"));
        assertTrue(consoleOutput.contains("5. Exit"));
    }
}
