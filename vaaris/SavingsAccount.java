package vaaris;

public class SavingsAccount extends Account {

	private static final double MINIMUM = 10000;
	
	public SavingsAccount(String name, int number, double balance) {
		super(name, number, balance);
		System.out.println("SavingAccount Constructor was called.");
	}
	
	@Override
	public void withdraw (double amount) {
		if (balance >=MINIMUM) {
			 {
					if (amount<= balance)
					{
						balance = balance - amount;
					}
				}
		} else
		{
			System.out.println("Insufficient Funds.");
		}
		
	} 
	
	@Override
	public void print (String s) {
		super.print(s);
	}

	public static void main(String[] args) {

	}

}
