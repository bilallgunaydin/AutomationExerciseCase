package stepDefinitions;

import PageObjectModel.ContactUsPage;
import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ContactUsPageSteps {
    ContactUsPage contactUsPage = new ContactUsPage();

    @And("Click on Contact Us button")
    public void clickOnContactUsButton() {
        contactUsPage.clickOnContactUsButton();
    }

    @Then("Verify {string} is visible")
    public void verifyGETINTOUCHIsVisible(String text) {
        contactUsPage.verifyGETINTOUCHIsVisible(text);
    }

    @And("Enter name, email, subject and message")
    public void enterNameEmailSubjectAndMessage() {
        contactUsPage.enterNameEmailSubjectAndMessage();
    }

    @And("Upload file")
    public void uploadFile() {
        contactUsPage.uploadFile();
    }

    @And("Click Submit button")
    public void clickSubmitButton() throws InterruptedException {
        contactUsPage.clickSubmitButton();
    }

    @And("Click OK button")
    public void clickOKButton() throws InterruptedException {
        contactUsPage.clickOKButton();
    }

    @Then("Verify success message {string} is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible(String text) {
        contactUsPage.verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible(text);
    }

    @And("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        contactUsPage.clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully();
    }

    @After
    public void close() {
        Driver.TearDown();
    }
}
