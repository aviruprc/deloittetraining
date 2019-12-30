package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ListEmployees {

	static Map<String,String> map = new HashMap <>();
	Connection con=null;
	public ListEmployees () { }

	public void listEmployeesBeforeDate (String date) {
		DBConnector connector = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		String sql = "SELECT FIRST_NAME, LAST_NAME FROM EMPLOYEES where HIRE_DATE <'" +date+"'";
		int count =0;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql);
			while(rs.next()) {
				count++;
				map.put(rs.getString(1), rs.getString(2));
				//System.out.println(rs.getString(1)+":"+rs.getString(2));
			}
		}catch (SQLException e)
		{
			System.out.println(e);
		}
		System.out.println("There are " +count+" members.");
	}

	public static void main (String [] args)
	{
		ListEmployees list = new ListEmployees();
		list.listEmployeesBeforeDate("01-JAN-10");
		System.out.println("Printing map now");
		Set<String> set = map.keySet(); 
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(key+":" +value);
		}
	}
}
