package com.apex.customer.service.bean;

public class UserData {
	UserNestedData data;

	public UserNestedData getUsernestedData() {
		return data;
	}

	public void setUsernestedData(UserNestedData data) {
		this.data = data;
	}

	// Inner class for nested objects
	public static class UserNestedData {
		int id;
		String email;
		String first_name;
		String last_name;
		transient String avatar;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getAvatar() {
			return avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}

		@Override
		public String toString() {
			return "UserNestedData [id=" + id + ", email=" + email + ", first_name=" + first_name + ", last_name="
					+ last_name + ", avatar=" + avatar + "]";
		}

	}

	@Override
	public String toString() {
		return "UserData [data=" + data + "]";
	}
}
