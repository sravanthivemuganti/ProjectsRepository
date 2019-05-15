package com.jaxb.sample;

import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.apex.customer.service.bean.Customer;
import com.apex.customer.service.bean.CustomerList;

public class JaxBSample {
	public static void main(String[] args) throws JAXBException {
		Person person = new Person();
		person.setId(10);
		person.setName("Sravanthi");
		person.setAge(30);
		JAXBContext jaxbContext=JAXBContext.newInstance(Person.class);
		Marshaller marshaller=jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(person, System.out);
		
		System.out.println("-----------------");
		
		String message="<person>\r\n" + "<age>30</age>\r\n" +"<id>10</id>\r\n" +"<name>Sravanthi</name>\r\n" +"</person>";
		Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
		Object person2= unmarshaller.unmarshal(new StringReader(message));
		System.out.println(person2);
		
		
		System.out.println("---Write customer dtails into file");
		Customer customer = new Customer();
		customer.setId(1000);
		customer.setFirstname("vgs");
		customer.setLastname("vgs");
		customer.setStreet("fremont");
		customer.setCity("fremont");
		JAXBContext jaxbContext1=JAXBContext.newInstance(Customer.class);
		Marshaller marshaller1=jaxbContext1.createMarshaller();
		marshaller1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	
		File file = new File("C:\\Users\\vgsgo\\Desktop\\Selenium\\WebservicesFiles\\CustomerList.xml");
		marshaller1.marshal(customer, file);
		marshaller1.marshal(customer, System.out);
		
		System.out.println("----Read from Xml file to object-----");
		Unmarshaller unmarshaller1=jaxbContext1.createUnmarshaller();
		Customer customer2=(Customer) unmarshaller1.unmarshal(file);
		System.out.println(customer2);
		
	}
}
