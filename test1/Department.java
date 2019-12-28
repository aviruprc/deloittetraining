package test1;

public class Department {

	protected String d_name;
	protected String location;

	public Department(String d_name, String location) {
		super();
		this.d_name = d_name;
		this.location = location;
	}
	
	public String getd_name() {
		return d_name;
	}

	public void setd_name(String d_name) {
		this.d_name = d_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [d_name=" + d_name + ", location=" + location + "]";
	}

	public static void main(String[] args) {

	}

}
