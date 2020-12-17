package com.trishul.web.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.trishul.web.model.LoginGetterSetter;

public class ViewDAO {

	String url = "jdbc:postgresql://localhost:5432/learning";
	String username = "postgres";
	String password = "Trishul@1997";
	String query = "SELECT username,password FROM login_credentials;";
	
	public ArrayList<LoginGetterSetter> getDetails() {
		
		ArrayList<LoginGetterSetter> pList = new ArrayList<LoginGetterSetter>();
		LoginGetterSetter lgs = new LoginGetterSetter();
//		ArrayList<String> res = new ArrayList();
		
		try 
		{
			
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url,username,password);
			PreparedStatement stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			
			
			int i = 0;
			while(rs.next())
			{
//				LoginGetterSetter lgs = new LoginGetterSetter();
//				fetch value in getters and setters
				 lgs.setUsername(rs.getString("username"));
				 lgs.setPassword(rs.getString("password"));
//				String uname = rs.getString("username");
//				String pass = rs.getString("password");	
				System.out.println(lgs);
				 pList.add(lgs);
				
			}
			
//			else
//			{
//				return false;
//			}
//			return result;
			conn.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
//		System.out.println(pList);
		return pList;		
	}
}
