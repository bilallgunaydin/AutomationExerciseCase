package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestCasesPage extends BasePage {
    WebDriver driver;

    public TestCasesPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    By testCasesElement = By.partialLinkText("Test Cas");

    public void click_on_button() {
        click(testCasesElement);
    }

    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        checkUrl(driver.getCurrentUrl(), "https://automationexercise.com/test_cases");
    }
}
