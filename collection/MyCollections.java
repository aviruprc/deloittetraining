package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class MyCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Vector<String> v = new Vector();

		v.add("Ankit");
		v.add("Computer");
		v.add("Laptop");
		v.add("Mobile");

		System.out.println(v.size());
		int len = v.size();
		for (int i=0;i<len;i++)
		{
			System.out.println(v.get(i));
		}

		for (String s: v)
		{
			System.out.println(s);
		}

		v.add("iphone");

		System.out.println(v.size());

		Enumeration<String> E = v.elements();
		while (E.hasMoreElements()) {
			System.out.println(E.nextElement());
		}

		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(43);
		list.add(51);
		list.add(12);
		int sum = 0;
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			sum= sum + iter.next();
		}
		System.out.println(sum);

		Collections.sort(list);

		System.out.println(list);

		List<Student> students = new ArrayList<>();
		students.add(new Student ("Aviup",3));
		students.add(new Student ("Siddharth",4));
		students.add(new Student ("Devvrat",1));
		students.add(new Student ("Ayush",2));

		Iterator<Student> sdIt = students.iterator();
		while(sdIt.hasNext()) {
			Student st = sdIt.next();
			System.out.println(st.getName());		

		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare (Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		System.out.println("Compare by name");
		System.out.println(students);
		
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare (Student s1, Student s2) {
				return s1.getRoll() - s2.getRoll();
			}
		});
		
		System.out.println("Compare by roll");
		System.out.println(students);
		
		
			/*
			 * StudentNameSorter sort = new StudentNameSorter(); sort.comparebyname(s1, s2);
			 * sort.comparebyroll(s1, s2);
			 */
		 
		
		Iterator<Student> s = students.iterator();
		while(s.hasNext()) {
			Student s1 = s.next();
			if (s1.getName().charAt(0) == 'A' || s1.getName().charAt(0) == 'a') {
				System.out.println(st.getName());	
			}
		}
	}
		
		System.out.println(getRollNumber (students, "Aviup"));
	}
		
		
	public static int getRollNumber (List<Student> list , String studentName)
	{
		for (Student s:list)//for student s in the list
		{
			if(s.getName().equalsIgnoreCase(studentName))
			{
				return s.getRoll();
			}
		
		
	}
		return 0;
	}
}
	

