package PagePackage;

import BasePackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page extends BasePage
{
    private static final By BLOG_BUTTON = By.xpath("//a[@href='/blog']");
    private static final By TEST_YAYINLARI_BUTTON = By.xpath("//a[@href='/test-yayinlari']");

public Page (WebDriver driver)

    {
        super(driver);
    }


    public Page ClickBlogButton()
    {
        clickElement(BLOG_BUTTON);
        return this;
    }

    public Page ClickTestYayinButton()
    {
        clickElement(TEST_YAYINLARI_BUTTON);
        return this;
    }

    public void getSiteUrl()
    {
        System.out.println(configuration.getSiteURL());
    }
}