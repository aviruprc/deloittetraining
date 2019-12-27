package sapes;

public abstract class Shapes {
	protected double length;
	protected double width;
	private double height;

	public Shapes (double length) {
		this.length = length;
	}

	public Shapes (double length, double width)
	{
		this.length=length;
		this.width= width;
	}

	public void Shape(double length, double width, double height) {
		this.length=length;
		this.width= width;
		this.height=height;
	}

	public abstract void computeArea();
	public abstract void computePerimeter();

	@Override
	public abstract String toString();



}
