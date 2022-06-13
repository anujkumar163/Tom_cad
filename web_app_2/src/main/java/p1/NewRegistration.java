package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

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
		String lastname= request.getParameter("lastname");
		String city = request.getParameter("city");
		String mobile = request.getParameter("mobile");
		System.out.println(lastname);
		System.out.println(city);
		System.out.println(mobile);
	}

}
