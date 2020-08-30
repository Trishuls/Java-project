package com.trishul.AllInOneUsingAnno;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.trishul.AllInOneUsingAnno.DAO.AddClientDAO;

/**
 * Servlet implementation class addClientDetails
 */
public class addClientDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String client_name = request.getParameter("cname");
		client_name = client_name.toLowerCase();
//		String password = request.getParameter("pass");
		
		//specify the configuration file
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	
		AddClientDAO dao = factory.getBean(AddClientDAO.class);
		
//		int res = dao.deleteUserDetails(name);
//		AddClientDAO obj = new AddClientDAO();
//		System.out.println(client_name);
		int res = dao.addClientDetails(client_name);
		
//		System.out.println("res = "+res);
		PrintWriter out = response.getWriter();
		if(res == 1)
		{
			
			out.println("New user successfully added");
		}
		
		else
		{
			out.println("Not able to add new user!");
		}
	}

}
