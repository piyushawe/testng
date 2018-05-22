package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
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
    @Test(groups = {"test"},dependsOnMethods = "test4")
        public void test3()
    {
        System.out.println("Test3");
        //System.out.println(pas);
    }
    @Parameters({"testing"})// it takes parameter from Testng.xml defined under parameter tag
    @Test(groups = "hello" )
    public void test4(@Optional("rama") String name)//this parameter value will be the value mentioned in the xml file but
    // user do not define any parameter for it then default value will be @ Optional
    {
        System.out.println(1/0);
    }

    @Test(parameters = "pass" , groups = "hello")
    public void test5(int pass)
    {
        System.out.println(pass);
    }
}
