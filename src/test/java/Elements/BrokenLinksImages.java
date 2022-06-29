package Elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static Utility.Constant.*;

public class BrokenLinksImages {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public BrokenLinksImages(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public static void verifyLinks(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if (httpURLConnect.getResponseCode() >= 400) {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + "is a broken link");
            } else {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
            }
        } catch (Exception e) {
        }
    }

    public void goToBrokenLinks() {
        driver.navigate().to(BROKEN_URL);
    }

    public void checkLinksFetced() {
        List<WebElement> links = driver.findElements(TAG_NAME_LINKS);
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            verifyLinks(url);
        }
    }

    public void checkImagesFetched() {
        List<WebElement> images = driver.findElements(TAG_NAME_IMAGES);
        for (int i = 0; i < images.size(); i++) {
            WebElement image = images.get(i);
            String imageURL = image.getAttribute("src");
            System.out.println("URL of Image " + (i + 1) + " is: " + imageURL);
            verifyLinks(imageURL);
            try {
                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", image);
                if (imageDisplayed) {
                    System.out.println("DISPLAY - OK");
                } else {
                    System.out.println("DISPLAY - BROKEN");
                }
            } catch (Exception e) {
                System.out.println("Error Occured");
            }
        }
    }
}
