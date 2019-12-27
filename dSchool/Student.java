package dSchool;

public class Student {
	public String name;
	public int rollNumber;
	public String course;
	public int c_id;
	private Student[] stds;
	int counter=0;
	int limit=3;
	
	public void Course (String a, int b) {
		course=a;
		c_id=b;
	}
	
	public Student (String a, int b)
	{
		name=a;
		rollNumber=b;
	}
	
	public void addStudent(Student st)
	{
		if (counter<limit) {
			stds[counter++]=st;
		}
		else {
			System.out.println("Course is filled");
		}
	}
	
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", course=" + course + ", c_id=" + c_id + "]";
	}

	public static void main(String[] args) {
		
		Student avi = new Student("Avirup",1);
		Student dev = new Student ("Devvrat", 2);
		Student sur = new Student ("Surabhi",3);
		Student ayush = new Student ("Ayush",4);
		Student sid = new Student ("Sid",5);
		Student yagi = new Student ("Yagnesh",6);
		Student ayu = new Student ("Ayushi",7);
		System.out.println(avi.toString());
		System.out.println(dev.toString());
		System.out.println(sur.toString());
		System.out.println(ayush.toString());
		System.out.println(sid.toString());
		System.out.println(yagi.toString());
		System.out.println(ayu.toString());
		Course sci = new Course ("Science",1);
		Course com = new Course ("Commerce",2);
		System.out.println(sci.toString());
		System.out.println(com.toString());
		avi.addStudent(sci);

	}

}
