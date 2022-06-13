package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/firstServlet")
public class Firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Firstservlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("name");
		
		//request variable
		request.setAttribute("msg", name);
		
		
		//Session Variable
		HttpSession session = request.getSession();
		session.setAttribute("sessionMsg", name);
		
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("secondServlet");
		rd.forward(request, response);
	
		
		
	}

}
