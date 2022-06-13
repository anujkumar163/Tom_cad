package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/secondservlet")
public class Secondservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Secondservlet() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//geting reuest variable
				String name = request.getAttribute("msg").toString();
				System.out.println(name);
				
				//geting session variable
				
				HttpSession session = request.getSession();
				System.out.println(session.getAttribute("sessionMsg"));
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//geting reuest variable
		String name = request.getAttribute("msg").toString();
		System.out.println(name);
		
		//geting session variable
		
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("sessionMsg"));
		
	}

}
