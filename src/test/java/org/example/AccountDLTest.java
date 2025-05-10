package org.example;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AccountDLTest {
    private AccountDL DL;

    @Before
    public void setUp() {
        DL = new AccountDL();
    }

    @Test
    public void testRegisterUser() {
        String uniqueEmail = "test" + System.currentTimeMillis() + "@example.com";
        assertTrue(DL.registerUser(uniqueEmail, "password123"));
    }

    @Test
    public void testLoginUser() {
        DL.registerUser("user@example.com", "securePass");
        assertTrue(DL.loginUser("user@example.com", "securePass"));
    }

    @Test
    public void testProfileEdit() {
        DL.registerUser("edit@example.com", "oldPass");
        assertTrue(DL.profileEdit("edit@example.com", "newPass"));
    }
}
