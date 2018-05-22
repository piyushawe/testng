package testng;


import org.testng.annotations.Factory;

public class Factorytest {
    @Factory
    public Object[] fac()
    {

        Object [] ob=new Object[3];
        ob[0]=new app3();
        ob[1]=new app3();
        ob[2]=new app3();
       return ob;
    }
}
