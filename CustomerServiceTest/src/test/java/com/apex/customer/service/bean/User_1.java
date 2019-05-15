package com.apex.customer.service.bean;


public class User_1 {
	User_2 data;

	public User_1(User_2 data) {
		super();
		this.data = data;
	}

	public User_1() {
		super();
	}

	public User_2 getData() {
		return data;
	}

	public void setData(User_2 data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "User_1 [data=" + data + "]";
	}
	
}
