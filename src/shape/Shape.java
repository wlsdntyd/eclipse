package shape;

public abstract class Shape implements Mycomparable{
	
	public String shapename;
	
	public Shape(String name) {
		shapename = name;
	}
	
	public abstract double computeArea();	// ����
	public abstract double computePerimeter();	// �ѷ� ����
	
	public int compareTo(Object obj) {
		double myArea = computeArea();
		double yourArea = ((Shape)obj).computeArea();
		if(myArea < yourArea) return -1;
		else if(myArea == yourArea) return 0;
		else return 1;
	}
}
