package sapes;

public class ShapesDrawer implements Drawable {
	@Override
	public void draw(Shapes s) {
		if(s instanceof Rectangle) {
			System.out.println("Drawing a Rectangle");
		}
		else if (s instanceof Square) {
			System.out.println("Drawing a Square");
		}
	}
}
