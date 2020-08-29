package com.trishul.web.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.trishul.web.postgresConfig.DBManager;

public class LoginDAO {

//	String url = "jdbc:postgresql://localhost:5432/learning";
//	String username = "postgres";
//	String password = "Trishul@1997";
	String query = "SELECT * FROM super_admin WHERE user_name = ? AND password = ?";
	
	public boolean checkLogin(String uname,String pass)
	{
		try 
		{
			DBManager dbm = new DBManager();
			Connection conn = dbm.getMasterDBConnection();
//			Class.forName("org.postgresql.Driver");
//			Connection conn = DriverManager.getConnection(url,username,password);
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, uname);
			stmt.setString(2, pass);
			ResultSet rs = stmt.executeQuery();
			
			conn.close();
			if(rs.next())
			{
				return true;
			}
			
//			else
//			{
//				return false;
//			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}
}
