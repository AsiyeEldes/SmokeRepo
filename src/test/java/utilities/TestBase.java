package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    protected WebDriver driver;
    protected Actions actions;//Make sure to create this in the class level
    @BeforeMethod(alwaysRun = true)
    public void setUp(){
     //   WebDriverManager.chromedriver().setup();
       // System.setProperty("webdiver.chrome.driver", "C:\\Users\\user\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }
}
