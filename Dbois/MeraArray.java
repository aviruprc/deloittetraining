package Dbois;

public class MeraArray {

	public static void main(String[] args) {
		int [] num = {11,22,33,44,55,66,77,88,99};
		int len = num.length;
		System.out.println(len);
		System.out.println(num[num.length-2]);
		for(int i=0; i<num.length;i++)
		{
			System.out.print(num[i]*num[i] + " ");
		}
		System.out.println();
		System.out.println(num[3]);
		
		String[] names = new String [5];
		names[0] = "Encorer";
		names[1] = "Ripper";
		names[2] = "Faker";
		names[3] = "Killuminati";
		names[4] = "Anwalt";
		System.out.println(names[0]); //because there is nothing at zero	
		Strlambai(names);
	
	}
	public static void Strlambai(String[] a)
	{
		for (int i=0; i<a.length ; i++)
		{
			System.out.println(a[i]+ ":" + a[i].length() + " ");
		}
	}
}

