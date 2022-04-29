package edu.jspiders.jdbcsteps.firststep;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstSetpSecondWay 
{
	public static void main(String[] args) 
	{
		/*try 
		{
			Driver d = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(d);
			
			System.out.println("Drivers Loaded!!!");
			
		} 
		catch (InstantiationException e) 
		{
			e.printStackTrace();
		} 
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}*/
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Drivers Loaded!!");
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
