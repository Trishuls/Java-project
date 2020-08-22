package com.trishul.AllInOneUsingAnno;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.trishul.AllInOneUsingAnno.DAO.ViewDAO;
import com.trishul.AllInOneUsingAnno.model.LoginGetterSetter;

/**
 * Servlet implementation class view
 */
public class view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		//specify the configuration file
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	
		ViewDAO dao = factory.getBean(ViewDAO.class);
		
		ArrayList<LoginGetterSetter> l1 = dao.getDetails();
//		String[] res = dao.getDetails();
		request.setAttribute("result", l1);
//		out.println(l1);
		
		//close the application context
		((AbstractApplicationContext)factory).close();
		
		RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
		rd.forward(request, response);
		
		//close the application context
		((AbstractApplicationContext)factory).close();
	}

}
