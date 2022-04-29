package edu.jspiders.jdbcsteps.secondstep;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SecondStepThirdWay
{
	public static void main(String[] args)
	{
		try 
		{
			//1.Load the Drivers
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers Loaded!!!");
			
			//2.Get the Connection
			String dburl = "jdbc:mysql://localhost:3306/hejm33_db";
			
			File f = new File("./resources/credentials.properties");
			FileReader reader = new FileReader(f);
			
			Properties info = new Properties();
			info.load(reader);
			
			Connection con = DriverManager.getConnection(dburl, info);
			
			if(con != null)
				System.out.println("Connections Established!!!!");
		} 
		catch (ClassNotFoundException | IOException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
