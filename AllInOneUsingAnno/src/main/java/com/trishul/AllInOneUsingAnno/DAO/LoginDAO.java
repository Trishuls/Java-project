package com.trishul.AllInOneUsingAnno.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;

import com.trishul.AllInOneUsingAnno.postgresConfig.DBManager;

@Component
public class LoginDAO {

//	String url = "jdbc:postgresql://localhost:5432/learning";
//	String username = "postgres";
//	String password = "Trishul@1997";
	String query = "SELECT * FROM super_admin WHERE username = ? AND password = ?";
	
	public boolean checkLogin(String uname,String pass)
	{
		try 
		{
			DBManager dbm = new DBManager();
//			Class.forName("org.postgresql.Driver");
			Connection conn = dbm.getMasterDBConnection();
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
