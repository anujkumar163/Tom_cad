package com.student_app.model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DAOServiceImpl implements DAOService {
	
	private Connection con;
	private Statement stmnt;

	
	@Override
	public void connectDB() {
		try {
			Class.forName("com.jdbc.mysql.Driver");
			con = DriverManager.getConnection("mysql:jdbc://localhost:3306/db_app","root","anujabhay");
			stmnt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public boolean verifyCredentials(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}


	@Override
	public void createRegistration(String name, String city, String email, String password) {
		try {
			stmnt.executeUpdate("insert into reg values('"+name+"','"+city+"','"+email+"','"+password+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public ResultSet showAll() {
		try {
			ResultSet result = stmnt.executeQuery("select * from reg");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public void deleteReg(String email) {
		try {
			stmnt.executeUpdate("Delete from reg where email='"+email+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public void updateReg(String email, String mobile) {
		try {
			stmnt.executeUpdate("Update reg set mobile='"+mobile+"' where email='"+email+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
