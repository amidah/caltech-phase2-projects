package com.java.jdbcexample.model;

/*
 create table Customer(
 cid int primary key auto_increment,
 name varchar(256),
 phone varchar(256),
 email varchar(256),
 birthDate varchar(256),
 age int,
 registeredOn varchar(256),
 temperature float
 );
*/
public class Customer {

	Integer cid;
	String name;
	String phone;
	String email;
	String birthDate;
	Integer age;
	String registeredOn;
	Float temperature;
	
	public Customer() {
		
	}

	public Customer(String name, String phone, String email, String birthDate, Integer age, String registeredOn,
			Float temperature) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.birthDate = birthDate;
		this.age = age;
		this.registeredOn = registeredOn;
		this.temperature = temperature;
	}

	
	
	public Integer getCid() {
		return cid;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public Integer getAge() {
		return age;
	}

	public String getRegisteredOn() {
		return registeredOn;
	}

	public Float getTemperature() {
		return temperature;
	}

	
	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setRegisteredOn(String registeredOn) {
		this.registeredOn = registeredOn;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", email=" + email + ", birthDate=" + birthDate
				+ ", age=" + age + ", registeredOn=" + registeredOn + ", temperature=" + temperature + "]";
	}
	
}
