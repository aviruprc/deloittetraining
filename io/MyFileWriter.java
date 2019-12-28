package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileWriter {
	private static String fileName = "D://password.txt";
	
	public static void main (String[] args)
	{
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		PrintWriter out = null;
		out = new PrintWriter (fw);
		out.println("hackerman:iamhackerman");
		out.println("devv:iamdevv");
		out.println("aviruprc:iamavi");
		out.println("sidrinzler:wtf");
		out.flush();
		
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
