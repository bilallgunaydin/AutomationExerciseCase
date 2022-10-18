package PageObjectModel;

import Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage {
    WebDriver driver;
    WebDriverWait wait;
    Faker faker = new Faker();
    Actions actions;
    Dimension newDimension = new Dimension(800, 600);

    public HomePage() {
        driver = Driver.getDriver();
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    By footerElement = By.id("footer");
    WebElement changeElement;

    public void scrollDownToFooter() {
        changeElement = findElement(footerElement);
        scrollToElement(changeElement);
    }

    By subscriptionElement = By.xpath("//h2[contains(text(),'Subscription')]");

    public void verifyTextSUBSCRIPTION(String text) {
        checkElementWithText(subscriptionElement, text);
    }

    By susbscribeEmail = By.id("susbscribe_email");
    By subscribeButton = By.id("subscribe");

    public void enterEmailAddressInInputAndClickArrowButton() {
        sendKey(susbscribeEmail, faker.internet().emailAddress());
        click(subscribeButton);
    }

    By successElement = By.xpath("//div[contains(text(),'You have been successfully subscribed!')]");

    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisiblee(String message) {
        checkElementWithText(successElement, message);
    }

    By cartElement = By.partialLinkText("Cart");

    public void clickCartButton() {
        changeElement = findElement(cartElement);
        scrollToElement(changeElement);
        click(cartElement);
    }

    By scrollUpElement = By.id("scrollUp");

    //rect
    public void clickOnArrowAtBottomRightSideToMoveUpward() throws InterruptedException {
        driver.manage().window().setSize(newDimension);
        changeElement = findElement(scrollUpElement);
        actions.moveToElement(changeElement).build().perform();
        click(scrollUpElement);
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    By textElement = By.cssSelector("#slider-carousel > div > div");
    By homeElement = By.xpath("//i[@class='fa fa-home']");


    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen(String message) throws InterruptedException {
        changeElement = findElement(homeElement);
        scrollToElement(changeElement);
        checkElementWithText(textElement, message);
    }

    public void scrollUpPageToTop() {
        driver.manage().window().setSize(newDimension);
        changeElement = findElement(scrollUpElement);
        actions.moveToElement(changeElement).build().perform();
        driver.manage().window().maximize();
        scrollToUp();
    }
}
