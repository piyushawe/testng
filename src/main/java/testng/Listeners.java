package testng;

import org.testng.TestListenerAdapter;
import org.testng.ITestResult;
public class Listeners extends TestListenerAdapter {
    public void onTestStart(ITestResult r)
    {
        System.out.println("Start");
    }

    public void onTestSuccess(ITestResult r)
    {
        System.out.println("Success");
    }
    public void onTestFailure(ITestResult r)
    {
        System.out.println("Failure");
    }
    public void onTestSkipped(ITestResult r)
    {
        System.out.println("Skipped");
    }
}
