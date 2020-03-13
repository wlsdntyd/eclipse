package shape;

public class Circle extends Shape {

	public int radius;
	
	public Circle(int r) {
		super("Circle");
		radius = r;
	}

	@Override
	public double computeArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double computePerimeter() {
		return Math.PI * 2.0 * radius;
	}
	
	public String toString() {
		return "Circle : radius is " + radius;
	}
}
