package BasePackage;

import ConfigurationPackage.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest
{
    protected Configuration configuration = Configuration.getInstance();
    protected WebDriver driver;

    @BeforeTest
    @Parameters({ "browser" })
    public void Setup(String browser)
    {
        if (browser.contains("Chrome"))
        {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            driver = new ChromeDriver(chromeOptions);
        }

        if (browser.contains("Firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.navigate().to(configuration.getSiteURL());
    }

    @AfterTest()
    public void afterTest() throws IOException
    {
        driver.quit();
    }
}
