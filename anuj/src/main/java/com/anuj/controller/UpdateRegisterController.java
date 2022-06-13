package com.anuj.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.anuj.model.DAOServices;
import com.anuj.model.DAOServicesImp;


@WebServlet("/update")
public class UpdateRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateRegisterController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		//System.out.println(name);
		//System.out.println(city);
		request.setAttribute("name", name);
		request.setAttribute("city", city);
		RequestDispatcher rd = request.getRequestDispatcher("update_registration.jsp");
		rd.forward(request, response);
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		DAOServices service = new DAOServicesImp();
		service.connectionDB();
		service.updateReg(name, city);
		ResultSet result = service.getAllReg();
		
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("listAll.jsp");
		rd.forward(request, response);
	
	
	}
	

}
