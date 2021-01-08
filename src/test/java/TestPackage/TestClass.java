package TestPackage;

import BasePackage.BaseTest;
import ConfigurationPackage.Configuration;
import PagePackage.Page;
import org.testng.annotations.Test;

public class TestClass extends BaseTest
{
Page page;

    @Test
    public void test1()
    {
        page = new Page(driver);
        page.enterSite();
    }

}
