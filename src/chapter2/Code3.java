package chapter2;

public class Code3 extends Person1 {

	private String id;	// ���� Ŭ�������� ����� ���̱⿡ private, �ٸ� Ŭ�������� �а� ���� �Ұ���
	public int age;	// ���� ��Ű����� ���ٰ�����. �а� ���� ����
	
	public Code3(String name, String number, String id, int age) {
		super(name, number);	// �θ� ������ �޼ҵ� ȣ��, name�� number�� �θ�Ŭ������ �޴´�.
		this.id = id;		// �Ű����� �޴� �޼ҵ�
		this.age = age;
	}
	
	public Code3() {	// �� ������ �޼ҵ�
		super();
	}
	
	public String toString() {
		String result = super.toString() +	// �θ�Ŭ������ �޼ҵ� ȣ��
						"id : " + id + "\n" +
						"age : " + age;
		return result;
	}
	
	public static void main(String[] args) {
		
		Code3 cd1 = new Code3();
		// ���� Ŭ���� Code3 ���, ���� subclass, extended class, child class�� �Ѵ�.
		cd1.id = "001";
		// Person1 �θ�Ŭ���� ���, ���� �θ�Ŭ������ super,base,parent class�� �Ѵ�.
		cd1.name = "jinoo";
		cd1.number = "0514";
		
		Code3 cd2 = new Code3("eunchong", "1225", "002", 31);
		System.out.println(cd2.age);
		
		System.out.println(cd2.toString());
		
		// polymorphism : ������. poly(����) morph(����)
		// ps ���������� Code3�� ���ο� ��ü �ּҸ� ��� �����Ƿ� Person1�� �޼ҵ尡 �ƴ� Code3�� �޼ҵ带 ������.
		Person1 ps = new Code3("ji", "03", "92", 30);
		System.out.println(ps.toString());
	}

}
