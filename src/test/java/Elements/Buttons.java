package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static Utility.Constant.*;

public class Buttons {

    public WebDriver driver;

    public Actions actions;

    public Buttons(WebDriver driver, Actions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void goToButtons() {
        driver.navigate().to(BUTTONS_URL);
    }

    public WebElement getDoubleClickBtn() {
        return driver.findElement(BUTTONS_DBL_CLICK);
    }

    public WebElement getRightClickBtn() {
        return driver.findElement(BUTTONS_R_CLICK);
    }

    public WebElement getDoubleClickMessage() {
        return driver.findElement(BUTTONS_DBL_MSG);
    }

    public WebElement getRightClickMessage() {
        return driver.findElement(BUTTONS_R_MSG);
    }

    public WebElement getDynamicClickMessage() {
        return driver.findElement(BUTTONS_DY_MSG);
    }

    public List<WebElement> getButtons() {
        return driver.findElements(BUTTONS_DY_CLICK);
    }

    public void clickDoubleclick() {
        actions.doubleClick(getDoubleClickBtn()).build().perform();
    }

    public void clickRightClick() {
        actions.contextClick(getRightClickBtn()).build().perform();
    }

    public void clicklDynamic() {
        for (WebElement button : getButtons()) {
            if (button.getText().equals(BUTTONS_DY_TEXT)) {
                button.click();
                break;
            }
        }

    }
}
