package edu.jspiders.jdbcsteps.thirdandfourthstep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DispalyStudentBasedOnRanks
{

	public static void main(String[] args)
	{
		System.out.println("FCD Students");
		System.out.println("_________________________________________________");
		getStudnetsBasedOnMarks(70.0,100.0);
		System.out.println("**************************************************");
		
		
		System.out.println("FC Students");
		System.out.println("_________________________________________________");
		getStudnetsBasedOnMarks(60.0,70.0);
		System.out.println("**************************************************");
		
		System.out.println("SC Students");
		System.out.println("_________________________________________________");
		getStudnetsBasedOnMarks(35.0,60.0);
		System.out.println("**************************************************");
		
		System.out.println("Failed Students");
		System.out.println("_________________________________________________");
		getStudnetsBasedOnMarks(0.0,35.0);
		System.out.println("**************************************************");
	}

	private static void getStudnetsBasedOnMarks(double lowerRange, double upperRange)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			String dburl = "jdbc:mysql://localhost:3306/hejm33_db?user=root&password=root";
			Connection con = DriverManager.getConnection(dburl);
			
			String query = "SELECT * FROM student_table where marks between ? and ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setDouble(1, lowerRange);
			pstmt.setDouble(2, upperRange);
			ResultSet rs = pstmt.executeQuery();
			
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
		
	}

}
