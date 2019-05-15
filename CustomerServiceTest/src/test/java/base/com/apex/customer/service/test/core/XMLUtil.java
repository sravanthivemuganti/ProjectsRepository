package base.com.apex.customer.service.test.core;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.apex.customer.service.bean.Customer;
import com.apex.customer.service.bean.CustomerList;

public class XMLUtil {
	public static Customer getobjectFromXML(String xmlMessage) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Customer customer = (Customer) unmarshaller.unmarshal(new StringReader(xmlMessage));
		return customer;
	}

	public static Customer getobjectFromXML_File(String xmlMessage) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Customer customer = (Customer) unmarshaller.unmarshal(new StringReader(xmlMessage));
		return customer;
	}

	public static CustomerList getobjectFromXML_CustomerList(String xmlMessage) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(CustomerList.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		CustomerList customerList = (CustomerList) unmarshaller.unmarshal(new StringReader(xmlMessage));
		return customerList;
	}

	public static String gerXMLFromObject(Customer customer) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter writer = new StringWriter();
		marshaller.marshal(customer, writer);
		return writer.toString();
	}

}
