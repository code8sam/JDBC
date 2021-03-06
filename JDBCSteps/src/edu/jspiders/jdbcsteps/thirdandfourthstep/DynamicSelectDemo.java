package edu.jspiders.jdbcsteps.thirdandfourthstep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicSelectDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		double marks = sc.nextDouble();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			//1.Load the Drivers
			Class.forName("com.mysql.jdbc.Driver");
			
			//2.Get the Connections
			String dburl = "jdbc:mysql://localhost:3306/hejm33_db?user=root&password=root";
			con = DriverManager.getConnection(dburl);
			
			//3.Issue the SQL query
			String query = "SELECT * FROM student_table where marks < ?";
			pstmt = con.prepareStatement(query);
			pstmt.setDouble(1, marks);
			rs = pstmt.executeQuery();
			
			//4.Process the result returned by SQL query
			while (rs.next()) 
			{
				int id = rs.getInt(1);
				String fnm = rs.getString(2);
				String lnm = rs.getString(3);
				double mrks = rs.getDouble(4);
				
				System.out.println(id+"\t\t"+fnm+"\t\t"+lnm+"\t\t"+mrks);
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(con != null)
			{
				try 
				{
					con.close();
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			
			if(pstmt != null)
			{
				try 
				{
					pstmt.close();
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			
			if(rs != null)
			{
				try 
				{
					rs.close();
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}
