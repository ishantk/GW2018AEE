package com.auribises.model;

public class Person {

	Integer pid;
	String name;
	Integer age;
	String phone;
	String email;
	
	Address address; // HAS-A Relation | 1 to 1

	public Person(){
		
	}
	
	public Person(Integer pid, String name, Integer age, String phone, String email, Address address) {
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", age=" + age + ", phone=" + phone + ", email=" + email
				+ ", address=" + address + "]";
	}

}
