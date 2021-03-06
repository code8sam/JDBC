package edu.jspiders.filehandelingdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("./resources/test.properties");
		FileReader reader = new FileReader(f);
		
		Properties prop = new Properties();
		prop.load(reader);
		
		String exp = prop.getProperty("exp");
		System.out.println(exp);
		
		String id = prop.getProperty("empId");
		System.out.println(id);
		
		String nm = prop.getProperty("name");
		System.out.println(nm);
	}
}
