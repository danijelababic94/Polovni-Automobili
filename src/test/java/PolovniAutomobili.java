import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PolovniAutomobili {
    WebDriver driver;
    @BeforeMethod
    public  void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test(description = "Search Automobile")
    @Description  ("Searches an automobile by brand and model")
    @Severity(SeverityLevel.CRITICAL)
    @Epic("")
    @Feature("")
    @Story("")

    public void searchAutomobile (){
        driver.get("https://www.polovniautomobili.com/");



    }
}
