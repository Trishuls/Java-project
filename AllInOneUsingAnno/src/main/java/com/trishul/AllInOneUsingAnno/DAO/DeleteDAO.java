package com.trishul.AllInOneUsingAnno.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Component;

@Component
public class DeleteDAO 
{
	String url = "jdbc:postgresql://localhost:5432/learning";
	String username = "postgres";
	String password = "Trishul@1997";
	
	
	public int deleteUserDetails(String uname)
	{
		String query = "DELETE FROM login_credentials WHERE username = '"+uname+"'";
		int result = 0;
		try 
		{
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url,username,password);
			PreparedStatement stmt = conn.prepareStatement(query);
//			stmt.setString(1, uname);
			result = stmt.executeUpdate();
			
//			PrintWriter out = request.getWriter();
//			ResultSet rs = stmt.executeQuery();
			
//			if(rs.next())
//			{
//				return true;
//			}
			
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
		return result;
	}
}
