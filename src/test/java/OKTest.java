import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static com.codeborne.selenide.Selenide.open;

public class OKTest {
    private static final String URL = "https://ok.ru";
    private static final String LOGIN = "botS23AT17";
    private static final String PASSWORD = "autotests2023";

    @Test
    public void userCanLoginByUsername() {
        open(URL);
        OKLoginPage loginPage = new OKLoginPage();
        OKProfilePage profilePage = loginPage.login(LOGIN, PASSWORD);
        assertThat(profilePage.returnNoFriendsOnline(), not(isEmptyOrNullString()));
    }

    @Test
    public void isLargeString() {
        open(URL);
        OKLoginPage loginPage = new OKLoginPage();
        OKProfilePage profilePage = loginPage.login(LOGIN, PASSWORD);
        assertThat(profilePage.returnNoFriendsOnline(), OKCustomMatcher.isALargeString());
    }
}
