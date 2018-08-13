package com.auribises.model;

// Bean or Model or POJO
public class Employee {
	
	// Attributes
	Integer id;
	String name;
	Integer salary;
	String email;
	String dept;
	
	public Employee() {

	}

	public Employee(Integer id, String name, Integer salary, String email, String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.dept = dept;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + ", dept=" + dept
				+ "]";
	}
	
}
