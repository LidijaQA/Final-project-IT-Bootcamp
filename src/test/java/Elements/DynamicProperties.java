package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utility.Constant.*;

public class DynamicProperties {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public DynamicProperties(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public void goToDynamicProperties() {
        driver.navigate().to(DP_URL);
    }

    public WebElement getVisibleAfter() {
        return driver.findElement(DP_VISIBLE_AFTER);
    }

    public WebElement getEnableAfter() {
        return driver.findElement(DP_ENABLE_AFTER);
    }

    public WebElement getColorChange() {
        return driver.findElement(DP_COLOR_CHANGE);
    }

    public WebElement getTextDanger() {
        return driver.findElement(DP_TEXT_DANGER);
    }

    public void clickVisibleAfter() {
        wdwait.until(ExpectedConditions.presenceOfElementLocated(DP_VISIBLE_AFTER));
        getVisibleAfter().click();
    }

    public void clickEnableAfter() {
        wdwait.until(ExpectedConditions.elementToBeClickable(DP_ENABLE_AFTER));
        getEnableAfter().click();
    }

    public void assertColorChange() {
        wdwait.until(ExpectedConditions.visibilityOf(getTextDanger()));
    }
}
