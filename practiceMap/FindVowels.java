package practiceMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class FindVowels {

	static List<String> list = new ArrayList<>(); //creates array list
	static Map<String, Integer> map = new HashMap<>();
	
	public static void addWord() //taking user input for word and adding to list
	{  
		System.out.println("Enter word to check");
		System.out.println("type 0 to quit");


		Scanner sc = new Scanner(System.in);
		String word;
		while (true) { int i=0;
			word = sc.nextLine();
			if (word.equals("0")) {
				break;
			} else
			{
				list.add(word);
			}
		}       
		sc.close();

	}
		
	public static void showMap ()
	{
		Set<String> set = map.keySet();
		Iterator<String> mi = set.iterator();
		while (mi.hasNext())
		{
			String s = mi.next();
			int value = map.get(s);
			System.out.println("Word:" + s + "Vowels:" + value);
		}
	}
	
	protected static void createMap() {
		
		Iterator<String> li = list.iterator();
		while(li.hasNext())
		{
			String s = li.next();
			int value = countVowels(s);
			map.put(s,value);
		}
	}
	
	public static int countVowels(String word) //counting number of vowels

	{
		
		int count = 0;
		for (int j=0; j<word.length();j++)
		{
			if (word.charAt(j)== 'a' ||word.charAt(j)== 'e' ||word.charAt(j)== 'i'
					||word.charAt(j)== 'o'||word.charAt(j)== 'u' )
			{
				count++;
			}
		}
		return count;
	}

		

		public static void main (String [] args)
		{
			addWord();
			createMap();
			showMap();
		}

	}
