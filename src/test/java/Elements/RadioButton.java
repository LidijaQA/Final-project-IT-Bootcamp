package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static Utility.Constant.*;

public class RadioButton {

    public WebDriver driver;

    public RadioButton(WebDriver driver) {
        this.driver = driver;
    }

    public void goToRadioButtons() {
        driver.navigate().to(RADIO_URL);
    }

    public WebElement getSuccessText() {
        return driver.findElement(RADIO_TEXT_SUCCESS);
    }

    public WebElement getYes() {
        return driver.findElement(RADIO_YES);
    }

    public WebElement getImpressive() {
        return driver.findElement(RADIO_IMPRESSIVE);
    }

    public WebElement getNo() {
        return driver.findElement(RADIO_NO);
    }

    public void clickYes() {
        getYes().click();
    }

    public void clickImpressive() {
        getImpressive().click();
    }

}
