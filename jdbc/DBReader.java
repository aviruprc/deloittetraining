package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBReader 

{
	public static void main (String args[])
	{
		Connection con = null;
		try{//load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e)
		{
			System.out.println("Driver not found"+e.getMessage());
		}
		
		String url = "jdbc:oracle:thin:@localhost:1524:orcl";
		String username = "hr";
		String password = "hr";

		try {
			Connection con = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			System.out.println("Connection failed" +e.getMessage());
		}
	}
}