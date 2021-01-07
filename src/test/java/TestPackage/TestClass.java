package TestPackage;

import PagePackage.Page;
import BasePackage.BaseTest;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {


    @Test
    public void test1()
    {
        new Page(driver).ClickBlogButton();
    }

    @Test
    public void test2()
    {
        new Page(driver).ClickTestYayinButton();
    }
}

