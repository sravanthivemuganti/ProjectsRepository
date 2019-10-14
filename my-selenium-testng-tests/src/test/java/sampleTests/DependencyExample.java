package sampleTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

	@Test
	void startCar() {
		System.out.println("Car Started");
		Assert.fail();
	}
	@Test(dependsOnMethods= {"startCar"})	
	void driveCar() {
		System.out.println("Car Driving");
	}
	@Test(dependsOnMethods= {"driveCar"})	
	void stopCar() {
		System.out.println("Car Stopped");
	}
	@Test(dependsOnMethods= {"driveCar","stopCar"},alwaysRun=true)
	void parkCar() {
		System.out.println("Car Parked");
	}
}
