package sapes;

public class Square extends Shapes {

	public Square(double length) {
		super(length);
	}

	@Override
	public void computeArea() {
		System.out.println("Area:" + length*4);
	}

	@Override
	public void computePerimeter() {
		System.out.println("Area:"+ length*length );
	}

	@Override
	public String toString() {
		return "Square []";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
