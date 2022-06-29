package Elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static Utility.Constant.*;

public class Elements {

    public static WebDriver driver;
    public static WebDriverWait wdwait;

    public Elements(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public static void ScrollTo(WebElement some) {
        JavascriptExecutor js;
        js = (JavascriptExecutor) driver;
        String yCoord = String.valueOf(some.getLocation().y - 300);
        js.executeScript("window.scrollTo(0, " + yCoord + ");");
    }

    public static List<WebElement> getMenuItems() {
        wdwait.until(ExpectedConditions.presenceOfElementLocated(EL_LIST));
        return driver.findElement(EL_LIST).findElements(EL_BUTTONS);
    }

    public void goToElementsPage() {
        driver.navigate().to(EL_URL);
    }

    public String clickMenuItemByIndex(int item) {
        WebElement menuItem = getMenuItems().get(item);
        ScrollTo(menuItem);
        menuItem.click();
        return menuItem.getText();
    }
}

