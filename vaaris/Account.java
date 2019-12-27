package vaaris;

public abstract class Account implements Printer {
	private String name;
	private int number;
	protected double balance;

	public Account(String name, int number, double balance) {
		super();
		this.name = name;
		this.number = number;
		this.balance = balance;
		System.out.println("Account Constructor was called.");
	}
	
	public static void printAccount (Account ac, Printer p) {
		ac.print("From Accounts");
		p.print("From printer class");
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", number=" + number + ", balance=" + balance + "]";
	}

	public void print (String s)
	{
		System.out.println("Will print Account Information" +"" + s);
	}


	public static void main(String[] args) {

	}


	public abstract void withdraw(double amount);

}
