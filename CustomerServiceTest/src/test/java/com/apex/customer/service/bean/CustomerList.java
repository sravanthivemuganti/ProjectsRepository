package com.apex.customer.service.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CUSTOMERList")
public class CustomerList {

	int customerId;

	public CustomerList() {
		super();
	}

	public int getCustomerId() {
		return customerId;
	}
	@XmlElement(name="CUSTOMER")
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
}
