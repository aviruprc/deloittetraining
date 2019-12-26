package rev;

public class StringReverse {

	public static void main(String[] args) {
		 String line ="Hi! my name is Avirup";
		 int vowels =0;
		 line = line.toLowerCase();
		 for(int i=0;i<line.length(); ++i)
		 {
			 char ch=line.charAt(i);
			 if (ch =='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u')
			 {
				 vowels++;
			 }
		 }
		 System.out.println("Vowels=" +vowels);
		 
		 String reverse="";
		 int length = line.length();
		 for(int i=length-1; i>=0; i--)
		 {
			 reverse=reverse+line.charAt(i);
		 }
		 
		 System.out.println("Reverse of the string=" +reverse);
				
	}

}
