
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;



public class Test  {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://demoqa.com/buttons";

        WebDriverManager wdm = new ChromeDriverManager();
        wdm.setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.navigate().to(url);
        Actions actions = new Actions(driver);
        WebElement dynClick= driver.findElement(By.partialLinkText("Click Me"));
        actions.click(dynClick).build().perform();

    }

}
