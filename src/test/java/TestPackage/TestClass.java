package TestPackage;

import PagePackage.Page;
import BasePackage.BaseTest;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {

    @Test
    public void test3()
    {
        new Page(driver).getSiteUrl();
    }





}

