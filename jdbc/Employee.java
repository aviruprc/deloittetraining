package jdbc;

import java.util.Date;
public class Employee {

	int id;
	String fullName;
	int deptID;
	Date joinDate;
	double salary;
	
	public Employee(int id, String fullName, int deptID, Date joinDate, double salary) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.deptID = deptID;
		this.joinDate = joinDate;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullName=" + fullName + ", deptID=" + deptID + ", joinDate=" + joinDate
				+ ", salary=" + salary + "]";
	}
	
}
