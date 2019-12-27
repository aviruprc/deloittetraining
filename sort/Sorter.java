package sort;

import java.util.Arrays;
import java.util.Comparator;

import sharmaji.Employee;

public class Sorter {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String [] arr = new String[5];


		arr[0] = "Avirup";
		arr[1] = "Devvrat";
		arr[2] = "Siddharth";
		arr[3] = "Anand";
		arr[4] = "Nishant";

		Employee e1= new Employee ("Surabhi", 456,50000);
		Employee e2 = new Employee ("yaggi",123,30000);
		Employee e3 = new Employee ("ayush",123,90000);

		Employee emps[] = new Employee [3];
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e2;

		//		Arrays.sort(emps, new Comparator<Employee>() 
		//				{
		//			public int compare (Employee e1, Employee e2) {
		//				return e2.getName().compareToIgnoreCase(e1.getName());
		//			}
		//				});



		//		for(int i=0;i<emps.length;i++)
		//		{
		//			System.out.println(emps[i]);
		//		}

		//		Arrays.sort(emps, new Comparator<Employee>() 
		//		{
		//			public int compare (Employee e1, Employee e2) {
		//				return e1.getId() - e2.getId(); //ascending
		//			}
		//		});

		//		for(int i=0;i<emps.length;i++)
		//		{
		//			System.out.println(emps[i]);
		//		}
		//		
		Arrays.sort(emps, new Comparator<Employee>() 
		{
			public int compare (Employee e1, Employee e2) {
				return (int) (e1.getSalary() - e2.getSalary()); //ascending
			}
		});

		for(int i=0;i<emps.length;i++)
		{
			System.out.println(emps[i]);
		}

		Arrays.parallelSort(arr);

		for(int i = 0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
