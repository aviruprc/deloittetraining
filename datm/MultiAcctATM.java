package datm;

public class MultiAcctATM {
	
	private double totalAmount;
	private double withdrawLimit;
	private Account[] act;
	int counter=0;
	int limit=3;
	

	public MultiAcctATM(double totalAmount, double withdrawLimit, Account[] act) {
		super();
		this.totalAmount = totalAmount;
		this.withdrawLimit = withdrawLimit;
		act = new Account [limit];
	}

	public void addAccount(Account acct) {
		if(counter<limit) {
			act[counter++] = acct;
		}
	}

	public boolean validate (int pin)
	for (Account act: act)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
