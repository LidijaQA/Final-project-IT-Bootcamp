package Test.Elements;

import BasePage.Page;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utility.Constant.DP_STD_COLOR;
import static Utility.Constant.DP_TEXT_DANGER;
import static org.testng.Assert.assertNotEquals;

public class TestDynamicProperties extends Page {

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();

    }

    @Test
    public void testDynamicProperties() throws InterruptedException {
        dynamicProperties.goToDynamicProperties();
        dynamicProperties.clickVisibleAfter();
        dynamicProperties.clickEnableAfter();
        dynamicProperties.assertColorChange();
        assertNotEquals(DP_TEXT_DANGER, DP_STD_COLOR);
    }
}
