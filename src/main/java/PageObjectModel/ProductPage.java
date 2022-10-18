package PageObjectModel;

import Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.*;


public class ProductPage extends BasePage {
    WebDriver driver;
    WebDriverWait wait;
    Faker faker = new Faker();
    Actions actions;
    Dimension newDimension = new Dimension(800, 600);

    public ProductPage() {
        driver = Driver.getDriver();
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    By productLinkElement = By.xpath("//a[@href='/products']");

    public void clickOnProductsButton() {
        click(productLinkElement);
    }

    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        checkUrl(driver.getCurrentUrl(), "https://automationexercise.com/products");
    }

    By productListVisibleElement = By.className("features_items");

    public void theProductsListIsVisible() {
        checkElementVisible(productListVisibleElement);
    }

    By firstProductElement = By.xpath("//a[@href='/product_details/1']");

    WebElement changeElement;

    public void clickOnViewProductOfFirstProduct() {
        changeElement = findElement(firstProductElement);
        scrollToElement(changeElement);
        click(firstProductElement);
    }

    public void userIsLandedToProductDetailPage() {

        checkUrl(driver.getCurrentUrl(), "https://automationexercise.com/product_details/1");
    }


    By productNameElement = By.xpath("//h2[contains(text(),'Blue Top')]");
    By categoryNameElement = By.xpath("//p[contains(text(),'Category: Women > Tops')]");
    By productPriceElement = By.xpath("//span[contains(text(),'Rs. 500')]");
    By availabilityElement = By.xpath("//b[contains(text(),'Availability:')]");
    By conditionElement = By.xpath("//b[contains(text(),'Condition:')]");
    By brandElement = By.xpath("//b[contains(text(),'Brand:')]");

    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        checkElementVisible(productNameElement);
        checkElementVisible(categoryNameElement);
        checkElementVisible(productPriceElement);
        checkElementVisible(availabilityElement);
        checkElementVisible(conditionElement);
        checkElementVisible(brandElement);
    }

    By productSendKeysElement = By.xpath("//input[@id='search_product']");
    By searchProductButtonElement = By.xpath("//button[@id='submit_search']");

    public void enterProductNameInSearchInputAndClickSearchButton(String product) {
        sendKey(productSendKeysElement, product);
        click(searchProductButtonElement);
    }

    By visibleProductsTextElement = By.xpath("//h2[contains(text(),'Searched Products')]");

    public void verifyySEARCHEDPRODUCTSIsVisible(String text) {
        checkElementWithText(visibleProductsTextElement, text);
    }

    By verifyProdctResultElement = By.xpath("//div[@class='product-overlay']");


    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        checkElementVisible(verifyProdctResultElement);
    }

    By first = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]");
    By firstProduct = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a");

    public void hoverOverFirstProductAndClickAddToCart() throws InterruptedException {
        WebElement firstElement = findElement(first);
        driver.manage().window().setSize(new Dimension(800, 600));
        scrollToElement(firstElement);
        actions.moveToElement(firstElement).build().perform();
        Thread.sleep(2000);
        click(firstProduct);
        driver.manage().window().maximize();
    }

    By continueButtonElement = By.xpath("//button[contains(text(),'Continue Shopping')]");

    public void clickContinueShoppingButton() throws InterruptedException {
        Thread.sleep(2000);
        click(continueButtonElement);
    }

    By second = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a");
    By secondProductElement = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a");

    public void hoverOverSecondProductAndClickAddToCart() throws InterruptedException {
        WebElement secondElement = findElement(second);
        driver.manage().window().setSize(new Dimension(1200, 800));
        scrollToElement(secondElement);
        actions.moveToElement(secondElement).build().perform();
        Thread.sleep(2000);
        click(secondProductElement);
        driver.manage().window().maximize();
    }

    By viewCartElement = By.xpath("//u[contains(text(),'View Cart')]");

    public void clickViewCartButton() throws InterruptedException {
        Thread.sleep(2000);
        changeElement = findElement(viewCartElement);
        scrollToElement(changeElement);
        click(viewCartElement);
    }

    By productElementsForBasket = By.cssSelector(".cart_description>h4>a");

    public void verifyBothProductsAreAddedToCart() {
        boolean check = false;
        List<WebElement> productList = findElements(productElementsForBasket);
        if (productList != null)
            check = true;

        checkBoolean(check);
    }

    By productName = By.className("cart_description");
    By cartPrice = By.className("cart_price");
    By cartQuantity = By.className("cart_quantity");
    By cartTotalPrice = By.className("cart_total_price");

    public void verifyTheirPricesQuantityAndTotalPrice() {
        List<WebElement> productList = driver.findElements(productName);
        List<WebElement> cartPriceList = driver.findElements(cartPrice);
        List<WebElement> cartQuantityList = driver.findElements(cartQuantity);
        List<WebElement> cartTotalPriceList = driver.findElements(cartTotalPrice);
        List<String> ExpectedList = new ArrayList<>();
        ExpectedList.add("Blue Top\n" +
                "Women > Tops");
        ExpectedList.add("Rs. 500");
        ExpectedList.add("1");
        ExpectedList.add("Rs. 500");
        ExpectedList.add("Men Tshirt\n" +
                "Men > Tshirts");
        ExpectedList.add("Rs. 400");
        ExpectedList.add("1");
        ExpectedList.add("Rs. 400");


        List<String> actualList = new ArrayList<String>();

        for (int i = 0; i < productList.size(); i++) {

            actualList.add(productList.get(i).getText());
            actualList.add(cartPriceList.get(i).getText());
            actualList.add(cartQuantityList.get(i).getText());
            actualList.add(cartTotalPriceList.get(i).getText());
        }

        checkStringList(ExpectedList, actualList);
    }

    By anyProductElement = By.linkText("View Product");

    public void clickViewProductForAnyProductOnHomePage() throws InterruptedException {
        changeElement = findElement(anyProductElement);
        scrollToElement(changeElement);
        click(anyProductElement);
    }

    By quantityElement = By.id("quantity");

    public void ıncreaseQuantityTo(int number) {
        changeElement = findElement(quantityElement);
        changeElement.clear();
        sendKey(quantityElement, String.valueOf(number));
    }

    By addToCartButtonElement = By.xpath("//button[@class='btn btn-default cart']");

    public void clickAddToCartButton() {
        click(addToCartButtonElement);
    }

    By checkQuantityElement = By.className("disabled");

    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        checkElementWithText(checkQuantityElement, "4");
    }

    By prooceedToChekoutElement = By.xpath("//a[contains(text(),'Proceed To Checkout')]");

    public void clickProceedToCheckoutButton() {
        click(prooceedToChekoutElement);
    }

    By registerLoginElement = By.xpath("//u[contains(text(),'Register / Login')]");

    public void clickRegisterLoginButton() throws InterruptedException {
        Thread.sleep(1000);
        click(registerLoginElement);
    }

    By address_deliveryElement = By.id("address_delivery");
    By firstOrderProduct = By.id("product-1");

    public void verifyAddressDetailsAndReviewYourOrder() {
        checkElementVisible(address_deliveryElement);
        checkElementVisible(firstOrderProduct);
    }

    By textAreaElement = By.tagName("textarea");
    By placeOrderElement = By.partialLinkText("Place Ord");

    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        changeElement = findElement(placeOrderElement);
        scrollToElement(changeElement);
        sendKey(textAreaElement, faker.name().fullName() + faker.name().fullName());
        click(placeOrderElement);
    }

    By nameOnCard = By.name("name_on_card");
    By cardNumber = By.name("card_number");
    By cvc = By.name("cvc");
    By month = By.name("expiry_month");
    By year = By.name("expiry_year");
    By submitButton = By.xpath("//button[@id='submit']");

    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() throws InterruptedException {
        changeElement = findElement(submitButton);
        scrollToElement(changeElement);
        sendKey(nameOnCard, "Deneme");
        sendKey(cardNumber, "123123124125");
        sendKey(cvc, "311");
        sendKey(month, "10");
        sendKey(year, "2025");
    }

    By successfullyMessage = By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[4]/div/div");

    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully(String message) throws InterruptedException {
        click(submitButton);
        driver.navigate().back();
        checkElementWithText(successfullyMessage, message);
        Thread.sleep(5000);
        click(submitButton);
    }

    public void verifyThatCartPageIsDisplayed() {
        checkUrl(driver.getCurrentUrl(), "https://automationexercise.com/view_cart");
    }

    By deleteProductElement = By.xpath("/html/body/section/div/div[2]/table/tbody/tr/td[6]/a");

    public void clickXButtonCorrespondingToParticularProduct() {
        click(deleteProductElement);
    }

    By checkCartElement = By.xpath("/html/body/section/div/div[2]/span/p/b");

    public void verifyThatProductIsRemovedFromTheCart() throws InterruptedException {
        Thread.sleep(1000);
        checkElementWithText(checkCartElement, "Cart is empty!");
    }

    By writeYourReviewWlement = By.xpath("//a[contains(text(),'Write Your Review')]");

    public void verifyyyyWriteYourReviewIsVisible(String text) {
        checkElementWithText(writeYourReviewWlement, text);
    }

    By nameElement = By.xpath("//input[@id='name']");

    public void enterNameEmailAndReview() {
        changeElement = findElement(submitButtonElement);
        scrollToElement(changeElement);
        actions.moveToElement(changeElement).click()
                .sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.country().currencyCode())
                .perform();
    }

    By submitButtonElement = By.xpath("//button[@id='button-review']");

    public void clickSubmitButton() {
        click(submitButtonElement);
    }

    By verifyTextMessage = By.xpath("/html/body/section/div/div/div[2]/div[3]/div[2]/div/div/form/div/div/div/span");

    public void verifyyyyySuccessMessageThankYouForYourReview(String text) {
        checkElementWithText(verifyTextMessage, text);
    }

    By recomendedElement = By.xpath("/html/body/section[2]/div/div/div[2]/div[2]/h2");

    public void scrollToBottomOfPage() {
        changeElement = findElement(recomendedElement);
        scrollToElement(changeElement);
    }

    public void verifyRECOMMENDEDITEMSAreVisible() {
        checkElementVisible(recomendedElement);
    }


    By recomentProductElement = By.xpath("html/body/section[2]/div/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/a");

    public void clickOnAddToCartOnRecommendedProduct() {
        changeElement = findElement(recomentProductElement);
        scrollToElement(changeElement);
        click(recomentProductElement);
    }

    By cartProductElement = By.xpath("/html/body/section/div/div[2]/table/tbody/tr");

    public void verifyThatProductIsDisplayedInCartPage() {
        checkElementVisible(cartProductElement);
    }

    By downloadElement = By.xpath("//a[contains(text(),'Download Invoice')]");

    public void clickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() throws InterruptedException {
        click(downloadElement);
        Thread.sleep(3000);
        boolean check = false;
        check = check_file_exist("invoice.txt");
        checkBoolean(check);
    }

    By continueElement = By.xpath("//a[contains(text(),'Continue')]");

    public void clickContinueeeButton() {
        click(continueElement);
    }

}
