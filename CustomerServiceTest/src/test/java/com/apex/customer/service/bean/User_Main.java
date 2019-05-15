package com.apex.customer.service.bean;

public class User_Main {

	

	int per_page;
    int  total;
    int total_pages;
    User_Sub data;    
   
		public class User_Sub {
    		int id;    		
			String email;
    		String first_name;
    		String last_name;
    		String avatar;
    		@Override
			public String toString() {
				return "User_Sub [id=" + id + ", email=" + email + ", first_name=" + first_name + ", last_name="
						+ last_name + ", avatar=" + avatar + "]";
			}
    }

		@Override
		public String toString() {
			return "User_Main [per_page=" + per_page + ", total=" + total + ", total_pages=" + total_pages
					+ ", user_Sub=" + data + "]";
		}
}
