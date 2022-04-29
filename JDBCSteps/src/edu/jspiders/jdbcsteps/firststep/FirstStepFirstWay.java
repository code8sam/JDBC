package edu.jspiders.jdbcsteps.firststep;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstStepFirstWay 
{
	public static void main(String[] args) 
	{
		try 
		{
			Driver d = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(d);
			
			System.out.println("Drivers loaded!!!!");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
