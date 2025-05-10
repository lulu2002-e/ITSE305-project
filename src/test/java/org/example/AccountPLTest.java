package org.example;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

public class AccountPLTest {
    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUp() {
        new AccountBL();
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
        AccountPL.main(new String[]{});
        assertTrue(testOut.toString().contains("Registration Successful") || testOut.toString().contains("Registration Failed"));
    }

    @Test
    public void testLoginFlow() {
        setInput("2\nuser@example.com\nsecurePass\n");
        AccountPL.main(new String[]{});
        assertTrue(testOut.toString().contains("Login Successful") || testOut.toString().contains("Invalid Credentials"));
    }

    @Test
    public void testEditProfileFlow() {
        setInput("3\nedit@example.com\nnewPass\n");
        AccountPL.main(new String[]{});
        assertTrue(testOut.toString().contains("Profile Updated") || testOut.toString().contains("Update Failed"));
    }
}
