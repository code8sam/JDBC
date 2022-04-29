package edu.jspiders.studentconsolebasedapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.jspiders.studentconsolebasedapp.dto.Student;

public class StudentDataBaseOperations 
{
	private final static String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private final static String DB_URL = "jdbc:mysql://localhost:3306/hejm33_db?user=root&password=root";
	
	
	/**
	 * this method will insert student data to student table 
	 * @param newStudent
	 * @return true if data inserted else false
	 */
	public boolean insertStudent(Student newStudent)
	{
		//logic to insert into DataBase
		//INSERT INTO student_table VALUES(?,?,?,?)
		
		return false;
	}
	
	/**
	 * search student based on ID
	 * @param studentId
	 * @return student Object with data
	 */
	public Student search(int studentId)
	{
		//logic to Search student records
		//SELECT * FROM student_table WHERE id=?
		Student searchedStudent = new Student();
		
		return searchedStudent;
		
	}
	
	/**
	 * search student based on first name or last name
	 * @param name
	 * @return student Object with data
	 */
	public Student search(String name)
	{
		//logic to Search student records
		//SELECT * FROM student_table WHERE first_name = ? OR last_name = ?
		Student searchedStudent = new Student();
		
		return searchedStudent;
		
	}
	
	/**
	 * update student marks
	 * @param id
	 * @param newMarks to be updated
	 * @return true if data updated else false
	 */
	public boolean update(int id,double newMarks)
	{
		//logic to update Marks
		//UPDATE student_table set marks = ? WHERE id=?
		return false;
	}
	
	/**
	 * delete student data from database
	 * @param id
	 * @return true if data deleted else false
	 */
	public boolean delete(int id)
	{
		//logic to delete
		//DELETE FROM student_table WHERE id = ?
		
		return false;
	}
	
	
	/**
	 * fetch all student data from database
	 * @return all students data in the form of ArrayList
	 */
	public ArrayList<Student> getAllStudents()
	{
		//logic to get All records present in student_table
		//SELECT * FROM student_table
		
		ArrayList<Student> allStudents = new ArrayList<>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			Class.forName(DRIVER_CLASS);
			
			con = DriverManager.getConnection(DB_URL);
			
			String query = "SELECT * FROM student_table";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next())
			{
				int id = rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				double marks = rs.getDouble(4);
				
				Student s = new Student();
				s.setId(id);
				s.setFirstName(fname);
				s.setLastName(lname);
				s.setMarks(marks);
				
				allStudents.add(s);
				
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
			if(stmt != null)
			{
				try 
				{
					stmt.close();
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
		
		return allStudents;
		
	}
}
