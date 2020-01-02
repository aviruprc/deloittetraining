package newjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


@SuppressWarnings("unused")
public class MyDB {
	static ArrayList<String> list = new ArrayList<>();
	Connection con=null;
	public MyDB () { }

	public void listEmployees () {
		DBConnector connector = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		String sql = "select u.id, u.name, u.username, u.password, u.email, r.name from user_test u join role_test r on (u.role_id = r.id)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql);
			while(rs.next()) {
				String pass = "*";
				String oldpass = rs.getString(4);
				for(int i=1; i<oldpass.length();i++)
				{
					pass = pass+"*";
				}
				
				  list.add(0,rs.getString(1)); list.add(1,rs.getString(2));
				  list.add(2,rs.getString(3)); list.add(3,pass); list.add(4,rs.getString(5));
				  list.add(5,rs.getString(6));
				 
				//System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+pass+":"+rs.getString(5)+":"+rs.getString(6));
			}
		}catch (SQLException e)
		{
			System.out.println(e);
		}
	}

	public static void main (String[] args)
	{
		MyDB list1= new MyDB();
		list1.listEmployees();
		int count=0;
		Iterator<String> itr =list.iterator();
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(2));
			
		}
		

		
		
		
	}
}
