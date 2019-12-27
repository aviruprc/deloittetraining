package dSchool;


public class Course {
	public String course;
	public int c_id;
	
	public void Course (String a, int b) {
		course=a;
		c_id=b;
	}
	
	public static void main(String[] args) {
	
	Course sci = new Course ("Science",1);
	Course com = new Course ("Commerce",2);

}
}