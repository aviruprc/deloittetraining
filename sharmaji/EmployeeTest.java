package sharmaji;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee ("Akhil B",123);
		Employee e2 = new Employee ("Akhil B", 456);
		
		System.out.println(e1.equals(e2));
	}

}
