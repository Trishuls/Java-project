package com.trishul.web.postgresConfig;

import java.sql.Connection;
import java.sql.DriverManager;

//This file contains all the connections of database
public class DBManager 
{
	public Connection getMasterDBConnection()
	{
		Connection conn = null;
		try
		{			
			String url = "jdbc:postgresql://localhost:5432/MasterDB";
			String username = "postgres";
			String password = "Trishul@1997";
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url,username,password);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return conn;
	}
}
