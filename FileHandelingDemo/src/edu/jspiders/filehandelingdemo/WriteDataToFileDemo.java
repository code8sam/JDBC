package edu.jspiders.filehandelingdemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFileDemo 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("E:\\Satyam\\J2EE\\HEJM33\\FileHandeling\\Test.txt");
		
		FileWriter writer = new FileWriter(f,true);
		
		writer.write('A');
		writer.write('B');
		
		writer.append('C');
		writer.append("\n");
		
		writer.append("This is a line1 written from java program.\n");
		writer.append("This is a line2 written from java program.\n");
		
		writer.flush();
		
		System.out.println("Data Written into file!!!!");
		
		writer.close();
	}
}
