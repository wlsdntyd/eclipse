package shape;

public class Triangle extends Shape {
	public int width;
	public int height;
	
	public Triangle(int w, int h) {
		super("Triangle");
		width = w;
		height = h;
	}

	@Override
	public double computeArea() {
		return width * height / 2.0;
	}

	@Override
	public double computePerimeter() {
		return width/2.0 + height;
	}
	
	public String toString() {
		return "Triangle : width is " + width + ", height is " + height;
	}
}
