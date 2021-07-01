package com.bank.reigister.customer.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="customerinfo", schema = "springboot_db")
public class CustomerInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="firstname")
	@NotBlank(message = "First Name is mandotory")
	@Size(min=1,max=10,message="First Name must be having max 5 length")
	private String firstname;
	
	@Column(name="lastname")
	@NotBlank(message = "Last Name is mandotory")
	@Size(min=1,max=10,message="Last Name must be having max 5 length")
	private String lastname;
	
	@Column(name="age")
	@NotBlank(message = "Age is mandotory")
	@Size(min=1,max=2,message="Age must be in 1 and 100")
	private String age;
	
	@Column(name="contactnumber")
	@NotBlank(message = "Contact Number is mandotory")
	private String contactnumber;
	
	@Column(name="emailid")
	@Email
	private String emailid;
	
	@Column(name="address")
	@NotBlank(message = "Address is mandotory")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pincode")
	@NotBlank(message = "PinCode is mandotory")
	private String pincode;
	
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
