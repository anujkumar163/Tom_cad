package controller2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Add;



@WebServlet("/add2")
public class AddController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddController2() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		Add a = new Add();
		int result = a.sum(num1, num2);
		
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("add2.jsp");
		rd.forward(request, response);
		
		
		
		
	}

}
