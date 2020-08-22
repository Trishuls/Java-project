package com.trishul.AllInOneUsingAnno.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class LoginGetterSetter 
{
	private String username;
	private String password;
	
	ArrayList result;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginGetterSetter [username=" + username + ", password=" + password + "]";
	}
	
	
	
}
