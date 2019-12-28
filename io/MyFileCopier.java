package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileCopier {

	private static String fileName = "D://data.txt ";
	private static String newFileName = "D://newdata.txt";
	public static void main(String[] args) {
		File file = new File (fileName);
		boolean fileExists = file.exists();
		if (fileExists) {
			FileReader reader = null;
			BufferedReader buffer = null;
			FileWriter fw = null;
			try {
				fw = new FileWriter(newFileName);
			} catch (IOException e) {
				e.printStackTrace();
			}

			PrintWriter out = null;
			out = new PrintWriter (fw);
			out.flush();

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
				System.out.println("Reading File Now");
				line = buffer.readLine();
				while (line!= null) {
					System.out.println("Writing to File Now");
					out.println(line);
					line = buffer.readLine();
				} if (line == null)
				{
					System.out.println("End of File");
				}
			} catch (IOException e)
			{
				System.out.println("Error reading file" + e.getMessage());
			}

			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e)
				{
					e.printStackTrace();
				}

			}

		}

	}
}
