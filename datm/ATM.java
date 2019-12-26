package datm;

public class ATM {
	private double totalAmount;
	private double withdrawLimit;
	private Account act;
	
	public ATM() {
		totalAmount = 150000;
		withdrawLimit= 4000;
	}
	
	public boolean validatePin (int pin) {
		return act.getAcctPin()==pin;
	}
	
	public double withdraw(double amt, int pin) {
		if(validatePin(pin)) {
			if(amt<=withdrawLimit && act.accBalance>=amt)  {
				totalAmount = totalAmount - amt;
				act.accBalance = act.accBalance - amt;
				return amt;
			}
		}
		return 0.0;
	}
	
	public double deposit(double amt, int pin) {
		if(validatePin(pin)) {
			totalAmount += amt;
			act.accBalance += amt;
		}
	return amt;
	}
	
	public Account getAct() {
		return act;
	}

	public void setAct(Account act) {
		this.act = act;
	}

				
	@Override
	public String toString() {
		return "ATM [totalAmount=" + totalAmount + "]";
	}
	
	public static void main (String[] args) {
		ATM atm = new ATM();
		Account act = new Account("Avirup",9245,130000);
		atm.setAct(act);
		atm.withdraw(3000,9245);
		atm.deposit(1000,9245);
		System.out.println(atm);
		System.out.println(atm.getAct());
	}
}

