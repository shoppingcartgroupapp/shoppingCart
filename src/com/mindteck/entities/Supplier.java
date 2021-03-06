package com.mindteck.entities;

public class Supplier {
	
	private int supplierId;
	private String name;
	private String address;
	private long phone;
	private String email;
	private String password;
	
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", name=" + name
				+ ", address=" + address + ", phone=" + phone + ", email="
				+ email + ", password=" + password + "]";
	}

	public String simpleToString() {
		return this.supplierId + " " + this.name;
	}
	
}
