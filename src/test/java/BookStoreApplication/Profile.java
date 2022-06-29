package BookStoreApplication;

import Elements.Elements;
import Elements.WebTables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Utility.Constant.*;

public class Profile {

    private static WebDriver driver;

    public Profile(WebDriver driver) {
        this.driver = driver;
    }

    public static void goToProfile() {
        driver.navigate().to(P_URL);
    }

    public static boolean checkIfBookExistInProfile(String title) {
        String id = "see-book-" + title;
        return driver.findElements(By.id(id)).size() > 0;
    }

    public WebElement getMainHeader() {
        return driver.findElement(P_MAIN_HEADER);
    }

    public WebElement getGoToStoreButton() {
        return driver.findElement(P_GO_TO_STORE);
    }

    public WebElement getDeleteAccountButton() {
        return driver.findElement(P_DELETE_ACCOUNT_BUTTON);
    }

    public WebElement getDeleteAllBooksButton() {
        return driver.findElement(P_DELETE_ALL_BOOKS_BUTTON);
    }

    public WebElement getModalOkButton() {
        return driver.findElement(P_MODAL_OK_BUTTON);
    }

    public List<WebElement> getTableRows() {
        return driver.findElements(P_TABLE_ROWS);
    }

    public WebElement getBookTitle() {
        return driver.findElement(P_BOOK_TITLE_BY);
    }

    public void logout() {
        driver.findElement(P_LOGOUT).click();
    }

    public void goToBookStore() {
        Elements.ScrollTo(getGoToStoreButton());
        getGoToStoreButton().click();
    }

    public void deleteAccount() throws InterruptedException {
        Elements.ScrollTo(getDeleteAccountButton());
        getDeleteAccountButton().click();
        getModalOkButton().click();
        Thread.sleep(3000);
    }

    public void deleteAllBooks() throws InterruptedException {
        Elements.ScrollTo(getDeleteAllBooksButton());
        getDeleteAllBooksButton().click();
        getModalOkButton().click();
        Thread.sleep(3000);
    }

    public void deleteBookByIndex(int i) throws InterruptedException {
        getTableRows().get(i + 1).findElement(P_DELETE_BOOK_BUTTON).click();
        getModalOkButton().click();
        Thread.sleep(3000);
    }

    public List<String> search(WebTables webTables, String text) {
        return webTables.search(text);
    }

    public void goToBookPage(String title) {
        String id = "see-book-" + title;
        driver.findElement(By.id(id)).click();
    }
}
