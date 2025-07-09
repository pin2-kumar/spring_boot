package com.firstapp.Dto;

public class EmployeeDto {
	
	private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String mobile;
    private String city;
    private String state;
    private int pinCode;
    private String addressLine;
    
    
	public int getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getEmail() {
		return email;
	}
	public String getMobile() {
		return mobile;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
    
    

}
