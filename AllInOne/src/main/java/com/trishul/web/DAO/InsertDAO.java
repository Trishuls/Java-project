package com.trishul.web.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertDAO {

	String url = "jdbc:postgresql://localhost:5432/learning";
	String username = "postgres";
	String password = "Trishul@1997";
	String query = "INSERT INTO login_credentials (username,password) VALUES (?,?)";
	
	public int addUserDetails(String uname,String pass)
	{
		int result = 0;
		try 
		{
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url,username,password);
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, uname);
			stmt.setString(2, pass);
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
