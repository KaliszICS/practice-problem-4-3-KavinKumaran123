public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}
}

// Rectangle Class
class Rectangle {
	private double length;
	private double width;

	// No-parameter constructor
	public Rectangle() {
		this.length = 4;
		this.width = 8;
	}

	// One-parameter constructor
	public Rectangle(double length) {
		this.length = length;
		this.width = 8;
	}

	// Two-parameter constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// Getters
	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
}

// Chair Class
class Chair {
	private int legs;
	private String material;

	// No-parameter constructor
	public Chair() {
		this.legs = 4;
		this.material = "wood";
	}

	// One-parameter constructor
	public Chair(int legs) {
		this.legs = legs;
		this.material = "wood";
	}

	// Two-parameter constructor
	public Chair(int legs, String material) {
		this.legs = legs;
		this.material = material;
	}

	// Getters
	public int getLegs() {
		return legs;
	}

	public String getMaterial() {
		return material;
	}
}