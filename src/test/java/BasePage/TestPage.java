package BasePage;

import org.testng.annotations.BeforeMethod;

public class TestPage extends Page {

    @BeforeMethod
    public void beforeMethod(){
        driver.manage().window().maximize();
    }















}
