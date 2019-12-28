package test1;

public class Test {

	static Employee[] emps = new Employee[8]; 
	static Department [] depts = new Department [10];
	static Roles [] roll = new Roles [3];
	
	public static void listAllEmployee()
	{
		System.out.println("All the employees are:"); 
		for (Employee e: emps)
		{ 
			{
				System.out.println(e.getName());
			}
		} 
		System.out.println("End of list."); 
	}
	 
	
	
	public static void getEmpByDept (Department d) 
	{ 
		System.out.println();
		System.out.println("Employees of Department " + d.getd_name() + " are:");
		for(Employee e : emps) 
		{ 
			if (d.getd_name().equals(e.getDepartment())) System.out.println(e.getName()); 
		}
		System.out.println("End of list."); 
	}
	 
	
	public static void getEmpByRole (String s)
	{
		System.out.println();
		System.out.println("Employees of Role are:");
		for(Employee e : emps)
		{
			if(s.equalsIgnoreCase(e.getRole()))
			System.out.println(e.getName());
		}
		System.out.println("End of list."); 
	}
	
	
	  public static void getEmpByManager(String s) { 
		  System.out.println();
	  System.out.println("Employees of Manager are:"); for(Employee e : emps) {
	  if(s.equalsIgnoreCase(e.getRole())) System.out.println(e.getName()); }
	  System.out.println("End of list."); }
	 
	
	public static void incSalary (Employee r1, String r2, double k)
	{
		System.out.println();
		
			if(r1.getRole().equalsIgnoreCase("manager"))
			{
				for(Employee e : emps) {
					if(e.getRole().equals(r2))
					{
						double original = e.getSalary();
						e.salary= original*k;
						e.setIncSal(true);
						System.out.println("Salary incremented for" + e.getName());
					}
				}
			}
			else
			{
				System.out.println("Not a manager");
			}
		}
	
		
	public static void main(String[] args) {

		Department d1 = new Department ("Cloud","HYD");
		Department d2 = new Department ("JAVA", "PNQ");
		Department d3 = new Department ("C", "BOM");
		Department d4 = new Department ("Informatica", "DEL");

		Roles r1 = new Roles ("Manager");
		Roles r2 = new Roles ("Developer");
		Roles r3 = new Roles ("Tester");
		
		Employee e1 = new Employee ("Avirup", 1, r2, d1,10000,"Anand");
		Employee e2 = new Employee ("Devvrat", 2, r3, d1,20000,"Anand");
		Employee e3 = new Employee ("Siddharth", 3, r2, d1,30000,"Anand");
		Employee e4 = new Employee ("Anushka", 4, r1, d2,40000,null);
		Employee e5 = new Employee ("Ayush", 1, r3, d2,50000,"Rathinam" );
		Employee e6 = new Employee ("Dolly", 1, r3, d3,60000, "Raju");
		Employee e7 = new Employee ("Pragyat", 1, r1, d4,70000,"Raju");
		Employee e8 = new Employee ("Niharika", 1, r2, d4,80000,"What");
		
		emps[0] = e1;
		emps[1] = e2;
		emps[2] = e3;
		emps[3] = e4;
		emps[4] = e5;
		emps[5] = e6;
		emps[6] = e7;
		emps[7] = e8;

		depts[0] = d1;
		depts[1] = d2;
		depts[2] = d3;
		depts[3] = d4;
		
		roll[0]= r1;
		roll[1]= r2;
		roll[2]= r3;

		listAllEmployee();
		getEmpByDept(d1);
		getEmpByRole("tester");
		incSalary(e4, "tester", 0.2);
	}

}
