package pages;

import org.openqa.selenium.By;
import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;

public class OKMainPage implements OKPage {
    private static final By NAVIGATION_TAB_LOCATOR = new By.ByXPath("//ul[@class= 'toolbar_nav']");
    private static final By SEARCH_LOCATOR = new By.ByXPath("//*[@type= 'text' and @name='st.query']");
    private static final By PROFILE_LOCATOR = new By.ByXPath("//div[@class= 'nav-side_i-w']");

    private static final By MINI_PROFILE_LOCATOR = new By.ByXPath("//div[@class= 'ucard-mini_cnt']");
    private static final By LOGOUT_LOCATOR = new By.ByXPath("//a[@data-l= 't,logout']");
    private static final By LOGOUT_CONFIRM_LOCATOR = new By.ByXPath("//input[@data-l= 't,logout']");

    private static final By LANGUAGE_LOCATOR = new By.ByXPath("//a[@class= 'u-menu_a' and @href='/feed']");
    private static final By CURRENT_LANGUAGE_LOCATOR = new By.ByXPath("//div[@class= 'sel-lang_i.lstp-t']");
    private static final By FIRST_LANGUAGE_LOCATOR = new By.ByXPath("//*[@class= 'sel-lang_i.o']");

    // Check if opened page is MainPage
    @Override
    public boolean check() {
        return $(NAVIGATION_TAB_LOCATOR).isDisplayed();
    }

    public void changeLanguageToFirstInList() {
        $(MINI_PROFILE_LOCATOR).shouldBe(Condition.visible).click();
        $(LANGUAGE_LOCATOR).shouldBe(Condition.visible).click();
        $(FIRST_LANGUAGE_LOCATOR).shouldBe(Condition.visible).click();
    }

    public String getCurrentPageLanguage()  {
        $(MINI_PROFILE_LOCATOR).shouldBe(Condition.visible).click();
        $(LANGUAGE_LOCATOR).shouldBe(Condition.visible).click();
        return $(CURRENT_LANGUAGE_LOCATOR).shouldBe(Condition.visible).text();
    }

    public OKSearchPage searchByString(String searchInput) {
        $(SEARCH_LOCATOR).shouldBe(Condition.visible).setValue(searchInput).pressEnter();
        return new OKSearchPage();
    }

    public OKProfilePage goToProfile() {
        $(PROFILE_LOCATOR).shouldBe(Condition.visible).click();
        return new OKProfilePage();
    }

    public  void logout() {
        $(MINI_PROFILE_LOCATOR).shouldBe(Condition.visible).click();
        $(LOGOUT_LOCATOR).shouldBe(Condition.visible).click();
        $(LOGOUT_CONFIRM_LOCATOR).shouldBe(Condition.visible).click();
    }
}
