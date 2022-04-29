package edu.jspiders.filehandelingdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFileDemo
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("E:\\Satyam\\J2EE\\HEJM33\\FileHandeling\\Test.txt");
		FileReader reader = new FileReader(f);
		
		/*int asciiVal = reader.read();
		
		String completeData = "";
		while(asciiVal != -1)
		{
			char data = (char) asciiVal;
			//System.out.print(data);
			completeData += data;
			asciiVal = reader.read();
		}
		System.out.println(completeData);*/
		
		BufferedReader bReader = new BufferedReader(reader); 
		String line = bReader.readLine();
		String completeData = "";
		while (line != null)
		{
			completeData += line;
			completeData += "\n";
			line = bReader.readLine();
		}
		System.out.println(completeData);
		reader.close();
	}
}
