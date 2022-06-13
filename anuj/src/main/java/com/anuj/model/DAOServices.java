package com.anuj.model;

import java.sql.ResultSet;

public interface DAOServices {
	public void connectionDB();

	public boolean very(String email, String password);

	public void tableRegister(String name, String city);

	public ResultSet getAllReg();

	public void deleteReg(String name);

	public void updateReg(String name, String city);
}
