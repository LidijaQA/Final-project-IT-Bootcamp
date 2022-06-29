package Test.Elements;

import BasePage.Page;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static Utility.Constant.*;

public class TestCheckBox extends Page {

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
    }

    @Test
    public void testCheckBox() {
        checkBox.goToCheckBox();
        expandLists();
        collapseLists();
        checkBox.expandALLButton();
        Assert.assertEquals(checkBox.getParentLis().size(), checkBox.getParentLiExpanded().size());
        checkBox.collapseAllButton();
        Assert.assertEquals(checkBox.getParentLis().size(), 1);
        List<String> allCheckedTitlesUnderIndex = checkBox.checkBoxCheck(CB_CHECK_INDEX);
        List<String> allSuccessTextItems = checkBox.getSuccessText();
        Assert.assertEquals(allCheckedTitlesUnderIndex, allSuccessTextItems);
    }

    public void expandLists() {
        for (int i = 0; i < checkBox.getParentLiNotExpanded().size(); i++) {
            WebElement li = checkBox.getParentLiNotExpanded().get(i);
            li.findElement(CB_COLLAPSE_BTN).click();
            Assert.assertTrue(li.findElements(CB_OL).size() != 0);
            expandLists();
        }
    }

    public void collapseLists() {
        WebElement li = checkBox.getParentLiExpanded().get(0);
        li.findElement(CB_COLLAPSE_BTN).click();
        Assert.assertEquals(li.findElements(CB_OL).size(), 0);
    }
}
