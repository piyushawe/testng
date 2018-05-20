package testng;

import com.sun.media.sound.AiffFileReader;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Timestamp;

public class app2 {
    @BeforeClass(enabled = false)
    public void bef()
    {
        System.out.println("This is beforeclass testing");
    }
    @BeforeMethod()
    public void beffy()
    {
        System.out.println("beffy");
    }
    @Test(dataProvider = "dat",dataProviderClass = app3.class)
    public void test1(String use,String pas)
    {
        System.out.println(use);
        System.out.println(pas);
    }
    @Test(expectedExceptions = {NullPointerException.class,ArithmeticException.class})
    public void test2()
    {
        int i=1/0;
        System.out.println("test2");
    }
//    @Test(enabled = false)
//    public void test5()
//    {
//        System.out.println("test5");
//    }
//    @Test(description = "This is description")
//    public void test6()
//    {
//        System.out.println("test6");
//    }
}
