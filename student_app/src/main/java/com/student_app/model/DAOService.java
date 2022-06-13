package com.student_app.model;

import java.sql.ResultSet;

public interface DAOService {
	public void connectDB();

	public boolean verifyCredentials(String email, String password);

	public void createRegistration(String name, String city, String email, String password);

	public ResultSet showAll();

	public void deleteReg(String email);

	public void updateReg(String email, String mobile);
}
