package Dbois;

public class MeriClass {

	public static void main(String[] args) {
		
		String hello = "Hello, Java World";
		System.out.println("Hiiiiiiiiiiiiiii");
		System.out.println(hello);
		int
		len = hello.length();
		System.out.println(len);
		System.out.println("The number of letters in the string are="+len);
		System.out.println("Is this true?" +(len==10));
	
		if(len==7)
		{
			System.out.println("CORRECT!");
		}
		else
		{
			System.out.println("__|__");
		}
		
		int m=69, n=96;
		if (m<n)
		{
			System.out.println(n-m);
		}
		else
		{
			System.out.println(m-n);
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.print(i +" ");
		}
		System.out.println();
		char a ='A';
		for (int j=48; j<126;j++)
		{
			System.out.print((char)j +" ");
		}
		System.out.println();
		System.out.println((int)a);
		rangeSum(10,1);
		calculate(1,0,"/");
		
	}

	public static void swap(int m, int n)
	{
		int c;
		c=m;
		m=n;
		n=c;
		
	}
	public static void rangeSum(int m, int n)

	{
		int summ=0;
		if (m>n)
		{
			swap(m,n);
			
			for (int i=m; i<=n;i++ )
			{
				summ = summ+i;
			}
			System.out.println("The sum is=" +summ);
		}
		else 
		{
			for (int i=m; i<=n;i++ )
			{
				summ = summ+i;
			}
			System.out.println("The sum is=" +summ);
		}
		
	}
	public static void calculate (double a, double b, String op)
	{
		switch (op) 
		{
		case "+" :
			System.out.println(a+b);
			break;
		case "-" :
			System.out.println(a-b);
			break;
		case "*" :
			System.out.println(a*b);
			break;
		case "/" :
		{
			if(b!=0)
			{
				System.out.println(a/b);
			}
			else
			{
				System.out.println("Denominator cannot be Zero");
			}
			break;
		}
		default:
			System.out.println("Wrong Expression");
			break;
		}
	}
}
