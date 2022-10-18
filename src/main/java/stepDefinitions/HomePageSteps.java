package stepDefinitions;

import PageObjectModel.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @And("Scroll down to footer")
    public void scrollDownToFooter() {
        homePage.scrollDownToFooter();
    }

    @Then("Verify text {string}")
    public void verifyTextSUBSCRIPTION(String text) {
        homePage.verifyTextSUBSCRIPTION(text);
    }

    @And("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() {
        homePage.enterEmailAddressInInputAndClickArrowButton();
    }

    @Then("Verify success message {string} is visiblee")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisiblee(String message) {
        homePage.verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisiblee(message);
    }

    @And("Click Cart button")
    public void clickCartButton() {
        homePage.clickCartButton();
    }

    @And("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward() throws InterruptedException {
        homePage.clickOnArrowAtBottomRightSideToMoveUpward();
    }


    @And("Scroll up page to top")
    public void scrollUpPageToTop() {
        homePage.scrollUpPageToTop();
    }

    @Then("Verify that page is scrolled up and {string} text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen(String message) throws InterruptedException {
        homePage.verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen(message);
    }
}
