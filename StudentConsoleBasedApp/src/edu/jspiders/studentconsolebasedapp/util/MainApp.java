package edu.jspiders.studentconsolebasedapp.util;

import java.util.ArrayList;
import java.util.Scanner;

import edu.jspiders.studentconsolebasedapp.dao.StudentDataBaseOperations;
import edu.jspiders.studentconsolebasedapp.dto.Student;

public class MainApp 
{

	public static void main(String[] args)
	{
		System.out.println("********-----WELCOME-----*********");
		Scanner sc = new Scanner(System.in);
		
		StudentDataBaseOperations operations = new StudentDataBaseOperations();
		
		while(true)
		{
			System.out.println("************************");

			System.out.println("1.Insert student\n2.Search based on ID\n3.Update Marks\n4.Delete Student");
			System.out.println("5.Display All Students\n6.Display FCD Students\n7.Display FC Students");
			System.out.println("8.Display SC Students\n9.Display Failed Students\n10.EXIT");

			System.out.println("************************");

			System.out.println("Enter your Choice!!!");
			int choice = sc.nextInt();

			switch (choice)
			{
			case 1:
				//Insert logic

				break;
			case 2:
				//Search logic

				break;
			case 3:
				//Update logic

				break;
			case 4:
				//Delete logic

				break;
			case 5:
				//Display all Students logic
				ArrayList<Student> allStudents = operations.getAllStudents();
				if(allStudents.isEmpty())
					System.out.println("No Student Records Found!!");
				else
				{
					for (Student student : allStudents)
					{
						System.out.println(student);
					}
				}
				break;
			case 6:
				//Display all FCD Students logic

				break;
			case 7:
				//Display all FC Students logic

				break;
			case 8:
				//Display all SC Students logic

				break;
			case 9:
				//Display all Failed Students logic

				break;
			case 10:
				//Exit logic
				System.out.println("************Thank You************");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice!!!!!");
				break;
			}
		}
	}

}
