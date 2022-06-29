package Test.Elements;

import BasePage.Page;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBrokenLinksImages extends Page {

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
    }

    @Test
    public void testBrokenLinks() {
        brokenLinks.goToBrokenLinks();
        brokenLinks.checkLinksFetced();
    }

    @Test
    public void testBrokenImages() {
        brokenLinks.goToBrokenLinks();
        brokenLinks.checkImagesFetched();
    }

}
