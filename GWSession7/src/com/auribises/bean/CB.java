package com.auribises.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {

	CA ca; // Has-A Relation
	
	public CB() {
	
	}

	// Constructor Based Injection
	@Autowired
	public CB(CA ca) {
		this.ca = ca;
	}

	public CA getCa() {
		return ca;
	}

	// Setter based Injection
	public void setCa(CA ca) {
		this.ca = ca;
	}
	
}
