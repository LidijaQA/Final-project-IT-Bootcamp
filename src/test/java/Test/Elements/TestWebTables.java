package Test.Elements;

import BasePage.Page;
import Utility.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static Utility.Constant.*;

public class TestWebTables extends Page {

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
    }

    @Test
    public void testWebTables() {
        webTables.goToWebTables();
        webTables.addNewElement(WT_NEW_RECORD);
        checkForNewDataInTable(WT_NEW_RECORD);
        String deletedId = webTables.deleteRecord(WT_DELETE_RECORD_INDEX);
        Assert.assertTrue(driver.findElements(By.id(deletedId)).size() < 1);
        webTables.editRecord(WT_EDIT_RECORD_INDEX, WT_NEW_RECORD_2);
        checkForNewDataInTable(WT_NEW_RECORD_2);
        List<String> cellTexts = webTables.search(Constant.WT_NEW_RECORD_2.get(0));
        Assert.assertTrue(cellTexts.contains(Constant.WT_NEW_RECORD_2.get(0)));
        int numOfRows = webTables.pageSize(WT_SET_NUM_OF_ROWS);
        Assert.assertEquals(numOfRows, webTables.getNumOfRows().size());

    }

    public void checkForNewDataInTable(List<String> newRecord) {
        List<String> cellTexts = new ArrayList<>();
        for (WebElement cell : webTables.getTableCells()) {
            cellTexts.add(cell.getText());
        }
        for (String record : newRecord) {
            Assert.assertTrue(cellTexts.contains(record));
        }
    }
}
