package pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class OKProfilePage implements OKPage {
    private static final By PROFILE_NAME_LOCATOR = new By.ByXPath("//*[@id= 'hook_Block_AdditionalColumn']");

    // Check if opened page is MainPage
    @Override
    public boolean check() {
        return $(PROFILE_NAME_LOCATOR).isDisplayed();
    }
}
