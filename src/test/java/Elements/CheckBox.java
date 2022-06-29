package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static Utility.Constant.*;

public class CheckBox {

    public WebDriver driver;

    public CheckBox(WebDriver driver) {
        this.driver = driver;
    }

    public void goToCheckBox() {
        driver.navigate().to(CB_URL);
    }

    public List<WebElement> getParentLis() {
        return driver.findElements(CB_PARENT_LIS);
    }

    public List<WebElement> getParentLiNotExpanded() {
        return driver.findElements(CB_PARENT_LIS_NOT_EXPANDED);
    }

    public List<WebElement> getParentLiExpanded() {
        return driver.findElements(CB_PARENT_LIS_EXPANDED);
    }

    public WebElement getExpandALlButton() {
        return driver.findElement(CB_EXPANDED_ALL_BUTTON);
    }

    public WebElement getCollapseAllButton() {
        return driver.findElement(CB_COLLAPSE_ALL_BUTTON);
    }

    public List<WebElement> getCheckBoxText() {
        return driver.findElements(CB_CHECK_BOX_TEXT);
    }

    public void expandALLButton() {
        getExpandALlButton().click();
    }

    public void collapseAllButton() {
        getCollapseAllButton().click();
    }

    public List<String> checkBoxCheck(int index) {
        ArrayList<String> elementTitleList = new ArrayList<String>();
        expandALLButton();
        getParentLiExpanded().get(index).findElement(CB_LABEL).click();
        List<WebElement> allCheckedElements = getCheckBoxText();
        for (WebElement el : allCheckedElements) {
            elementTitleList.add(el.getText().toLowerCase());
        }

        return elementTitleList;
    }

    public List<String> getSuccessText() {
        ArrayList<String> successTextList = new ArrayList<String>();
        List<WebElement> allSuccessText = driver.findElements(CB_TEXT_SUCCESS);
        for (WebElement text : allSuccessText) {
            successTextList.add(text.getText());
        }
        return successTextList;
    }

}
