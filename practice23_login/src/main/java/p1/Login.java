package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/verfylogin")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		//System.out.println("email "+email);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_db_p", "root", "anujabhay");
			Statement stmt = con.createStatement();
			//System.out.println("connected");
			ResultSet result = stmt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
			
			//System.out.println(result.next());
			if(result.next()) {
				System.out.println("welcome");
				RequestDispatcher rd = request.getRequestDispatcher("welcome.html");
				rd.forward(request, response);
			}else {
				System.out.println("invalid username/password");
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	
	}

}
