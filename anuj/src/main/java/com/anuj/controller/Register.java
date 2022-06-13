package com.anuj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.anuj.model.DAOServices;
import com.anuj.model.DAOServicesImp;


@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Register() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/register.jsp");;
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		
		DAOServices service = new DAOServicesImp();
		service.connectionDB();
		
		service.tableRegister(name, city);
		
		request.setAttribute("register", "registration save");
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/register.jsp");;
		rd.include(request, response);
		
		
		
		
	}

}
