package stepDefinitions;

import PageObjectModel.CategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CategoryPageSteps {
    CategoryPage categoryPage = new CategoryPage();

    @Then("Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {
        categoryPage.verifyThatCategoriesAreVisibleOnLeftSideBar();
    }

    @And("Click on Women category")
    public void clickOnWomenCategory() {
        categoryPage.clickOnWomenCategory();
    }

    @And("Click on Dress category")
    public void clickOnDressCategory() {
        categoryPage.clickOnDressCategory();
    }

    @Then("Verify that category page is displayed and confirm text {string}")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENDRESSPRODUCTS(String text) {
        categoryPage.verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENDRESSPRODUCTS(text);
    }

    @And("On left side bar, click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
        categoryPage.onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory();
    }

    @Then("Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {

    }
}
