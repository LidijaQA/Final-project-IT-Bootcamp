package BookStoreApplication;

import Elements.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static Utility.Constant.*;

public class BookStore {

    public static WebDriver driver;
    public WebDriverWait wdwait;

    public BookStore(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public void goToBookStore() {
        driver.navigate().to(BS_URL);
    }

    public WebElement getMainHeader() {
        return driver.findElement(BS_MAIN_HEADER);
    }

    public WebElement getBookTitle() {
        return driver.findElement(BS_TEXT);
    }

    public WebElement getGoToBookStoreButton() {
        return driver.findElement(BS_GO_TO_STORE);
    }

    public WebElement getAddToYourCollectionButton() {
        return driver.findElement(BS_ADD_TO_COLLECTION);
    }

    public void goToBookPage(String title) {
        String id = "see-book-" + title;
        driver.findElement(By.id(id)).click();
    }

    public void goToStoreFromBookPage() {
        Elements.ScrollTo(getGoToBookStoreButton());
        getGoToBookStoreButton().click();
    }

    public boolean AddToCollection(String title) {
        Profile.goToProfile();
        boolean bookAlreadyExists = Profile.checkIfBookExistInProfile(title);
        goToBookStore();
        goToBookPage(title);
        Elements.ScrollTo(getAddToYourCollectionButton());
        getAddToYourCollectionButton().click();
        wdwait.until(ExpectedConditions.alertIsPresent());
        return bookAlreadyExists;
    }

}
