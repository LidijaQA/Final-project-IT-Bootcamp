package Test.BookStore;

import BasePage.Page;
import BookStoreApplication.LoginBookStore;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utility.Constant.*;

public class TestBookStore extends Page {

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
    }

    @Test
    public void testBookstore() throws InterruptedException {

        loginBookStore.goToLogin();
        Assert.assertEquals(driver.getCurrentUrl(), LBS_URL);
        loginBookStore.login();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), P_URL);
        bookStore.goToBookStore();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), BS_URL);
        bookStore.goToBookPage(P_BOOK_TITLE_GIT);
        Assert.assertEquals(P_BOOK_TITLE_GIT, bookStore.getBookTitle().getText());
        bookStore.goToStoreFromBookPage();
        Assert.assertEquals(driver.getCurrentUrl(), BS_URL);
        boolean bookAlreadyExists = bookStore.AddToCollection(P_BOOK_TITLE_GIT);
        if (bookAlreadyExists) {
            Assert.assertEquals(driver.switchTo().alert().getText(), BS_ALERT);
        } else {
            Assert.assertEquals(driver.switchTo().alert().getText(), BS_ADDED);
        }
        driver.switchTo().alert().accept();
    }
}
