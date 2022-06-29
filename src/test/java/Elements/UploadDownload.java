package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.File;

import static Utility.Constant.*;

public class UploadDownload {

    public WebDriver driver;

    public UploadDownload(WebDriver driver) {
        this.driver = driver;
    }

    public void goToUploadDownload() {
        driver.navigate().to(UD_URL);
    }

    public WebElement getDownloadButton() {
        return driver.findElement(UD_DOWNLOAD_BUTTON);
    }

    public WebElement getUploadFile() {
        return driver.findElement(UD_UPLOAD_FILE);
    }

    public WebElement getFakePath() {
        return driver.findElement(UD_FAKE_PATH);
    }

    public void download() {
        getDownloadButton().click();
    }

    public void upload(String filename) {
        String path = new File(filename).getAbsolutePath();
        getUploadFile().sendKeys(path);
    }
}
