package sapes;

public class Rectangle extends Shapes {

	public Rectangle(double len, double wid) {
		super(len,wid);
	}
	@Override
	public void computeArea() {
		System.out.println("Area=" + length * width);
	}

	@Override
	public void computePerimeter() {
		System.out.println("Perimeter=" + 2*(length+width));
	}

	@Override
	public String toString() {
		return "Rectangle []";
	}

	public static void main(String[] args) {

	}

}
