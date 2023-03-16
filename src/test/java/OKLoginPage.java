import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OKLoginPage {
    private static final By LOGIN_LOCATOR = new By.ById("field_email");
    private static final By PASSWORD_LOCATOR = new By.ById("field_password");
    private static final By LOGIN_BUTTON_LOCATOR = new By.ByCssSelector(".button-pro.__wide");

    public OKProfilePage login(String login, String password) {
        $(LOGIN_LOCATOR).setValue(login);
        $(PASSWORD_LOCATOR).setValue(password);
        $(LOGIN_BUTTON_LOCATOR).click();
        return new OKProfilePage();
    }

}
