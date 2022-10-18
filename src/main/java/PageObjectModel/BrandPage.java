package PageObjectModel;

import Utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BrandPage extends BasePage {
    WebDriver driver;
    Actions actions;


    public BrandPage() {
        driver = Driver.getDriver();
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    WebElement changeElement;
    By brandElement = By.className("brands_products");

    public void verifyThatBrandsAreVisibleOnLeftSideBar() {
        changeElement = findElement(brandElement);
        scrollToElement(changeElement);
        checkElementVisible(brandElement);
    }

    By poloElement = By.xpath("//a[@href='/brand_products/Polo']");

    public void clickOnAnyBrandName() {
        click(poloElement);
    }

    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        checkUrl(driver.getCurrentUrl(), "https://automationexercise.com/brand_products/Polo");
    }

    By madameElement = By.xpath("//a[@href='/brand_products/Madame']");

    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        changeElement = findElement(madameElement);
        scrollToElement(changeElement);
        click(madameElement);
    }

    By brandProductList = By.className("features_items");

    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        checkElementVisible(brandProductList);
    }
}
