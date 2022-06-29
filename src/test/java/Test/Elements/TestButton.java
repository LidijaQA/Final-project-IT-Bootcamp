package Test.Elements;

import BasePage.Page;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utility.Constant.*;

public class TestButton extends Page {

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
    }

    @Test
    public void testButtons() {
        buttons.goToButtons();
        Assert.assertEquals(driver.getCurrentUrl(), BUTTONS_URL);
        buttons.clickDoubleclick();
        Assert.assertEquals(buttons.getDoubleClickMessage().getText(), BUTTONS_EXP_MSG_DBL);
        buttons.clickRightClick();
        Assert.assertEquals(buttons.getRightClickMessage().getText(), BUTTONS_EXP_MSG_R);
        buttons.clicklDynamic();
        Assert.assertEquals(buttons.getDynamicClickMessage().getText(), BUTTONS_EXP_MSG_DY);
    }
}
