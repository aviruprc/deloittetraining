package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
	
	// 1. Create File with path
	// 2. Create file object
	// 3. Check if file exist
	// 4. Open File reader with object
	// 5. Buffered reader is used because readLine exists there not in File Reader
	
	private static String fileName = "D://data.txt ";
	public static void main(String[] args) {
		File file = new File (fileName);
		boolean fileExists = file.exists();
		if (fileExists) {
			System.out.println("file available?" +file.exists());
			System.out.println(file.getAbsolutePath());
			FileReader reader = null;
			BufferedReader buffer = null;


			// read file content
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
				while (line!= null) {
					System.out.println(line);
					line = buffer.readLine();
				}
			} catch (IOException e)
			{
				System.out.println("Error reading file" + e.getMessage());
			}
			
			
		}
	}
}
