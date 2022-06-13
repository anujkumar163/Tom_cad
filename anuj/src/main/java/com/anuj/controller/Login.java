package com.anuj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.anuj.model.DAOServicesImp;
import com.anuj.model.DAOServices;
import com.anuj.model.DAOServicesImp;


@WebServlet("/login")
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
		
		DAOServices service = new DAOServicesImp();
		service.connectionDB();
		
		boolean status = service.very(email, password);
		if(status == true) {
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/register.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("error", "invalied details");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
				
		
	}

}
