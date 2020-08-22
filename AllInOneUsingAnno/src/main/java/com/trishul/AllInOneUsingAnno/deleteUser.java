package com.trishul.AllInOneUsingAnno;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.trishul.AllInOneUsingAnno.DAO.DeleteDAO;


/**
 * Servlet implementation class deleteUser
 */
public class deleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String name = request.getParameter("uname");
			
			//specify the configuration file
	    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
	    	
			DeleteDAO dao = factory.getBean(DeleteDAO.class);
			
			int res = dao.deleteUserDetails(name);
			
			PrintWriter out = response.getWriter();
			
	//		System.out.println("res = "+res);
			
			if(res == 1)
			{
//				response.sendRedirect("insertsuccess.jsp");
				out.println("User with username " + name + " deleted successfully");
			}
			
			else
			{
				out.println("Not able to add credentials!");
			}
			((AbstractApplicationContext)factory).close();
		}
	}


