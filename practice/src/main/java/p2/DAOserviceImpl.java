package p2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DAOserviceImpl implements DAOservice {

	private Connection con;
	private Statement stmt;
	
	@Override
	public void connectDB() {
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","password");
			 stmt = con.createStatement();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void createRegidtration(String name, String age, String city) {
		try {
			stmt.executeUpdate("insert into table1 value('"+name+"','"+age+"','"+city+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
