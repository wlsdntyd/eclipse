package shape;

import java.util.Scanner;

public class ShapeApplication {	// add, show, showdetail, sort, exit
	
	private int capacity = 10;
	private Shape[] shapes = new Shape[capacity];
	private int n = 0;
	private Scanner kb = new Scanner(System.in);
	
	public void processCommand() {
		while(true) {
			System.out.print("$ ");
			String command = kb.next();
			if(command.equals("add"))
				handleAdd();
			else if(command.equals("show") || command.equals("showdetail"))
				handleShow(command.equals("showdetail"));
			else if(command.equals("sort"))
				bubbleSort(shapes, n);
			else if(command.equals("exit"))
				break;
		}
		kb.close();
	}

//	private void bubbleSort() {
//		for(int i=n-1; i > 0; i--) {
//			for(int j=0; j<i; j++) {
//				if(shapes[j].computeArea() > shapes[j+1].computeArea()) {
//					Shape tmp = shapes[j];
//					shapes[j] = shapes[j+1];
//					shapes[j+1] = tmp;
//				}
//			}
//		}
//		
//	}
	// 위에 거나 밑에 거나 기능은 같음
	private void bubbleSort(Mycomparable[] data, int size) {
		for(int i=size-1; i > 0; i--) {
			for(int j=0; j<i; j++) {
				if(data[j].compareTo(data[j+1]) > 0) {
					Mycomparable tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
		
	}
	private void handleShow(boolean detailed) {
		for(int i=0; i<n; i++) {
			System.out.println(i+1 + ". " + shapes[i].toString());
			if(detailed) {
				System.out.println("	The Area is " + shapes[i].computeArea());
				System.out.println("	The Perimeter is " + shapes[i].computePerimeter());
			}
		}
		
	}

	private void handleAdd() {
		String type = kb.next();
		switch(type) {
		case "R":
			int w = kb.nextInt();
			int h = kb.nextInt();
			Rectangle r = new Rectangle(w, h);
			addShape(r);
			break;
		case "C":
			int rd = kb.nextInt();
			Circle c = new Circle(rd);
			addShape(c);
			break;
		case "T":
			Triangle t = new Triangle(kb.nextInt(), kb.nextInt());
			addShape(t);
			break;
		}
		
	}

	private void addShape(Shape shape) {
		if(n >= capacity)
			reallocate();
		shapes[n++] = shape;
	}

	private void reallocate() {	// 배열 길이 꽉 차면 늘여주는 메소드
		capacity *= 2;
		Shape[] tmp = new Shape[capacity];
		System.arraycopy(shapes, 0, tmp, 0, shapes.length);
		shapes = tmp;	// tmp의 참조주소를 shapes에 넣어서 길이를 늘여줌 아주 굿!
	}

	public static void main(String[] args) {
		ShapeApplication app = new ShapeApplication();
		app.processCommand();
	}
}
