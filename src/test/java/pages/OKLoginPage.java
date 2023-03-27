package pages;

import org.openqa.selenium.By;
import com.codeborne.selenide.Condition;
import utils.User;
import static com.codeborne.selenide.Selenide.$;

public class OKLoginPage implements OKPage {
    private static final By LOGIN_LOCATOR = new By.ById("field_email");
    private static final By PASSWORD_LOCATOR = new By.ById("field_password");
    private static final By LOGIN_BUTTON_LOCATOR = new By.ByCssSelector(".button-pro.__wide");

    public OKMainPage login(User user) {
        $(LOGIN_LOCATOR).shouldBe(Condition.visible).setValue(user.getLogin());
        $(PASSWORD_LOCATOR).shouldBe(Condition.visible).setValue(user.getPassword());
        $(LOGIN_BUTTON_LOCATOR).shouldBe(Condition.visible).click();
        return new OKMainPage();
    }

    @Override
    public boolean check() {
        return $(LOGIN_BUTTON_LOCATOR).exists();
    }
}
