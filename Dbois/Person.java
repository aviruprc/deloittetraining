package Dbois;

public class Person {
	private static int count=0;
	private String name;
	private long mNumber;
	//default or no arg constructor (to create instances urf objects of this class)
	public Person() {
		count++;
	}
	
	//overloaded constructor
	
	public Person (String name, long number) {
		this();
		this.name = name;
		mNumber = number;
		
	}
	
	//Another constructor with one arg
	public Person (long number)
	{   this(null, number);
		mNumber=number;
	}
	//setter or mutator
	public void setName (String name) {
		this.name = name;
		
	}
	//getter or accessor
	public String getName () {
		return name;
	}
	
	public void setMobileNumber (long num) {
		mNumber = num;
	}
	
	public long getNumber () {
		return mNumber;
		
	}
	@Override
	public String  toString()
	{
		return name + ":" + mNumber;
	}
	
	public static void main(String[] args)
	{
		Person neha = new Person();
		neha.setName("fName_lName");
		neha.setMobileNumber(8853755293L);
		System.out.println(neha.getName());
		System.out.println(neha.getNumber());
		
		System.out.println();
		Person avi = new Person();
		avi.setName("Avirup");
		avi.setMobileNumber(9610757206L);
		System.out.println(avi.getName());
		System.out.println(avi.getNumber());
		System.out.println();
		
		System.out.println();
		System.out.println(avi.toString());
		
		Person ramesh = new Person ("Gargi", 7791905635L);
		System.out.println(ramesh.toString());
		
		Person dev = new Person (751075012L);
		System.out.println(dev.toString());
		System.out.println();
		System.out.println(count);
		
		
	}

}
