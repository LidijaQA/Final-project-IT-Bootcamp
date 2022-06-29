package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utility.Constant.*;

public class TextBox {

    public WebDriver driver;

    public TextBox(WebDriver driver) {
        this.driver = driver;
    }

    public void goToTextBox() {
        driver.navigate().to(TB_URL);
    }

    public WebElement getOutput() {
        return driver.findElement(TB_OUTPUT);
    }

    public WebElement inputFullname() {
        return driver.findElement(TB_NAME_INPUT);
    }

    public WebElement inputEmail() {
        return driver.findElement(TB_EMAIL_INPUT);
    }

    public WebElement inputCurrAddress() {
        return driver.findElement(TB_CURR_ADDRESS_INPUT);
    }

    public WebElement inputPermAddress() {
        return driver.findElement(TB_PERMA_ADDRESS_INPUT);
    }

    public WebElement getSubmit() {
        return driver.findElement(TB_SUBMIT);
    }

    public WebElement getNameOutput() {
        return driver.findElement(TB_OUTPUT_NAME);
    }

    public WebElement getEmailOutput() {
        return driver.findElement(TB_OUTPUT_EMAIL);
    }

    public WebElement getCurrentAddressOutput() {
        return driver.findElement(TB_OUTPUT_CURR_ADDRESS);
    }

    public WebElement getPermanentAddressOutput() {
        return driver.findElement(TB_OUTPUT_PERMA_ADDRESS);
    }

    public void populateTextBoxesAndSubmit(String username, String email, String curAddress, String permAddres) {
        inputFullname().sendKeys(username);
        inputEmail().sendKeys(email);
        inputCurrAddress().sendKeys(curAddress);
        inputPermAddress().sendKeys(permAddres);
        Elements.ScrollTo(getSubmit());
        getSubmit().click();
    }
}
