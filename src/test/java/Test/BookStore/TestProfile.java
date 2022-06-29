package Test.BookStore;

import BasePage.Page;
import Utility.Constant;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static Utility.Constant.*;

public class TestProfile extends Page {

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
    }

    @Test
    public void testProfile() throws InterruptedException {
        loginBookStore.goToLogin();
        Assert.assertEquals(driver.getCurrentUrl(), LBS_URL);
        loginBookStore.login();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), P_URL);
        profile.logout();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), LBS_URL);
        loginBookStore.login();
        Thread.sleep(2000);
        profile.goToBookStore();
        Thread.sleep(2000);
        profile.goToBookPage(P_BOOK_TITLE_GIT);
        Thread.sleep(2000);
        Assert.assertEquals(P_BOOK_TITLE_GIT, profile.getBookTitle().getText());
        boolean bookAlreadyExists = bookStore.AddToCollection(P_BOOK_TITLE_GIT);
        if (bookAlreadyExists) {
            Assert.assertEquals(driver.switchTo().alert().getText(), BS_ALERT);
        } else {
            Assert.assertEquals(driver.switchTo().alert().getText(), BS_ADDED);
        }
        driver.switchTo().alert().accept();
        profile.goToProfile();
        List<String> cellTexts = profile.search(webTables, P_BOOK_TITLE_GIT);
        Assert.assertTrue(cellTexts.contains(P_BOOK_TITLE_GIT));
        profile.deleteBookByIndex(P_DELETE_INDEX);
        Assert.assertEquals(driver.switchTo().alert().getText(), P_BOOK_DELETED);
        driver.switchTo().alert().accept();
        profile.goToBookStore();
        Thread.sleep(2000);
        profile.goToBookPage(P_BOOK_TITLE_GIT);
        Thread.sleep(2000);
        Assert.assertEquals(P_BOOK_TITLE_GIT, profile.getBookTitle().getText());
        boolean bookAlreadyExists2 = bookStore.AddToCollection(P_BOOK_TITLE_GIT);
        if (bookAlreadyExists2) {
            Assert.assertEquals(driver.switchTo().alert().getText(), BS_ALERT);
        } else {
            Assert.assertEquals(driver.switchTo().alert().getText(), BS_ADDED);
        }
        driver.switchTo().alert().accept();
        profile.goToProfile();
        profile.deleteAllBooks();
        Assert.assertEquals(driver.switchTo().alert().getText(), P_ALL_BOOKS_DELETED);
        driver.switchTo().alert().accept();
        profile.deleteAccount();
        Assert.assertEquals(driver.switchTo().alert().getText(), P_USER_DELETED);
        driver.switchTo().alert().accept();
    }
}
