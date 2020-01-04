package test04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("unused")
public class NewFileReader {
	
	static ArrayList<Book> bk = new ArrayList<>();
	static ArrayList<Author> au = new ArrayList<>();
	static ArrayList<Publisher> pu = new ArrayList<>();
	

	static Map<String,String> map = new HashMap <>();
	Connection con=null;
	public NewFileReader () { }

	public void getData () {
		DBConnector connector = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		String sql = "select a.ISBN , a.title, a.pages, a.pub_year, a.type, b.name, b.country, c.name, c.city from book a join author b on a.author_id=b.author_id  join publisher c on a.publisher_id=c.publisher_id";
		int count =0;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql);
			while(rs.next()) {
				count++;
				Publisher p = new Publisher (rs.getString(6),rs.getString(7));
				Author a = new Author (rs.getString(8),rs.getString(9));
				Book b = new Book (a,p,rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5));
				bk.add(b);
				au.add(a);
				pu.add(p);
				//System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getInt(4)+":"+rs.getString(5)+":"+rs.getString(6)+":"+rs.getString(7)+":"+rs.getString(8)+":"+rs.getString(9));
			}
		}catch (SQLException e)
		{
			System.out.println(e);
		}
		System.out.println("There are " +count+" members.");
	}

	
	  public void q1 () { for (Book b: bk) {
	  System.out.println(b.getIsbn()+""+b.getTitle()+""+b.getPages()+""+b.getA().getName()+""+b.getP().getName()); } }
	 
	
	public void q2 () {
		DBConnector connector = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		String sql = "select a.ISBN , a.title, a.pages, a.pub_year, a.type, b.name, b.country, c.name, c.city from book a join author b on a.author_id=b.author_id  join publisher c on a.publisher_id=c.publisher_id order by b.name,a.title ";
		int count =0;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql);
			while(rs.next()) {
				count++;
				
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getInt(4)+":"+rs.getString(5)+":"+rs.getString(6)+":"+rs.getString(7)+":"+rs.getString(8)+":"+rs.getString(9));
			}
		}catch (SQLException e)
		{
			System.out.println(e);
		}
		System.out.println("There are " +count+" members.");
	}
	
	public void q3 () {
		for(Book b:bk)
		{
			if(b.getPub_year()>2012)
			{
				System.out.println(b);
			}
		}
	}
	
	public void q4 (String city)
	{for (Book b:bk)
	{
		if (b.getType().equals("Poem") && b.getP().getCity().equalsIgnoreCase(city))
		{
			System.out.println(b);
		}
	}
	}
	
	
	public void q5 (String name)
	{
		for (Book b: bk)
		{
			if(b.getA().getName().equalsIgnoreCase(name))
			{
				System.out.println(b.getTitle());
			}
		}
	}
	public static void main (String [] args)
	{
		NewFileReader list = new NewFileReader();
		list.getData();
		list.q1();
		list.q2();
		list.q3();
		list.q4("California");
		list.q5("Coldplay");
		}
	}

