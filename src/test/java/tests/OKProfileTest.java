package tests;

import java.io.IOException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.OKLoginPage;
import pages.OKMainPage;
import pages.OKProfilePage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OKProfileTest extends OKTest{
    private static OKLoginPage loginPage;
    private static OKMainPage mainPage;
    private static OKProfilePage profilePage;

    @BeforeEach
    public void setup() throws IOException {
        loginPage = new OKLoginPage();
        mainPage = loginPage.login(readConfig());
    }

    @Test
    @Tag("Profile")
    @DisplayName("See if it is a profile page")
    public void ProfilePageTest() {
        profilePage = mainPage.goToProfile();
        assertTrue(profilePage.check());
    }

    @AfterEach void finish() {
        mainPage.logout();
    }
}