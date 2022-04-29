package edu.jspiders.claculator;

import java.util.Scanner;

import edu.jspiders.calculatorsupport.Calculate;

public class MainApp
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Calculate c = new Calculate();
		
		System.out.println("--------Welcome--------");
		while (true)
		{
			System.out.println("********************************************");
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication");
			System.out.println("4.Division\n5.Exit");
			System.out.println("********************************************");
			System.out.println("Enter Your Choice!!");
			int choice = sc.nextInt();
			
			switch (choice) 
			{
			case 1:
				//Addition logic
				System.out.println("Enter first number");
				int n1 = sc.nextInt();
				System.out.println("Enter second number");
				int n2 = sc.nextInt();
				int res = c.add(n1, n2);
				System.out.println("Result is "+res);
				break;
			case 2:
				//Subtraction logic
				System.out.println("Enter first number");
				n1 = sc.nextInt();
				System.out.println("Enter second number");
				n2 = sc.nextInt();
				res = c.subtract(n1, n2);
				System.out.println("Result is "+res);
				break;
			case 3:
				//Multiplication logic
				System.out.println("Enter first number");
				n1 = sc.nextInt();
				System.out.println("Enter second number");
				n2 = sc.nextInt();
				res = c.multiply(n1, n2);
				System.out.println("Result is "+res);
				break;
			case 4:
				//Division logic
				System.out.println("Enter first number");
				n1 = sc.nextInt();
				System.out.println("Enter second number");
				n2 = sc.nextInt();
				res = c.divide(n1, n2);
				System.out.println("Result is "+res);
				break;
			case 5:
				//Exit logic
				System.out.println("------Thank You------");
				System.exit(0);
				break;
			default:System.out.println("Invalid choice!!!!");
				break;
			}
		}
	}
}
