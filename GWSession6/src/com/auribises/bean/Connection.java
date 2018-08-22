package com.auribises.bean;

public class Connection {
	
	// Attributes
	String driverName;
	String url;
	String user;
	String password;

	public Connection() {
		System.out.println("==Connection Object Constructed==");
	}

	public Connection(String driverName, String url, String user, String password) {
		this.driverName = driverName;
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void myInit(){
		System.out.println("-- Connection myInit --");
	}
	
	public void myDestroy(){
		System.out.println("-- Connection myDestroy --");
	}

	@Override
	public String toString() {
		return "Connection [driverName=" + driverName + ", url=" + url + ", user=" + user + ", password=" + password
				+ "] | "+super.toString();
	}
	
	
}
