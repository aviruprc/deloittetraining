package empsomething;

public class Person {

	protected String name;
	protected static Address addr;


	public Person(String name) {
		super();
		this.name = name;
	}

	public Person(String name, Address addr) {
		super();
		this.name = name;
		Person.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return getAddress();
	}

	public void setAddress(Address address) {
		Person.addr = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + getAddress() + "]";
	}

	public static void main(String[] args) {

	}

}
