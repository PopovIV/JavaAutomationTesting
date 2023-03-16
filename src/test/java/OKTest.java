import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class OKTest {
    private static final String URL = "https://ok.ru";
    private static final String LOGIN = "sgjskglkllgs";
    private static final String PASSWORD = "JKJkkd";

    @Test
    public void userCantLoginByUsername() {
        open(URL);
        OKLoginPage loginPage = new OKLoginPage();
        OKProfilePage profilePage = loginPage.login(LOGIN, PASSWORD);
        profilePage.checkIfNotProfile();
    }
}
