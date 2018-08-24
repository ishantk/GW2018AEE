package com.auribises;

public class Employee {
	
	Integer eid;
	String name;
	Integer salary;
	String email;
	String competency;
	
	public Employee() {

	}

	public Employee(Integer eid, String name, Integer salary, String email, String competency) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.competency = competency;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
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

	public String getCompetency() {
		return competency;
	}

	public void setCompetency(String competency) {
		this.competency = competency;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", email=" + email + ", competency="
				+ competency + "]";
	}
	
	// Core Business Logic
	public void allocateSeatAndDept(int exp){
		if(exp>10 && competency.equals("AWS")){
			System.out.println("You have been allocated seat on 5th Floor in R&D Dept");
		}else{
			System.out.println("You have been allocated seat on 10th Floor in R&D Dept");
		}
	}
	
}
