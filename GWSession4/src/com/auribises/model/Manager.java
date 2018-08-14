package com.auribises.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MANAGER")
public class Manager {

	@Id 
	@GeneratedValue
	@Column(name="MID")
	Integer mid;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="EXPERIENCE")
	Integer experience;
	
	@Column(name="SALARY")
	Integer salary;
	
	@Column(name="EMAIL")
	String email;

	public Manager(){
		
	}
	
	public Manager(Integer mid, String name, Integer experience, Integer salary, String email) {
		this.mid = mid;
		this.name = name;
		this.experience = experience;
		this.salary = salary;
		this.email = email;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
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

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", experience=" + experience + ", salary=" + salary
				+ ", email=" + email + "]";
	}
	
}
