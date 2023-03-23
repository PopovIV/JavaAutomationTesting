import org.openqa.selenium.By;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class OKProfilePage {
    private static final By PROFILE_NAME_LOCATOR = new By.ByClassName("online-fr_no-online");

    public String returnNoFriendsOnline() {
        return $(PROFILE_NAME_LOCATOR).text();
    }
}
