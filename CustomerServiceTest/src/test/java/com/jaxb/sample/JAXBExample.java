package com.jaxb.sample;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.apex.customer.service.bean.Customer;

public class JAXBExample {
	public static void main(String[] args) {

	 try {

		File file = new File("C:\\Users\\vgsgo\\Desktop\\Selenium\\WebservicesFiles\\CustomerList.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Object customer = jaxbUnmarshaller.unmarshal(file);
		System.out.println(customer);
		

	  } catch (JAXBException e) {
		e.printStackTrace();
	  }

	}
}

