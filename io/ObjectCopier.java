package io;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import collection.Student;
public class ObjectCopier {

	public static void main (String [] args) throws IOException
	{
		Student st = new Student ("akash", 12345);

		try {
			FileOutputStream fout = new FileOutputStream("D://std.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(st);
			oos.flush();
			oos.close();
			System.out.println("Object Serialized");
		} catch (FileNotFoundException ioe) {
			System.out.println("Object failed to serialize" + ioe.getMessage());		
		}
	}
}
