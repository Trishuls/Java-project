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
import org.springframework.security.crypto.bcrypt.BCrypt;

import com.trishul.AllInOneUsingAnno.DAO.InsertDAO;

/**
 * Servlet implementation class addCred
 */
public class addCred extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("uname");
		String password = BCrypt.hashpw(request.getParameter("pass"), BCrypt.gensalt(12));
		
		//specify the configuration file
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	
		InsertDAO dao = factory.getBean(InsertDAO.class);
		
		int res = dao.addUserDetails(name, password);
		
//		System.out.println("res = "+res);
		
		if(res == 1)
		{
			response.sendRedirect("insertsuccess.jsp");
		}
		
		else
		{
			PrintWriter out = response.getWriter();
			out.println("Not able to add credentials!");
		}
		((AbstractApplicationContext)factory).close();
	}

}
