package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@WebServlet("/new")
public class NewRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public NewRegistration() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		String lastname=request.getParameter("lastname");
		String city = request.getParameter("city");
		String mobile =request.getParameter("mobile");
		System.out.println("lastname");
		
		try  {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","anujabhay");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into table1 value('"+lastname+"','"+city+"','"+mobile+"')");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
