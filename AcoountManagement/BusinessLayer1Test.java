import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BusinessLayer1Test {
    private BusinessLayer1 BL;

    @Before
    public void setUp() {
        BL = new BusinessLayer1();
    }

    @Test
    public void testRegister() {
        String uniqueEmail = "test" + System.currentTimeMillis() + "@example.com";
        assertTrue(BL.register(uniqueEmail, "password123"));
    }

    @Test
    public void testLogin() {
        BL.register("user@example.com", "securePass");
        assertTrue(BL.login("user@example.com", "securePass"));
    }

    @Test
    public void testEditProfile() {
        BL.register("edit@example.com", "oldPass");
        assertTrue(BL.editProfile("edit@example.com", "newPass"));
    }
}
