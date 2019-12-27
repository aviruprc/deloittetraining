package empsomething;

public class Organisation {

	static Employee [] emps = new Employee[5];
	static Department [] depts = new Department [3]; 
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Department d1 = new Department ("Hyd", "HR");
		Department d2 = new Department ("Ban", "Dev");
		Department d3 = new Department ("PNQ", "Test");

		depts[0]= d1;
		depts[1]= d2;
		depts[2]= d3;

		Address a1 = new Address ("1", "wtf", "hyd", "ts");
		Address a2 = new Address ("2", "idk", "ban", "ka");
		Address a3 = new Address ("3", "idc", "kol", "wb");
		Address a4 = new Address ("4", "hbu", "mum", "mh");
		Address a5 = new Address ("5", "hmu", "jpr", "raj");

		Employee e1 = new Employee ("Mudi", a1, 1, d1);
		Employee e2 = new Employee ("Shah", a2, 2, d2);
		Employee e3 = new Employee ("Singh", a3, 3, d2);
		Employee e4 = new Employee ("Swaraj", a4, 4, null);
		Employee e5 = new Employee ("Jaitley", a5, 5, d2);

		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e3;	
		emps[3]=e4;
		emps[4]=e5;
		
	//	printEmployees ("Dev");
		//getDepartment ("null");
		noDepartment();
	}

	/*public static void printEmployees(String dept) {
		Department dep = null;
		for (Department d: depts) {
			if(d.getName().equalsIgnoreCase(dept)) {
				dep =d;
				break;
			}
		}

		for (Employee e: emps) {
			Department d =e.getDept();
			if(d!=null) {
				String deptName = e.getDept().getName();
				if(deptName.equalsIgnoreCase(depts)) {
					System.out.println(e);
				}
			}
		}
	}

	public static void getDepartment (String name) {
		for (Employee e: emps) {
			if(e.getName().equalsIgnoreCase(name)) {
				return e.getName().getDept();
			}
		}
		return null;
	}*/


public static void noDepartment ()
{
	for (Employee e :emps)
		System.out.println(e.getDept()==null?e.getName():"");
}
}