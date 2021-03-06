package edu.jspiders.filehandelingdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CricketersOperations
{
	public static void main(String[] args) throws IOException
	{
		File inputFile = new File("E:\\Satyam\\J2EE\\HEJM33\\FileHandeling\\cricketers.txt");
		FileReader reader = new FileReader(inputFile);
		BufferedReader bReader = new BufferedReader(reader);
		
		bReader.readLine();
		String line = bReader.readLine();
		FileWriter writer = null;
		while (line != null)
		{
			//System.out.println(line);
			String[] lineArr = line.split(" ");
			if(lineArr[2].equalsIgnoreCase("Batter"))
			{
				//write data to batters.txt
				File battersFile = new File("E:\\Satyam\\J2EE\\HEJM33\\FileHandeling\\batters.txt");
				writer = new FileWriter(battersFile,true);
			}
			else if(lineArr[2].equalsIgnoreCase("Bowler"))
			{
				//write data to bowlers.txt
				File bowlerFile = new File("E:\\Satyam\\J2EE\\HEJM33\\FileHandeling\\bowlers.txt");
				writer = new FileWriter(bowlerFile,true);
			}
			else if(lineArr[2].equalsIgnoreCase("Allrounder"))
			{
				//write data to Allrounder.txt
				File allRounderFile = new File("E:\\Satyam\\J2EE\\HEJM33\\FileHandeling\\allRounders.txt");
				writer = new FileWriter(allRounderFile,true);
			}
			
			writer.append(line);
			writer.append("\n");
			writer.flush();
			line = bReader.readLine();
		}
		System.out.println("Done!!!");
		bReader.close();
		reader.close();
		
	}
}
