package Strings;

import java.util.Arrays;

public class StringsManip {

	public static void main(String[] args) {

		String str = new String();
		str = "This is a text.";
		String st = new String("this is a line of text");
		System.out.println(str==st);
		System.out.println(str.equals(st));
		str = st;
		System.out.println(str==st);
		System.out.println(str.equals(st));

		int len = str.length();
		int indexOfC = str.indexOf('t');
		System.out.println(indexOfC);
		locate ("text", str);

		String sub = new String(str.substring(18, 22));
		System.out.println(sub);

		StringBuffer buffer = new StringBuffer();
		buffer.append("<html>");
		buffer.append("<head><title> My Web Page </title></head>");
		buffer.append("<body>");
		buffer.append("So I can see you in a new light");
		buffer.append("</body></html>");

		System.out.println(buffer.toString());
		System.out.println(buffer.reverse());
		numAlphabet("the quick brown fox jumps right over the lazy dog");
	}


	public static void locate (String word, String line)
	{
		int len = word.length();
		int start = line.indexOf(word);
		int end = line.indexOf(word) + len  ;
		if (line.indexOf(word) != -1) {
			System.out.println("Found the word " + word +
					" at index number " + start + " and ends at " + end);
		} else {
			System.out.println("Can't find " + word);
		}

		System.out.println(pallindrome("ada"));     
	}

	public static boolean pallindrome(String text)
	{
		System.out.println("pallindrome");
		StringBuffer buf = new StringBuffer(text);
		buf = buf.reverse();
		return text.contentEquals(buf.toString());
	}
	
	public static int numAlphabet (String text) {
		String chars = "";
		for (char c : text.toCharArray()) {
			if(!chars.contains(c+"") && c != ' ') {
				chars += c;
			}
		}
		
		char [] ch = chars.toCharArray();
		Arrays.parallelSort(ch);
		System.out.println(new String(ch));
		System.out.println();
		return chars.length();
	}
}	


