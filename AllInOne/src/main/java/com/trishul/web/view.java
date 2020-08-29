package com.trishul.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trishul.web.DAO.ViewDAO;
import com.trishul.web.model.LoginGetterSetter;

/**
 * Servlet implementation class view
 */
public class view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		ViewDAO dao = new ViewDAO();
		ArrayList<LoginGetterSetter> l1 = dao.getDetails();
//		String[] res = dao.getDetails();
		request.setAttribute("result", l1);
//		out.println(l1);
		RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
		rd.forward(request, response);
	}

}
