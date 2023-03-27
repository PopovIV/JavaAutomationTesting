package tests;

import java.io.IOException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.OKLoginPage;
import pages.OKMainPage;
import pages.OKSearchPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OKSearchTest extends OKTest{
    private static OKLoginPage loginPage;
    private static OKMainPage mainPage;
    private static OKSearchPage searchPage;

    private static final String SEARCH_REQUEST = "jupiter";

    @BeforeEach
    public void setup() throws IOException {
        loginPage = new OKLoginPage();
        mainPage = loginPage.login(readConfig());
    }

    @Test
    @Tag("Search")
    @DisplayName("See if it is a search page")
    public void SearchPageTest() {
        searchPage = mainPage.searchByString(SEARCH_REQUEST);
        assertTrue(searchPage.check());
    }

    @AfterEach
    void finish() {
        mainPage.logout();
    }
}
