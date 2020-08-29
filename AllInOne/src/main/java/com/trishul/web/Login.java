package com.trishul.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trishul.web.DAO.LoginDAO;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		LoginDAO dao = new LoginDAO();
		
		if(dao.checkLogin(name, password))
		{
			HttpSession session = request.getSession();
			session.setAttribute("uname", name);
			response.sendRedirect("welcome.jsp");
		}
		
		else
		{
			response.sendRedirect("index.jsp");
		}
		
	}

}
