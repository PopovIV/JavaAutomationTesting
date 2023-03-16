import org.openqa.selenium.By;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class OKProfilePage {
    private static final By PROFILE_NAME_LOCATOR = new By.ById(".tico.ellip");

    public void checkIfNotProfile() {
        $(PROFILE_NAME_LOCATOR).shouldNot(Condition.exist);
    }
}
