package edu.jspiders.jdbcsteps.thirdandfourthstep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TopperOfClass {

	public static void main(String[] args) {

		try
		{
			//1.Load the Drivers
			Class.forName("com.mysql.jdbc.Driver");

			//2.Get the Connections
			String dburl = "jdbc:mysql://localhost:3306/hejm33_db?user=root&password=root";
			Connection con = DriverManager.getConnection(dburl);

			//3.Issue the SQL query
			String query = "SELECT * FROM student_table WHERE marks = (SELECT max(marks) FROM student_table)";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

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
	}
}
