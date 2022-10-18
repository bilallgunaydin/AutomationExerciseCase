package stepDefinitions;

import PageObjectModel.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class RegisterPageSteps {

    WebDriver driver;
    RegisterPage registerPage = new RegisterPage();


    @Given("Navigate to Web Site")
    public void navigate_to_web_site() {
        registerPage.navigate_to_web_site();
    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        registerPage.verify_that_home_page_is_visible_successfully();
    }

    @And("Click on Signup Login button")
    public void click_on_signup_login_button() {
        registerPage.click_on_signup_login_button();
    }

    @Then("Verify New User Signup is visible")
    public void verify_new_user_signup_is_visible() {
        registerPage.verify_new_user_signup_is_visible();
    }

    @And("Enter name and email address")
    public void enter_name_and_email_address() {
        registerPage.enter_name_and_email_address();
    }

    @And("Click Signup button")
    public void click_signup_button() {
        registerPage.click_signup_button();
    }

    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String text) {
        registerPage.verify_that_is_visible(text);
    }

    @And("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() throws InterruptedException {
        registerPage.fill_details_title_name_email_password_date_of_birth();
    }

    @And("Click Create Button")
    public void clickCreateButton() {
        registerPage.clickCreateButton();
    }

    @Then("Verify that {string} message")
    public void verifyThatIsVisiblee(String text) {
        registerPage.verifyThatIsVisiblee(text);
    }

    @And("Click Continue button")
    public void click_continue_button() throws InterruptedException {
        registerPage.click_continue_button();
    }

    @Then("Verify that {string} text")
    public void verifyThatMessagee(String text) {
        registerPage.verifyThatMessagee(text);
    }

    @And("Click Delete Account button")
    public void click_delete_account_button() {
        registerPage.click_delete_account_button();
    }

    @Then("Verify that {string} is visible and click Continue button")
    public void verify_that_is_visible_and_click_continue_button(String text) throws InterruptedException {
        registerPage.verify_that_is_visible_and_click_continue_button(text);
    }


    @And("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        registerPage.enterNameAndAlreadyRegisteredEmailAddress();
    }

    @Then("Verify errorr {string} is visible")
    public void verifyErrorrEmailAddressAlreadyExistIsVisible(String text) {
        registerPage.verifyErrorrEmailAddressAlreadyExistIsVisible(text);
    }

    @Then("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        registerPage.verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount();
    }

    @Then("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        registerPage.verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount();
    }
}
