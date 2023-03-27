package tests;

import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.OKLoginPage;
import pages.OKMainPage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OKLoginTest extends OKTest {
    private static OKLoginPage loginPage;
    private static OKMainPage mainPage;

    @BeforeEach
    public void setup() {
        loginPage = new OKLoginPage();
    }

    @Test
    @Tag("Login")
    @DisplayName("See if it is a login page")
    public void loginPageTest() {
        assertTrue(loginPage.check());
    }

    @Test
    @Tag("Login")
    @DisplayName("Test log in")
    public void loginTest() throws IOException {
        mainPage = loginPage.login(readConfig());
        assertTrue(mainPage.check());
        mainPage.logout();
    }
}
