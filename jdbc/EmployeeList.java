package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeList {
	static Connection con =null;
	static List emps= new ArrayList<>();
	public EmployeeList() {
		
	}
	
//	public void listEmplopyeeByDept(String deptName) {
//		DBConnector connector = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
//		con = connector.getConnection();
//		String Sql ="select * from employees where department_id=(select department_id from departments where department_name='"+deptName+"')";
//		try {
//			PreparedStatement pst = con.prepareStatement(Sql);
//			ResultSet rs = pst.executeQuery(Sql);
//			while(rs.next()) {
//				System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
//	public void listEmployeesByDept(int dept) {
//		DBConnector connector = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
//		con = connector.getConnection();
//		//String Sql ="select * from employees where department_id= "+dept;
//		String Sql ="select * from employees where department_id=?";// "?" is a place holder 
//		try {
//			PreparedStatement pst = con.prepareStatement(Sql);
//			pst.setInt(1, dept);
//			ResultSet rs = pst.executeQuery();// put sql in the bracket when not using "?"
//			while(rs.next()) {
//				System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
	
	public static void listEmployeeBeforeDate(String date) {
		
		DBConnector connector = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
		con = connector.getConnection();
		String sql = "select employee_id, first_name,last_name,department_id,salary,to_char(hire_date,'DD-MON-YYYY') from employees where hire_date <?";
		try {
			
			PreparedStatement pst =con.prepareStatement(sql);
			pst.setString(1,date);
			ResultSet rs =pst.executeQuery();
			while(rs.next()){
				int id =rs.getInt(1);
				String fname=rs.getString(2);
				String lname=rs.getString(3);
				int depId=rs.getInt(4);
				double sal=rs.getDouble(5);
				String jdate=rs.getString(6);
				SimpleDateFormat sdf = new SimpleDateFormat("DD-MMM-YYYY");
				Date joinDate = null;
				
			    try {
					joinDate = sdf.parse(jdate);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Employee e = new Employee(id,fname+" "+lname,depId,joinDate,sal);
				emps.add(e);
			}
			
		}catch(SQLException e) {
			System.out.println(e);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new EmployeeList().listEmplopyeeByDept("Executive");
		//new EmployeeList().listEmployeesByDept(90);
		listEmployeeBeforeDate("01-JAN-2010");
		Iterator<Employee> emp = emps.iterator();
		while(emp.hasNext()) {
			Employee e =emp.next();
			System.out.println(e.toString());
			
		}
		System.out.println(emps.size());
		
		

	}

}
