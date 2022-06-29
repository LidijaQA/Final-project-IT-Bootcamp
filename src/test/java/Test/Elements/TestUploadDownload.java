package Test.Elements;

import BasePage.Page;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

import static Utility.Constant.*;

public class TestUploadDownload extends Page {

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
    }

    @Test
    public void testUploadDownload() {
        uploadDownload.goToUploadDownload();
        uploadDownload.download();
        String userHomeDir = System.getProperty("user.home");
        Assert.assertTrue(new File(userHomeDir + UD_DOWNLOAD_PATH).isFile());
        uploadDownload.upload(UD_FILENAME);
        Assert.assertTrue(uploadDownload.getFakePath().getText().contains(UD_FILENAME));
    }
}
