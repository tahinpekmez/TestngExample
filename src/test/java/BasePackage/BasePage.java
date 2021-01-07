package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebElement clickElement(By by)
    {
        WebElement element = driver.findElement(by);
        element.click();
        return element;

    }
}