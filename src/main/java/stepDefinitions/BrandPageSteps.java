package stepDefinitions;

import PageObjectModel.BrandPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BrandPageSteps {
    BrandPage brandPage = new BrandPage();

    @Then("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {
        brandPage.verifyThatBrandsAreVisibleOnLeftSideBar();
    }

    @And("Click on any brand name")
    public void clickOnAnyBrandName() {
        brandPage.clickOnAnyBrandName();
    }

    @Then("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        brandPage.verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed();
    }

    @And("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        brandPage.onLeftSideBarClickOnAnyOtherBrandLink();
    }

    @Then("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        brandPage.verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts();
    }
}
