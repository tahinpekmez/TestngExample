package TestPackage;

import BasePackage.BaseTest;
import PagePackage.Page;
import org.testng.annotations.Test;

public class TestClass extends BaseTest
{


    @Test
    public void test1()
    {
        new Page(driver).enterSite();
        //page = new Page(driver);
        //page.enterSite();
    }

}
