package com.anuj.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOServicesImp implements DAOServices {

private Connection con;
	
	private Statement stmt;
	@Override
	public void connectionDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj","root","anujabhay");
			stmt = con.createStatement();
		} catch (Exception e) {	
			e.printStackTrace();
		}

	}
	@Override
	public boolean very(String email, String password) {
		try {
			 ResultSet result = stmt.executeQuery("select * from login where email='"+email+"' and password='"+password+"' ");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public void tableRegister(String name, String city) {
		try {
			stmt.executeUpdate("insert into register values('"+name+"','"+city+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public ResultSet getAllReg() {
		try {
			ResultSet result = stmt.executeQuery("select * from register");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public void deleteReg(String name) {
		try {
			stmt.executeUpdate("delete from register where name='"+name+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void updateReg(String name, String city) {
		try {
			stmt.executeUpdate("update register set name='"+name+"' where city='"+city+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
