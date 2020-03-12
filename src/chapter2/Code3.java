package chapter2;

public class Code3 extends Person1 {

	private String id;	// 같은 클래스에서 사용할 것이기에 private, 다른 클래스에서 읽고 쓰기 불가능
	public int age;	// 같은 패키지라면 접근가능함. 읽고 쓰기 가능
	
	public Code3(String name, String number, String id, int age) {
		super(name, number);	// 부모 생성자 메소드 호출, name과 number를 부모클래스가 받는다.
		this.id = id;		// 매개변수 받는 메소드
		this.age = age;
	}
	
	public Code3() {	// 빈 생성자 메소드
		super();
	}
	
	public String toString() {
		String result = super.toString() +	// 부모클래스의 메소드 호출
						"id : " + id + "\n" +
						"age : " + age;
		return result;
	}
	
	public static void main(String[] args) {
		
		Code3 cd1 = new Code3();
		// 현재 클래스 Code3 멤버, 보통 subclass, extended class, child class라 한다.
		cd1.id = "001";
		// Person1 부모클래스 멤버, 보통 부모클래스를 super,base,parent class라 한다.
		cd1.name = "jinoo";
		cd1.number = "0514";
		
		Code3 cd2 = new Code3("eunchong", "1225", "002", 31);
		System.out.println(cd2.age);
		
		System.out.println(cd2.toString());
		
		// polymorphism : 다형성. poly(많은) morph(형태)
		// ps 참조변수는 Code3의 새로운 객체 주소를 담고 있으므로 Person1의 메소드가 아닌 Code3의 메소드를 가진다.
		Person1 ps = new Code3("ji", "03", "92", 30);
		System.out.println(ps.toString());
	}

}
