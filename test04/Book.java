package test04;

public class Book {
	Author a;
	Publisher p;
	int isbn;
	String title;
	int pages;
	int pub_year;
	String type;
	public Book(Author a, Publisher p, int isbn, String title, int pages, int pub_year, String type) {
		super();
		this.a = a;
		this.p = p;
		this.isbn = isbn;
		this.title = title;
		this.pages = pages;
		this.pub_year = pub_year;
		this.type = type;
	}
	public Author getA() {
		return a;
	}
	public void setA(Author a) {
		this.a = a;
	}
	public Publisher getP() {
		return p;
	}
	public void setP(Publisher p) {
		this.p = p;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getPub_year() {
		return pub_year;
	}
	public void setPub_year(int pub_year) {
		this.pub_year = pub_year;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Book [a=" + a + ", p=" + p + ", isbn=" + isbn + ", title=" + title + ", pages=" + pages + ", pub_year="
				+ pub_year + ", type=" + type + "]";
	}

	
	
	
}
