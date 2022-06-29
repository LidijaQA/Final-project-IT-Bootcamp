package Test.Elements;

import BasePage.Page;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utility.Constant.*;

public class TestRadioButton extends Page {

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
    }

    @Test
    public void testRadioButton() {
        radioButton.goToRadioButtons();
        Assert.assertEquals(driver.getCurrentUrl(), RADIO_URL);
        radioButton.clickYes();
        Assert.assertEquals(radioButton.getSuccessText().getText(), RADIO_BUTTON_YES);
        radioButton.clickImpressive();
        Assert.assertEquals(radioButton.getSuccessText().getText(), RADIO_BUTTON_IMPRESSIVE);
        Assert.assertFalse(radioButton.getNo().isEnabled());
    }
}
