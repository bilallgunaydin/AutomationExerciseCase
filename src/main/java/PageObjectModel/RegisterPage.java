package PageObjectModel;

import Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class RegisterPage extends BasePage {

    WebDriver driver;
    WebDriverWait wait;
    Faker faker = new Faker();
    Actions actions;

    public RegisterPage() {
        driver = Driver.getDriver();
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigate_to_web_site() {
        driver.manage().window().maximize();
        driver.get("http://automationexercise.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void verify_that_home_page_is_visible_successfully() {
        String getUrl = driver.getCurrentUrl();
        checkUrl(getUrl, "https://automationexercise.com/");
    }

    By click_on_signup_login_buttonElement = By.partialLinkText("Signup / Log");

    public void click_on_signup_login_button() {
        click(click_on_signup_login_buttonElement);
    }

    By verify_new_user_signup_is_visibleElement = By.xpath("//h2[contains(text(),'New User Signup!')]");

    public void verify_new_user_signup_is_visible() {
        checkElementWithText(verify_new_user_signup_is_visibleElement, "New User Signup!");
    }


    By nameElement = By.xpath(("//input[@type='text']"));
    WebElement changeElement;

    public void enter_name_and_email_address() {

        changeElement = findElement(nameElement);
        actions.moveToElement(changeElement)
                .click()
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).perform();

    }

    By click_signup_buttonElement = By.xpath("//button[contains(text(),'Signup')]");

    public void click_signup_button() {
        click(click_signup_buttonElement);
    }

    By verify_that_is_visibleElement = By.xpath("//b[contains(text(),'Enter Account Information')]");

    public void verify_that_is_visible(String text) {
        checkElementWithText(verify_that_is_visibleElement, text);
    }

    By genderElement = By.id("id_gender1");
    By passwordElement = By.id("password");
    By daysElement = By.id("days");
    By monthsELement = By.id("months");
    By yearsElement = By.id("years");
    By newsLetterElement = By.id("newsletter");
    By optinElement = By.id("optin");
    By firstNameElement = By.id("first_name");
    By lastNameElement = By.id("last_name");
    By address1Element = By.id("address1");
    By countryElement = By.id("country");
    By stateElement = By.id("state");
    By cityElement = By.id("city");
    By zipcodeElement = By.id("zipcode");
    By mobile_numberElement = By.id("mobile_number");
    public static String fullName;
    public static String firstName = "";
    public static String lastName = "";
    public static String address1 = "";
    public static String city = "";
    public static String state = "";
    public static String country = "";
    public static String zipcode = "";
    public static String mobile_number = "";


    public void fill_details_title_name_email_password_date_of_birth() throws InterruptedException {
        changeElement = findElement(genderElement);
        actions.moveToElement(changeElement).click().perform();
        sendKey(passwordElement, faker.internet().password());
        selectElementFromDropdown(daysElement, "20");
        selectElementFromDropdown(monthsELement, "August");
        selectElementFromDropdown(yearsElement, "1990");
        click(newsLetterElement);
        click(optinElement);
        firstName = faker.name().firstName();
        sendKey(firstNameElement, firstName);
        lastName = faker.name().lastName();
        sendKey(lastNameElement, lastName);
        fullName = "Mr. " + firstName + " " + lastName;
        address1 = faker.address().fullAddress();
        sendKey(address1Element, address1);
        country = "United States";
        selectElementFromDropdown(countryElement, country);
        state = faker.address().state();
        sendKey(stateElement, state);
        city = faker.address().city();
        sendKey(cityElement, city);
        zipcode = faker.address().zipCode();
        sendKey(zipcodeElement, zipcode);
        mobile_number = faker.phoneNumber().cellPhone();
        sendKey(mobile_numberElement, mobile_number);

    }

    By continueElement = By.xpath("//button[contains(text(),'Create Account')]");


    public void clickCreateButton() {
        changeElement = findElement(continueElement);
        scrollToElement(changeElement);
        click(continueElement);
    }

    By verifyThatIsVisibleeElement = By.xpath("//b[contains(text(),'Account Created!')]");

    public void verifyThatIsVisiblee(String text) {
        checkElementWithText(verifyThatIsVisibleeElement, text);
    }

    By click_continue_buttonElement = By.xpath("//a[contains(text(),'Continue')]");

    public void click_continue_button() throws InterruptedException {
        Thread.sleep(1000);
        click(click_continue_buttonElement);
    }

    By verifyThatIsVisibleeeElement = By.xpath("//a[contains(text(),' Logged in as ')]");

    public void verifyThatMessagee(String text) {
        checkElementWithText(verifyThatIsVisibleeeElement, text);
    }

    By click_delete_account_buttonElement = By.partialLinkText("Delete Accou");

    public void click_delete_account_button() {
        click(click_delete_account_buttonElement);
    }

    By verify_that_is_visible_and_click_continue_buttonElement = By.xpath("//b[contains(text(),'Account Deleted!')]");
    By continueButtonElement = By.xpath("//a[contains(text(),'Continue')]");

    public void verify_that_is_visible_and_click_continue_button(String text) throws InterruptedException {
        checkElementWithText(verify_that_is_visible_and_click_continue_buttonElement, text);
        Thread.sleep(2000);
        click(continueButtonElement);
    }

    public void enterNameAndAlreadyRegisteredEmailAddress() {
        changeElement = findElement(nameElement);
        actions.moveToElement(changeElement).click()
                .sendKeys("Cancancan123")
                .sendKeys(Keys.TAB)
                .sendKeys("Cancancan123@gmail.com").perform();
    }

    By errorEmailAlreadyExistElement = By.xpath("//p[contains(text(),'Email Address already exist!')]");

    public void verifyErrorrEmailAddressAlreadyExistIsVisible(String text) {
        checkElementWithText(errorEmailAlreadyExistElement, text);
    }

    By getFullNameForDelivery = By.xpath("//*[@id=\"address_delivery\"]/li[2]");

    By getAddress1ForDelivery = By.xpath("//*[@id=\"address_delivery\"]/li[4]");

    By getCityAdressStatePostcodeForDelivery = By.xpath("//*[@id=\"address_delivery\"]/li[6]");

    By getCountryForDelivery = By.xpath("//*[@id=\"address_delivery\"]/li[7]");
    By getPhoneForDelivery = By.xpath("//*[@id=\"address_delivery\"]/li[8]");

    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        checkElementWithText(getFullNameForDelivery, fullName);
        checkElementWithText(getAddress1ForDelivery, address1);
        checkElementWithText(getCityAdressStatePostcodeForDelivery, city + " " + state + " " + zipcode);
        checkElementWithText(getCountryForDelivery, country);
        checkElementWithText(getPhoneForDelivery, mobile_number);
    }

    By getFullNameForBilling = By.xpath("//*[@id=\"address_invoice\"]/li[2]");
    By getAddress1ForBilling = By.xpath("//*[@id=\"address_invoice\"]/li[4]");
    By getCityAdressStatePostcodeForBilling = By.xpath("//*[@id=\"address_invoice\"]/li[6]");
    By getCountryForBilling = By.xpath("//*[@id=\"address_invoice\"]/li[7]");
    By getPhoneForBilling = By.xpath("//*[@id=\"address_invoice\"]/li[8]");

    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        checkElementWithText(getFullNameForBilling, fullName);
        checkElementWithText(getAddress1ForBilling, address1);
        checkElementWithText(getCityAdressStatePostcodeForBilling, city + " " + state + " " + zipcode);
        checkElementWithText(getCountryForBilling, country);
        checkElementWithText(getPhoneForBilling, mobile_number);
    }
}
