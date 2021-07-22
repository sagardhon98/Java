package com.ci;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection dbConnect() {
		Connection con = null;
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Connectivity object
			
			//db information
			String url = "jdbc:mysql://localhost:3307/record";
			String username = "root";
			String password = "root";
			
			con = DriverManager.getConnection(url, username, password);
			
			System.out.println("Connection status : " + "Connection successfully.");
			return con;
		} catch (Exception e) {
			System.out.println("Connection status : " + "Connection failed " + e.getMessage());
			return con;
		}
	}
	
}
