package com.auribises.model;

public class LEDTV extends TV{

	Integer wattage;
	String type;
	
	
	public LEDTV() {
	
	}


	public LEDTV(Integer wattage, String type) {
		this.wattage = wattage;
		this.type = type;
	}


	public Integer getWattage() {
		return wattage;
	}


	public void setWattage(Integer wattage) {
		this.wattage = wattage;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "LEDTV [wattage=" + wattage + ", type=" + type + "]";
	}
	
}
