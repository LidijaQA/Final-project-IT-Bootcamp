package Elements;

import Utility.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Links {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public Links(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public Links(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLinks() {
        driver.navigate().to(Constant.LINKS_URL);
    }

    public WebElement getLinkResponse() {
        return driver.findElement(Constant.LINKS_LINK_RESPONSE);
    }

    public WebElement getCreated() {
        return driver.findElement(Constant.LINKS_CREATED);
    }

    public WebElement getNoContent() {
        return driver.findElement(Constant.LINKS_NO_CONTENT);
    }

    public WebElement getMoved() {
        return driver.findElement(Constant.LINKS_MOVED);
    }

    public WebElement getBadRequest() {
        return driver.findElement(Constant.LINKS_BAD_REQUEST);
    }

    public WebElement getUnauthorized() {
        return driver.findElement(Constant.LINKS_UNAUTHORIZED);
    }

    public WebElement getForbidden() {
        return driver.findElement(Constant.LINKS_FORBIDDEN);
    }

    public WebElement getNotFound() {
        return driver.findElement(Constant.LINKS_NOT_FOUND);
    }

    public void homeLink() {
        driver.findElement(Constant.LINKS_HOME).click();
    }

    public void dynamicLink(String partialText) {
        driver.findElement(By.partialLinkText(partialText)).click();
    }

    public void clickLink(WebElement link) {
        link.click();
    }
}
