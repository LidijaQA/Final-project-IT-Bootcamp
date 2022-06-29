package BookStoreApplication;

import org.openqa.selenium.*;

import static Utility.Constant.*;

public class LoginBookStore {

    public static WebDriver driver;

    public LoginBookStore(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLogin() {
        driver.navigate().to(LBS_URL);
    }

    public WebElement getName() {
        return driver.findElement(LBS_NAME);
    }

    public WebElement getPass() {
        return driver.findElement(LBS_PASS);
    }

    public WebElement getLoginButton() {
        return driver.findElement(LBS_LOGIN_BUTTON);
    }

    public WebElement getUserName() {
        return driver.findElement(LBS_USERNAME_VALUE);
    }

    public void login() {
        getName().sendKeys(LBS_USERNAME);
        getPass().sendKeys(LBS_PASSWORD);
        getLoginButton().click();
    }
}
