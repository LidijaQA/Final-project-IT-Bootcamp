package Test.Elements;

import BasePage.Page;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utility.Constant.*;


public class TestElementsPage extends Page {

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
    }

    @Test
    public void clickOnMenuItem() {
        elements.goToElementsPage();
        String clickedMenuItemTitle = elements.clickMenuItemByIndex(EL_CLICK_INDEX);
        String newPageTitle = driver.findElement(EL_MAIN_HEADER).getText();
        Assert.assertEquals(clickedMenuItemTitle, newPageTitle);
    }

}
