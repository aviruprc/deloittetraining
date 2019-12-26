package datm;

public class Account {

	String accHolder;
	int acctPin;
	double accBalance;
	public static final double minBalance= 10000;
	
	public Account(String accHolder, int acctPin, double accBalance) {
		super();
		this.accHolder = accHolder;
		this.acctPin = acctPin;
		this.accBalance = accBalance;
	}
	
	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public int getAcctPin() {
		return acctPin;
	}

	public void setAcctPin(int acctPin) {
		this.acctPin = acctPin;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	
	@Override
	public String toString() {
		return "Account [accHolder=" + accHolder + ", acctPin=" + acctPin + ", accBalance=" + accBalance + "]";
	}

	public static void main(String[] args) {
		
		Account avi = new Account("Avirup", 9245, 130000);
		Account dev = new Account ("Devvrat", 8500, 120000);
		System.out.println(avi.toString());

	}

}
