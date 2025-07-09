package com.firstapp.controller.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "unkonow")
public class Employee {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name= "first_name", nullable= false)
private String firstname;

@Column (name = "lastname",nullable=false)
private String lastname;

@Column(name="email",nullable=false,unique= true)
private String email;

@Column(name="mobile",nullable=false,unique= true)
private String mobile;

public long getId() {
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

public void setId(long id) {
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

}