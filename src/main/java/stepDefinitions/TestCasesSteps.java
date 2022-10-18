package stepDefinitions;

import PageObjectModel.TestCasesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TestCasesSteps {
    TestCasesPage testCasesPage = new TestCasesPage();

    @And("Click on Test Cases button")
    public void click_on_button() {
        testCasesPage.click_on_button();
    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        testCasesPage.verify_user_is_navigated_to_test_cases_page_successfully();
    }
}
