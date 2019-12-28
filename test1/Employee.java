package test1;

public class Employee {

	protected String name;
	protected int id;
	protected String role;
	protected String department;
	protected double salary;
	private boolean incSal=false;
	protected String manager;
	
	public Employee (String name, int id, Roles roll, Department d,  double salary, String manager)
	{
		this.name=name;
		this.id=id;
		this.role=roll.getRoll_name();
		this.department= d.getd_name();
		this.salary=salary;
		this.manager=manager;
	}
	
	public Employee(String name, int id, String role, String department) {
		super();
		this.name = name;
		this.id = id;
		this.role = role;
		this.department = department;
	}

	public String getName() 
	
	{
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", role=" + role + ", department=" + department + ", salary="
				+ salary + "]";
	}

	public double getSalary() {
		return salary;
	}

	
	public boolean isIncSal() {
		return incSal;
	}

	public void setIncSal(boolean incSal) {
		this.incSal = incSal;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main (String [] args)
	{

	}

}
