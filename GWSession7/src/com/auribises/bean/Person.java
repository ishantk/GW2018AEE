package com.auribises.bean;

import java.util.List;

public class Person {

	String name;
	Integer age;
	String email;
	
	Address address; 			// Has-A Relation | 1 to 1
	
	List<String> certificates;  //  Has-A Relation | 1 to many
	
	public Person() {
		System.out.println("==Person Object Constructed in Default Way==");
	}

	public Person(String name, Integer age, String email, Address address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	// Constructor Based Dependency Injection
	public Person(Address address) {
		System.out.println("==Person Object Constructed==");
		System.out.println("==Conctructor Injection==");
		this.address = address;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	// Setter Based Dependency Injection
	public void setAddress(Address address) {
		System.out.println("==Setter Injection==");
		this.address = address;
	}

	public List<String> getCertificates() {
		return certificates;
	}

	// Setter Based Dependency Injection for Collection
	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", address=" + address + "]";
	}
	
	
	
}
