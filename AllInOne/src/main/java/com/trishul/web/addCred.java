package com.trishul.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trishul.web.DAO.InsertDAO;

/**
 * Servlet implementation class addCred
 */
public class addCred extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		InsertDAO dao = new InsertDAO();
		
		int res = dao.addUserDetails(name, password);
		
		System.out.println("res = "+res);
		
		if(res == 1)
		{
			response.sendRedirect("insertsuccess.jsp");
		}
		
		else
		{
			PrintWriter out = response.getWriter();
			out.println("Not able to add credentials!");
		}
	}

}
