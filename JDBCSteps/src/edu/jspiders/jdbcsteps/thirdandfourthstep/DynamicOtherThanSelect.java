package edu.jspiders.jdbcsteps.thirdandfourthstep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicOtherThanSelect 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID");
		int id = sc.nextInt();
		
		System.out.println("Enter First Name");
		String fname = sc.next();
		
		System.out.println("Enter Last Name");
		String lname = sc.next();
		
		System.out.println("Enter Marks");
		double marks = sc.nextDouble();
		try
		{
			//1.Load the Drivers
			Class.forName("com.mysql.jdbc.Driver");
			
			//2.get the connections
			String dburl = "jdbc:mysql://localhost:3306/hejm33_db?user=root&password=root";
			Connection con = DriverManager.getConnection(dburl);
			
			//3.Issue SQL Query
			String query = "INSERT INTO student_table VALUES(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.setString(2, fname);
			pstmt.setString(3, lname);
			pstmt.setDouble(4, marks);
			int rowsAffected = pstmt.executeUpdate();
			
			//4.Process the Result
			if(rowsAffected > 0)
				System.out.println("Data INSERTED!!");
			else
				System.out.println("Data NOT INSERTED!!");
			
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
