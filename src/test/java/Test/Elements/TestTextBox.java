package Test.Elements;

import BasePage.Page;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utility.Constant.*;

public class TestTextBox extends Page {

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();

    }

    @Test
    public void testTextBox() {
        textBox.goToTextBox();
        textBox.populateTextBoxesAndSubmit(TB_USERNAME, TB_EMAIL, TB_CURR_ADDRESS, TB_PERMA_ADDRESS);
        Assert.assertTrue(textBox.getNameOutput().getText().contains(TB_USERNAME));
        Assert.assertTrue(textBox.getEmailOutput().getText().contains(TB_EMAIL));
        Assert.assertTrue(textBox.getCurrentAddressOutput().getText().contains(TB_CURR_ADDRESS));
        Assert.assertTrue(textBox.getPermanentAddressOutput().getText().contains(TB_PERMA_ADDRESS));
    }
}
