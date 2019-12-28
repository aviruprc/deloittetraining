package test1;

public class Roles {

	String roll_name;

	
	public Roles(String roll_name) {
		super();
		this.roll_name = roll_name;
	}

	public String getRoll_name() {
		return roll_name;
	}

	public void setRoll_name(String roll_name) {
		this.roll_name = roll_name;
	}

	@Override
	public String toString() {
		return "Roles [roll_name=" + roll_name + "]";
	}
	
	
	
}
