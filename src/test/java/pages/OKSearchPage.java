package pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class OKSearchPage implements OKPage {
    private static final By SEARCH_BAR_LOCATOR = new By.ByXPath("//*[@class= 'wrap-input__w4hf7']");

    // Check if opened page is MainPage
    @Override
    public boolean check() {
        return $(SEARCH_BAR_LOCATOR).isDisplayed();
    }
}
