package vaaris;

public class AccountTest {

	public static void showBalance (Account ac) {
		System.out.println(ac.getBalance());
	}

	public static void printAccount (Account ac, Printer p) {
		ac.print("From Accounts");
		p.print("From printer class");
	}

	public static void main(String[] args) {

		SavingsAccount sa = new SavingsAccount("Avirup",123,10000);
		System.out.println(sa);
		sa.withdraw(4000);
		System.out.println(sa);

		CurrentAccount ca = new CurrentAccount ("Avirup",456,20000);
		System.out.println(ca);
		ca.withdraw(30000);
		System.out.println(ca);

		Account ac = new SavingsAccount ("Amit", 789, 30000);
		System.out.println(ac);
		ac.withdraw(20001);
		System.out.println(ac);
		System.out.println("Savings Account");
		showBalance(ac); 
		System.out.println("Current Account");
		showBalance(ca);

		ac.print("" + "hello account");
		sa.print("" + "From Savings");

		printAccount(ac, new ConsolePrinter());
		printAccount (ac, new FilePrinter());

	}

}
