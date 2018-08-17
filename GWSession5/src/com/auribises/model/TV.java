package com.auribises.model;

public class TV extends Product{
	
	int screenSize;
	String company;
	
	
	public TV() {
	
	}


	public TV(int screenSize, String company) {
		this.screenSize = screenSize;
		this.company = company;
	}


	public int getScreenSize() {
		return screenSize;
	}


	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "TV [screenSize=" + screenSize + ", company=" + company + "]";
	}
	
}
