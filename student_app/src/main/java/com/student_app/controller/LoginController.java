package com.student_app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.student_app.model.DAOService;

import com.student_app.model.DAOServiceImpl;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		DAOService service = new DAOServiceImpl();
		service.connectDB();
		boolean status = service .verifyCredentials(email, password);
		if(status == true) {
			
			HttpSession session = request.getSession(true);
			session.setAttribute("email", email);
			
			System.out.println("welcome");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/new_registration.jsp");
			rd.forward(request, response);
		}else {
			System.out.println("invalied ");
			request.setAttribute("msg", "invalid username/password");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/new_registration.jsp");
			rd.include(request, response);
		}
		
		
		
		
		
		
		
		
		
//		DAOService service = new DAOServiceImp();
//		
//		service.connectDB();
//		boolean status = service.veryfy(email, password);
//		if(status == true) {
//			RequestDispatcher rd = request.getRequestDispatcher("register");
//			rd.forward(request, response);
//		}else {
//			request.setAttribute("error", "invalid /email/password");
//			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
//			rd.include(request, response);
//			
//		}
		
		
		
		
		
		
	}

}
