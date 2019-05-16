package org.apex.util;

public class JobApplicationTest {

	public static void main(String[] args) {
		JobApplication jobApplication1 = new JobApplication();
		jobApplication1.setFirstName("Ram");
		jobApplication1.setYear(-2000);
		jobApplication1.display();
		JobApplication.greeting(jobApplication1.getFirstName());
		jobApplication1.greetingNS();
		//		JobApplication.companyName = "abc";
		//		System.out.println(jobApplication1);
		System.out.println(JobApplication.companyName);
		JobApplication jobApplication2 = new JobApplication("Ravana", 1990);
		jobApplication2.display();
		JobApplication.greeting(jobApplication2.getFirstName());
		jobApplication2.greetingNS();
		System.out.println(JobApplication.companyName);
	}

}
