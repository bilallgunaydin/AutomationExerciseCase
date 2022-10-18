package stepDefinitions;

import PageObjectModel.ProductPage;
import PageObjectModel.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductPageSteps {
    ProductPage productPage = new ProductPage();

    @And("Click on Products button")
    public void clickOnProductsButton() {
        productPage.clickOnProductsButton();
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        productPage.verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully();
    }

    @And("The products list is visible")
    public void theProductsListIsVisible() {
        productPage.theProductsListIsVisible();
    }

    @And("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {
        productPage.clickOnViewProductOfFirstProduct();
    }

    @And("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        productPage.userIsLandedToProductDetailPage();
    }

    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        productPage.verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand();
    }

    @And("Enter product name {string} in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton(String product) {
        productPage.enterProductNameInSearchInputAndClickSearchButton(product);
    }

    @Then("Verifyy {string} is visible")
    public void verifyySEARCHEDPRODUCTSIsVisible(String text) {
        productPage.verifyySEARCHEDPRODUCTSIsVisible(text);
    }

    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        productPage.verifyAllTheProductsRelatedToSearchAreVisible();
    }

    @And("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() throws InterruptedException {
        productPage.hoverOverFirstProductAndClickAddToCart();
    }

    @When("Click Continue Shopping button")
    public void clickContinueShoppingButton() throws InterruptedException {
        productPage.clickContinueShoppingButton();
    }

    @And("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() throws InterruptedException {
        productPage.hoverOverSecondProductAndClickAddToCart();
    }

    @And("Click View Cart button")
    public void clickViewCartButton() throws InterruptedException {
        productPage.clickViewCartButton();
    }

    @Then("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        productPage.verifyBothProductsAreAddedToCart();
    }

    @Then("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        productPage.verifyTheirPricesQuantityAndTotalPrice();
    }

    @And("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() throws InterruptedException {
        productPage.clickViewProductForAnyProductOnHomePage();
    }

    @And("Increase quantity to {int}")
    public void ıncreaseQuantityTo(int number) {
        productPage.ıncreaseQuantityTo(number);
    }

    @And("Click Add to cart button")
    public void clickAddToCartButton() {
        productPage.clickAddToCartButton();
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        productPage.verifyThatProductIsDisplayedInCartPageWithExactQuantity();
    }

    @And("Click Proceed To Checkout button")
    public void clickProceedToCheckoutButton() {
        productPage.clickProceedToCheckoutButton();
    }

    @And("Click Register Login button")
    public void clickRegisterLoginButton() throws InterruptedException {
        productPage.clickRegisterLoginButton();
    }

    @And("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage();
        registerPage.enter_name_and_email_address();
        registerPage.click_signup_button();
        registerPage.fill_details_title_name_email_password_date_of_birth();
        registerPage.clickCreateButton();
    }

    @Then("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        productPage.verifyAddressDetailsAndReviewYourOrder();
    }

    @And("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        productPage.enterDescriptionInCommentTextAreaAndClickPlaceOrder();
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() throws InterruptedException {
        productPage.enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate();
    }

    @Then("Verify success message {string}")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully(String message) throws InterruptedException {
        productPage.verifySuccessMessageYourOrderHasBeenPlacedSuccessfully(message);
    }

    @Then("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        productPage.verifyThatCartPageIsDisplayed();
    }

    @And("Click X button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() {
        productPage.clickXButtonCorrespondingToParticularProduct();
    }

    @Then("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() throws InterruptedException {
        productPage.verifyThatProductIsRemovedFromTheCart();
    }

    @Then("Verifyyyy {string} is visible")
    public void verifyyyyWriteYourReviewIsVisible(String text) {
        productPage.verifyyyyWriteYourReviewIsVisible(text);
    }

    @And("Enter name, email and review")
    public void enterNameEmailAndReview() {
        productPage.enterNameEmailAndReview();
    }

    @And("Click Submitt button")
    public void clickSubmitButton() {
        productPage.clickSubmitButton();
    }

    @Then("Verifyyyyy success message {string}")
    public void verifyyyyySuccessMessageThankYouForYourReview(String text) {
        productPage.verifyyyyySuccessMessageThankYouForYourReview(text);
    }

    @And("Scroll to bottom of page")
    public void scrollToBottomOfPage() {
        productPage.scrollToBottomOfPage();
    }

    @Then("Verify RECOMMENDED ITEMS are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {
        productPage.verifyRECOMMENDEDITEMSAreVisible();
    }

    @And("Click on Add To Cart on Recommended product")
    public void clickOnAddToCartOnRecommendedProduct() {
        productPage.clickOnAddToCartOnRecommendedProduct();
    }

    @Then("Verify that product is displayed in cart page")
    public void verifyThatProductIsDisplayedInCartPage() {
        productPage.verifyThatProductIsDisplayedInCartPage();
    }


    @And("Click Download Invoice button and verify invoice is downloaded successfully.")
    public void clickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() throws InterruptedException {
        productPage.clickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully();
    }

    @And("Click Continueee button")
    public void clickContinueeeButton() {
        productPage.clickContinueeeButton();
    }
}
