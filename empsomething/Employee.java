package empsomething;

public class Employee extends Person {

	protected static int id;
	protected Department dept;

	public Employee( String name, int id,  Department dept) {
		super(name);
		Employee.id = id;
		this.dept = dept;
	}

	public Employee(String name, Address addr, int id, Department dept) {
		super(name,addr);
		Employee.id=id;
		this.dept=dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		Employee.id = id;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", dept=" + dept + ", getId()=" + getId() + ", getDept()=" + getDept()
		+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
		+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
