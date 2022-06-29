package BasePage;

import BookStoreApplication.BookStore;
import BookStoreApplication.Profile;
import Elements.Elements;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Elements.TextBox;
import Elements.RadioButton;
import Elements.CheckBox;
import Elements.DynamicProperties;
import Elements.WebTables;
import Elements.Buttons;
import Elements.UploadDownload;
import Elements.Links;
import Elements.BrokenLinksImages;
import Forms.PracticeForm;
import BookStoreApplication.LoginBookStore;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;

public class Page {


    public WebDriverManager wmd;
    public WebDriver driver;
    public WebDriverWait wdwait;
    public Actions actions;
    public Elements elements;
    public TextBox textBox;
    public RadioButton radioButton;
    public CheckBox checkBox;
    public WebTables webTables;
    public Buttons buttons;
    public PracticeForm practiceform;
    public UploadDownload uploadDownload;
    public DynamicProperties dynamicProperties;

    public Links links;
    public LoginBookStore loginBookStore;
    public BookStore bookStore;

    public Profile profile;

    public BrokenLinksImages brokenLinks;


    @BeforeClass
    public void beforeClass() {
        wmd = new ChromeDriverManager();
        wmd.setup();
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("src/main/resources/addblockplus.crx"));
        driver = new ChromeDriver(options);
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        wdwait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.close();
        driver.switchTo().window(tabs.get(0));
        actions = new Actions(driver);
        elements = new Elements(driver, wdwait);
        textBox = new TextBox(driver);
        radioButton = new RadioButton(driver);
        checkBox = new CheckBox(driver);
        dynamicProperties = new DynamicProperties(driver, wdwait);
        webTables = new WebTables(driver, wdwait);
        buttons = new Buttons(driver, (Actions) actions);
        practiceform = new PracticeForm(driver, wdwait);
        loginBookStore = new LoginBookStore(driver);
        bookStore = new BookStore(driver, wdwait);
        profile = new Profile(driver);
        uploadDownload = new UploadDownload(driver);
        links = new Links(driver, wdwait);
        brokenLinks = new BrokenLinksImages(driver, wdwait);
    }

    @AfterClass
    public void afterClass() {
        profile = null;
        bookStore = null;
        loginBookStore = null;
        practiceform = null;
        links = null;
        uploadDownload = null;
        buttons = null;
        webTables = null;
        dynamicProperties = null;
        checkBox = null;
        radioButton = null;
        textBox = null;
        elements = null;
        wdwait = null;
        driver.quit();
        driver = null;
        wmd = null;
    }
}
