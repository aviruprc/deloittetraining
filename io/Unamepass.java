package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Unamepass {
	private static String fileName = "D:/data.txt";
	
	public static void main (String [] args)
	{
		File file = new File (fileName);
		boolean fileExists = file.exists();
		if (fileExists) {
			FileReader reader = null;
			BufferedReader buffer = null;
			
			try {
				reader = new FileReader(file);
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
				e.printStackTrace();
			}
			
			buffer = new BufferedReader (reader);
			String line = "";
			try 
			{
				line = buffer.readLine();
				String[] pass1 = new String[2];
				while (line!= null) {
					pass1 = line.split(":");
					System.out.println("The username is: " + pass1[0] +" and the password is:" + pass1[1]);
					line = buffer.readLine();
				}
			} catch (IOException e)
			{
				System.out.println("Error reading file" + e.getMessage());
			}
		}
			
	}
	

}
