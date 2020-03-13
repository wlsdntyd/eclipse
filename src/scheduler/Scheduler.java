package scheduler;

import java.util.Scanner;

public class Scheduler {
	
	private static Scanner sc;	// ��ü ���� �� �ڵ� �Ҵ�
	private int a = 10;
	private String str = "age";
	
	public String toString() {	// objectŬ������ toString �޼ҵ� �������̵�
		return str + " : " + a;
	}
	
	public boolean equals(Object obj) {		// objectŬ������ equals �޼ҵ� �������̵� 
		if(obj == this) return true;	// ���� ��ü�� �ڱ� �ڽ��̸� true
		if(obj == null) return false;	// ��ü�� null���̶�� false
		if(obj.getClass() == this.getClass()) {	// ���� ��ü�� Ŭ������ �ڽ��� Ŭ������ ���ٸ�
			Scheduler sd = (Scheduler)obj;	// ����ȯ ������ ��
			return this.a == sd.a && this.str == sd.str;	// ���� ���ؼ� ������ true
		}
		else return false;	// �� �� �̻��� ��ü�� �� �Ͻ� false
	}

	public static void main(String[] args) {
		// ��� Ŭ������ �ֻ��� Ŭ���� Object�� �ڽĵ�
		// �� Object obj = new Scheduler(); ������ �ȴٴ� ��. ������ ȿ���� ������ �Ⱦ��ٴ� ��. 
		sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		String[] strarray = str.split("/");	// ���ڿ� �ɰ��� �޼ҵ� ����Ʈ ��ȯ
		for(int i = 0; i < strarray.length; i++)
			System.out.print(strarray[i] + " ");
		System.out.println();
		System.out.println(str.replace("/", " "));	// ���ڿ� �ٸ� ���ڷ� ��ü�ϴ� �޼ҵ�
		
		Scheduler sd1 = new Scheduler();
		Scheduler sd2 = new Scheduler();
		System.out.println(sd1.toString());
		System.out.println(sd1.equals(sd2));
		// Integer, Double, Char, Boolean �� prime type �� ��ü�� ��ȯ���ִ� Ŭ����
		// Wrapper Class	wrapping
		int[] array = new int[10];
		int a = 15;
		array[0] = (Integer)a;			// ù ��° ���.
		Integer it = new Integer(a);	// �� ��° ���.
		array[1] = it;
		System.out.println(array[0] + " " + array[1]);	// 15 15
		// Integer ��ü���� �� ����. unwrapping
		int b = it.intValue();
		// String type conversion, casting (Ÿ�� ��ȯ)
		String st = "1234";
		array[2] = Integer.parseInt(st);
		System.out.println(array[2]);
		// auto boxing, unboxing
		Object[] ob = new Object[10];
		int c = 20;
		ob[0] = c;	// auto boxing (Integer)c ���� �ڵ�ó������
		int d = (Integer)ob[0];	// auto unboxing
	}

}
