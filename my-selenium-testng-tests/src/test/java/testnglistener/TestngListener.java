package testnglistener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglistener.ListenerImplementation.class)
public class TestngListener {
	@Test
	public void testngListnerMethod() {
		System.out.println("Testng Listener Class");
	}
}
