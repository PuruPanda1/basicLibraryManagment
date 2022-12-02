package com.system;

import java.sql.DriverManager;

public class Connection {

	public static java.sql.Connection connect()
	{
	try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        //System.out.println("Loaded driver");
	        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Purabmodi1");
	        //System.out.println("Connected to MySQL");
	        return con;
	 } 
	 catch (Exception ex) {
	        ex.printStackTrace();
	 }
	return null;
	}
}
