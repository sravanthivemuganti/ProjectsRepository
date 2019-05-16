package org.apex.util;

public class Employee {

		private int empNo,zipCode,phone,experience;
		private String empName,address,state,emailAddress;
		private String designation[]= {"manager","lead","analyst"};
		private int basic,hra;
		private double bonus;
		public Employee() {
			empNo = 102;
			zipCode = 9453;
			phone = 12345;
			experience = 5;
			empName = "Sravanthi";
			address = "123, Fremont";
			state = "California";
			emailAddress = "abc@gmail.com";
			designation[1] = "manager";
			basic = 2000;
			hra = 5000;
			bonus = 5;
		}
						
		public Employee(int empNo, int zipCode, int phone, int experience, String empName, String address, String state,
				String emailAddress, String[] designation, int basic, int hra, double bonus) {
			//super();
			this.empNo = empNo;
			this.zipCode = zipCode;
			this.phone = phone;
			this.experience = experience;
			this.empName = empName;
			this.address = address;
			this.state = state;
			this.emailAddress = emailAddress;
			this.designation = designation;
			this.basic = basic;
			this.hra = hra;
			this.bonus = bonus;
		}
		public double totalSalary() {
			
			double totSal=this.basic+this.hra+((this.bonus/100)*this.basic);
			return totSal;
			
		}
		public int getEmpNo() {
			return empNo;
		}
		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
		public int getZipCode() {
			return zipCode;
		}
		public void setZipCode(int zipCode) {
			
			this.zipCode = zipCode;
		}
		public int getPhone() {
			return phone;
		}
		public void setPhone(int phone) {
			this.phone = phone;
		}
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getEmailAddress() {
			return emailAddress;
		}
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}
		public String[] getDesignation() {
			return designation;
		}
		public void setDesignation(String[] designation) {
			this.designation = designation;
		}
		public int getBasic() {
			return basic;
		}
		public void setBasic(int basic) {
			this.basic = basic;
		}
		public int getHra() {
			return hra;
		}
		public void setHra(int hra) {
			this.hra = hra;
		}
		public double getBonus() {
			return bonus;
		}
		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
		
		public static void main(String[] args) {
			Employee emp=new Employee();
			double tot=emp.totalSalary();
			System.out.println(tot);
		}
}


