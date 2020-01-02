package newjdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnector {

	private String url;
	private String user;
	private String pass;
	
	public DBConnector(String url, String user, String pass) {
		super();
		this.url = url;
		this.user = user;
		this.pass = pass;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "DBConnector [url=" + url + ", user=" + user + ", pass=" + pass + "]";
	}

	public DBConnector () {
		
	}
	
	public Connection getConnection() {
		Connection con= null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connect Success");
		} catch (SQLException e) {
			System.out.println("Connection failed." +e);
		}
		return con;
	}

	public static void main (String [] args)
	{
	DBConnector dbcon = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl" , "hr", "hr");
	Connection con = dbcon.getConnection();
	System.out.println(con);
}

}