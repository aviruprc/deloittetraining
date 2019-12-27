package sapes;

public class ShapeTest {

	public static void main(String[] args) {
		
		ShapesDrawer sd = new ShapesDrawer();
		
		Shapes rec = new Rectangle (20,30);
		System.out.println(rec.toString());
		rec.computeArea();
		rec.computePerimeter();
		draw (sd,rec); 

		System.out.println();

		Shapes sq = new Square (20);
		System.out.println(sq.toString());
		sq.computeArea();
		sq.computePerimeter();
		draw (sd,sq); 
		
		Drawable d = new Drawable () {
			@Override
			public void draw (Shapes s) {
				if (s instanceof Rectangle)
					System.out.println("Drawing rectangle using my drawable");
				if (s instanceof Square)
					System.out.println("Drawing square shape using my drawable");
			}
		};
	}

	public static void draw (Drawable d, Shapes s) { //what
		d.draw(s); //what
	}
}
