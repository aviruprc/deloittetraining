package vaaris;

public class ConsolePrinter implements Printer {

	@Override
	public void print(String s) {
		System.out.println("Printing to console");
	}
}
