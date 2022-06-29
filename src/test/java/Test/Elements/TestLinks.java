package Test.Elements;

import BasePage.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

import Utility.Constant;

public class TestLinks extends Page {

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
    }

    @Test
    public void testNewTabLinks() {
        links.goToLinks();

        links.dynamicLink(Constant.LINKS_PARTIAL_TEXT);
        goToNewHomeTab();
        links.homeLink();
        goToNewHomeTab();
    }

    @Test
    public void testAllAPILinks() throws InterruptedException {
        links.goToLinks();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        clickLink(links.getCreated());
        clickLink(links.getNoContent());
        clickLink(links.getMoved());
        clickLink(links.getBadRequest());
        clickLink(links.getUnauthorized());
        clickLink(links.getForbidden());
        clickLink(links.getNotFound());
    }

    public void clickLink(WebElement linkElement) throws InterruptedException {
        wdwait.until(ExpectedConditions.elementToBeClickable(linkElement));
        links.clickLink(linkElement);
        Thread.sleep(2000);
        Assert.assertTrue(links.getLinkResponse().getText().contains(linkElement.getText()));
    }

    private void goToNewHomeTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Constant.URL, driver.getCurrentUrl());
        driver.switchTo().window(tabs.get(0));
    }
}
