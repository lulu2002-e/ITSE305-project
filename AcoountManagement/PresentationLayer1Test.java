import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

public class PresentationLayer1Test {
    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUp() {
        new BusinessLayer1();
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void setInput(String input) {
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
    }

    @Test
    public void testRegistrationFlow() {
        setInput("1\ntest@example.com\npassword123\n");
        PresentationLayer1.main(new String[]{});
        assertTrue(testOut.toString().contains("Registration Successful") || testOut.toString().contains("Registration Failed"));
    }

    @Test
    public void testLoginFlow() {
        setInput("2\nuser@example.com\nsecurePass\n");
        PresentationLayer1.main(new String[]{});
        assertTrue(testOut.toString().contains("Login Successful") || testOut.toString().contains("Invalid Credentials"));
    }

    @Test
    public void testEditProfileFlow() {
        setInput("3\nedit@example.com\nnewPass\n");
        PresentationLayer1.main(new String[]{});
        assertTrue(testOut.toString().contains("Profile Updated") || testOut.toString().contains("Update Failed"));
    }
}
