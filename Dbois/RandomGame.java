package Dbois;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {
		Random rando = new Random();
		int number = rando.nextInt(100);
		//System.out.println(number);
		//just to check 
		guess(number);
		
	}
	
	
public static void guess (int a)
{
	System.out.println("Let's Play");
	 for (int i=0; i<5;i++)
		{
		 System.out.println();
		 Scanner in = new Scanner(System.in);
		 int guess1 = in.nextInt();
		 
	if (guess1==a)
	{
		System.out.println("Taliyan Bajti Rehni Chahiye");
		break;
	} if (i==4)
		break;
	else
	{
		System.out.println("Try Again");
	}
		}
	System.out.println("Game Over");
}
}




