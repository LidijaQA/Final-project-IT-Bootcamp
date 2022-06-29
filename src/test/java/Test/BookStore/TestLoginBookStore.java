package Test.BookStore;

import BasePage.Page;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utility.Constant.*;

public class TestLoginBookStore extends Page {

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() throws InterruptedException {
        loginBookStore.goToLogin();
        loginBookStore.login();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getCurrentUrl(), P_URL);
        Thread.sleep(5000);
        Assert.assertEquals(loginBookStore.getUserName().getText(), LBS_USERNAME);
    }
}
