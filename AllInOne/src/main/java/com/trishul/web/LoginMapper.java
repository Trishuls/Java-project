package com.trishul.web;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.trishul.web.model.LoginGetterSetter;

public class LoginMapper implements RowMapper
{
	public LoginGetterSetter mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		LoginGetterSetter obj = new LoginGetterSetter();
		obj.setUsername(rs.getString("username"));
		obj.setPassword(rs.getString("password"));
		
		return obj;
		
	}
}
