package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage extends BasePage {
    WebDriver driver;
    Actions actions;

    public CategoryPage() {
        driver = Driver.getDriver();
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    By categoryElement = By.className("left-sidebar");
    WebElement changeElement;

    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {
        changeElement = findElement(categoryElement);
        scrollToElement(changeElement);
        checkElementVisible(categoryElement);
    }

    By womanCategoryElement = By.xpath("//a[@href='#Women']");

    public void clickOnWomenCategory() {
        click(womanCategoryElement);
    }

    By dressCategoryElement = By.xpath("//a[@href='/category_products/1']");

    public void clickOnDressCategory() {
        click(dressCategoryElement);
    }


    By verifyWomenDressProductsElement = By.xpath("/html/body/section/div/div[2]/div[2]/div/h2");

    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENDRESSPRODUCTS(String text) {
        checkElementWithText(verifyWomenDressProductsElement, text);
    }

    By menMenuElement = By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div[1]/h4/a/span/i");
    By tshirtsSubElement = By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/ul/li[1]/a");

    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
        click(menMenuElement);
        click(tshirtsSubElement);
    }

    public void verifyThatUserIsNavigatedToThatCategoryPage() {
        checkUrl(driver.getCurrentUrl(), "https://automationexercise.com/category_products/3");
    }
}
