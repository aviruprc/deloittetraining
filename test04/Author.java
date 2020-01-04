package test04;

public class Author {
	
	String name;
	String nationality;
	
	public Author(String name, String nationality) {
		super();
		this.name = name;
		this.nationality = nationality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", nationality=" + nationality + "]";
	}
	
	
	 

}
