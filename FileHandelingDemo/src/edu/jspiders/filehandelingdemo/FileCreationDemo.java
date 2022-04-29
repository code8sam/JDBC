package edu.jspiders.filehandelingdemo;

import java.io.File;
import java.io.IOException;

public class FileCreationDemo {

	public static void main(String[] args) throws IOException
	{
		/*File f = new File("E:\\Rakshith\\J2EE\\HEJM33\\FileHandeling\\Test.mp4");*/
		
		File f = new File("./resources/test.properties");
		boolean isCreated = f.createNewFile();
		if(isCreated)
			System.out.println("File Created!!");
		else
			System.out.println("File not Created!!");
	}

}
