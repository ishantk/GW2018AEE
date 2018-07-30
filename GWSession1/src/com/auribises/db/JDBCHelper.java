package com.auribises.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.auribises.model.User;


public class JDBCHelper {
	
	Connection con;
	PreparedStatement pStmt;

	public JDBCHelper() {
		
		try {
			
			//1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		
	}
	
	public void createConnection(){
		try {
			//2. Create the Connection
			String url = "jdbc:mysql://localhost/GW2018AI";
			String username = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, username, password);
			System.out.println("--Connection Created--");
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}
	
	
	public int registerUser(User uRef){
		
		int i = 0;
		
		try {
			//3. Write SQL Statement
			String sql = "insert into User values(null, ?, ?, ?)";
			
			//4. Execute SQL Statement
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, uRef.name);
			pStmt.setString(2, uRef.email);
			pStmt.setString(3, uRef.password);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		
		return i;
	}  
	
	public boolean authenticateUser(User uRef){
		
		boolean flag = true;
		
		try {
			//3. Write SQL Statement
			String sql = "select * from User where email = ? and password = ?";
			
			//4. Execute SQL Statement
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, uRef.email);
			pStmt.setString(2, uRef.password);
			
			ResultSet rs = pStmt.executeQuery();
			
			flag = rs.next();
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		
		return flag;
	}  
	
	public void closeConnection(){
		try {
			con.close();
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}
	
}
