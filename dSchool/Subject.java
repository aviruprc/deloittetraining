package dSchool;

public class Subject {

	private String sub_n;
	private int sub_code;
	public int c_id;
	
	public Subject (String a, int b, int c)
	{
		this.sub_n=a;
		this.sub_code=b;
		this.c_id=c;
	}
	
	@Override
	public String toString() {
		return "sub_name=" + sub_n + ", sub_code=" + sub_code + ", course_id=" + c_id;
	}

	public static void main(String[] args) {
		Subject phy = new Subject("Physics",11,1);
		Subject chem = new Subject ("Chemistry",22,1);
		Subject mat = new Subject ("Maths",33,1);
		Subject eng = new Subject ("English",44,2);
		Subject eco= new Subject ("Economics",55,2);
		System.out.println(phy.toString());
		System.out.println(chem.toString());
		System.out.println(mat.toString());
		System.out.println(eng.toString());
		System.out.println(eco.toString());
	}

}
