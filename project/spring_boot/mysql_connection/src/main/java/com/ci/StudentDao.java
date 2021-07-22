package com.ci;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {

	//insert data
	public void insert(Student s1) {
		
		try {
			//connection
			Connection con = DbConnection.dbConnect();
			
			//sql
			String sql = "insert into studData(id , name , email , fee , location) values(? , ? , ? , ? , ?)";
			
			//statement
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, s1.getId());
			stmt.setString(2, s1.getName());
			stmt.setString(3, s1.getEmail());
			stmt.setFloat(4, s1.getFee());
			stmt.setString(5, s1.getLocation());
			
			//execution
			stmt.executeUpdate();
			System.out.println("Data insert Successfully.");
		} catch (Exception e) {
			System.out.println("Data not insert Successfully " + e.getMessage());
		}
	}
	
	//update data
	public void update(Student s1) {
		
		try {
			//connection
			Connection con = DbConnection.dbConnect();
			//sql
			String sql = "update studData set fee = ? where id = ?";	
			//statement
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setFloat(1, s1.getFee());
			stmt.setInt(2, s1.getId());
			//execute
			stmt.executeUpdate();
			System.out.println("Data update Successfully.");
		} catch (Exception e) {
			System.out.println("Data not update Successfully " + e.getMessage());
		}
	}
	
	//delete data
	public void delete(Integer id) {
		
		try {
			//connection
			Connection con = DbConnection.dbConnect();
			//sql
			String sql = "delete from studData where id = ?";
			//statement
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			//execute
			stmt.executeUpdate();
			System.out.println("Data delete Successfully.");
		} catch (Exception e) {
			System.out.println("Data not delete Successfully" + e.getMessage());
		}
	}
	
	//show all data
	public void showAll() {
		
		try {
			//connection
			Connection con = DbConnection.dbConnect();
			//sql
			String sql = "select * from studData";
			//statement
			PreparedStatement stmt = con.prepareStatement(sql);
			//execute
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("id") + " " + rs.getString("name") + " " + rs.getString("email") + " " + rs.getString("fee") + " " + rs.getString("location"));
			}
			System.out.println("Data delete Successfully.");
		} catch (Exception e) {
			System.out.println("All data not fetch Successfully " + e.getMessage());
		}
	}
}
