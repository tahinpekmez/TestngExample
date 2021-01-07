package BasePackage;

import configurationPackage.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class BasePage {

    protected Configuration configuration;
    protected WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
        this.configuration = Configuration.getInstance();
    }

    public void clickElement(By by)
    {
        WebElement element = driver.findElement(by);
        element.click();
    }
}