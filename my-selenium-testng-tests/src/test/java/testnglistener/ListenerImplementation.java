package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener{
public void onStart(ITestContext arg) {
	System.out.println("Listener Started...");
}
public void onTestSuccess(ITestResult arg) {
	System.out.println("Success Started...");
}
}
