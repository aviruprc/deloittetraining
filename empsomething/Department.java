package empsomething;

public class Department {

	protected String name;
	protected String location; //city

	public Department(String location, String name) {
		super();
		this.location = location;
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [location=" + location + "]";
	}

	public static void main(String[] args) {

	}

}
