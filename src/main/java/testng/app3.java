package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class app3 extends App {
    @DataProvider//If no name attribute is used then name of data provider will be the name of method i.e
    // "dat" in our case
    public Object[][] dat()
    {
        Object[][] data=new Object[2][2];
        data[0][0]="hello";
        data[0][1]="ola";

        data[1][0]="hello1";
        data[1][1]="ola1";
        return data;

    }
    @Test()
    public void test3()
    {
        System.out.println("Test3");
        //System.out.println(pas);
    }
    @Test
    public void test4()
    {
        System.out.println("test4");
    }
}
