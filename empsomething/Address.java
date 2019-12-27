package empsomething;

public class Address {

	protected String hno;
	protected String street;
	protected String city;
	protected String state;

	public Address(String hno, String street, String city, String state) {
		super();
		this.hno = hno;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}

	public static void main(String[] args) {

	}

}
