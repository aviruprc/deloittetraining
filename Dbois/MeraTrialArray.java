package Dbois;

public class MeraTrialArray {

	public static void main(String[] args) {
		String[] names = new String [5];
		names[0] = "Encorer";
		names[1] = "Ripper";
		names[2] = "Faker";
		names[3] = "Killuminati";
		names[4] = "Anwalt";
		
		
		for (int i=0; i<names.length ; i++)
		{
			System.out.println("Original" + names[i]+ ":");
		}
		Strlambai(names);
	}
	
	
	
	public static void Strlambai(String[] a)
	{
		
		a[0] = "BOT";
		a[1] = "Gandhi";
		a[2] = "Hell's Angel";
		a[3] = "Assasin";
		a[4] = "Killer";
		for (int i=0; i<a.length ; i++)
		{
			System.out.println("Func" + a[i]+ ":");
		}
	}

}
