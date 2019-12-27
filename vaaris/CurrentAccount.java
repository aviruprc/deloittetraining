package vaaris;

public class CurrentAccount extends Account {

	public CurrentAccount(String name, int number, double balance) {
		super(name, number, balance);
		System.out.println("CurrentAccount Constructor was called.");
	}

	@Override
	public void withdraw (double amount)
	{
		 {
				if (amount<= balance)
				{
					balance = balance - amount;
				}
			}
	}
	
	public static void main(String[] args) {

	}

}
