package com.trishul.web.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.trishul.web.postgresConfig.DBManager;

public class AddClientDAO 
{
	public int addClientDetails(String client_name) {
		int add_client_result = 0;
		int result = 0;
		try
		{
			String query = "INSERT INTO clients_table (client_name) VALUES ('"+client_name+"');";
			
			DBManager dbm = new DBManager();
			Connection conn = dbm.getMasterDBConnection();
			PreparedStatement stmt = conn.prepareStatement(query);
			
			result = stmt.executeUpdate();
			
			if(result == 1)
			{
				String add_client_query = "CREATE DATABASE "+client_name+";";
				
//				Connection conn_add_client = dbm.getMasterDBConnection();
				PreparedStatement stmt_add_client = conn.prepareStatement(add_client_query);
				
				add_client_result = stmt_add_client.executeUpdate();
				
				String grant_permission_query = "ALTER DATABASE "+client_name+" OWNER TO postgres;";
//				Connection conn_permission = dbm.getMasterDBConnection();
				PreparedStatement stmt_permission = conn.prepareStatement(grant_permission_query);
				
				add_client_result = stmt_permission.executeUpdate();
				
				Runtime.getRuntime().exec("psql -h localhost -p 5432 -U postgres -f C:\\Users\\User\\git\\Java-project\\AllInOne\\src\\main\\sql\\ClientsDB.sql "+client_name);
			}
			conn.close();
		}
		catch(Exception e)
		{
//			conn.close();
			e.printStackTrace();
		}
		
		return 1;
	}
}
