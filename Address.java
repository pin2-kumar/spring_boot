package com.firstapp.controller.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String city;
    private String state;
    private int pinCode;
    private String addressLine;
    
    
    
    
	public long getId() {
		return id;
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
	public void setId(long id) {
		this.id = id;
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
