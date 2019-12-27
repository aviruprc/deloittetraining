package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class MyCollections {

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
	}
}
