package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyDeque {
	
	public static void main (String [] args)
	{
		Deque<Integer> deque = new ArrayDeque<Integer> ();
		deque.add(10);
		deque.add(20);
		deque.add(30);
		deque.add(40);
		
		deque.addFirst(5);
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		deque.addLast(50);
		System.out.println(deque.getLast());
		if(deque.isEmpty())
		{
			System.out.println("Empty");
		}
		else
			System.out.println("False");
	
		deque.clear();
		if(deque.isEmpty())
		{
			System.out.println("Empty");
		}
		else
			System.out.println("False");
		
		deque.add(10);
		deque.add(20);
		deque.add(30);
		deque.add(40);
		
		for(Integer d: deque)
		{
			System.out.println(d);
		}
		
		System.out.println(deque.hashCode());
		
		System.out.println(deque.peekFirst());
		
		
		
	}
	
}
