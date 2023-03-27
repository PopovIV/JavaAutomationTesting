package tests;

import java.io.IOException;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.OKLoginPage;
import pages.OKMainPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Test to see if we can log in account
public class OKMainTest extends OKTest {
    private static OKLoginPage loginPage;
    private static OKMainPage mainPage;

    @BeforeEach
    public void setup() throws IOException {
        loginPage = new OKLoginPage();
        mainPage = loginPage.login(readConfig());
    }

    // currently not working well :(
    @Test
    @Disabled
    @Tag("Main")
    @DisplayName("See if we can change language to first in line")
    public void changeLanguageTest() throws InterruptedException {
        String langName = mainPage.getCurrentPageLanguage();
        mainPage.changeLanguageToFirstInList();
        assertThat(mainPage.getCurrentPageLanguage(), CoreMatchers.equalTo(langName));
        mainPage.changeLanguageToFirstInList();
    }

    @Test
    @Tag("Main")
    @DisplayName("See if it is a main page")
    public void loginPageTest() {
        assertTrue(mainPage.check());
    }

    @AfterEach
    void finish() {
        mainPage.logout();
    }
}
