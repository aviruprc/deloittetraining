package Dbois;

import java.util.Arrays;
import java.util.Random;

public class Sorttttt {

	public static void main(String[] args) {
		
		int[] lol = new int[5];
		lol[0] = 41;
		lol[1] = 25;
		lol[2] = 232;
		lol[3] = 54;
		lol[4] = 32;
		
		sorta(lol);

	}
	
	public static void sorta (int[] a)
	{
		Arrays.sort(a);
		for (int i =0;i< a.length ;i++)
		{
			System.out.print(a[i] + " ");
		}
		
	}

}
