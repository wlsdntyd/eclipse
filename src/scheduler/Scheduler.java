package scheduler;

import java.util.Scanner;

public class Scheduler {
	
	private static Scanner sc;	// 객체 생성 시 자동 할당
	private int a = 10;
	private String str = "age";
	
	public String toString() {	// object클래스의 toString 메소드 오버라이딩
		return str + " : " + a;
	}
	
	public boolean equals(Object obj) {		// object클래스의 equals 메소드 오버라이딩 
		if(obj == this) return true;	// 받은 객체가 자기 자신이면 true
		if(obj == null) return false;	// 객체가 null값이라면 false
		if(obj.getClass() == this.getClass()) {	// 받은 객체의 클래스와 자신의 클래스가 같다면
			Scheduler sd = (Scheduler)obj;	// 형변환 시켜준 뒤
			return this.a == sd.a && this.str == sd.str;	// 값을 비교해서 같으면 true
		}
		else return false;	// 그 외 이상한 객체나 값 일시 false
	}

	public static void main(String[] args) {
		// 모든 클래스는 최상위 클래스 Object의 자식들
		// 즉 Object obj = new Scheduler(); 성립이 된다는 것. 하지만 효율이 안좋아 안쓴다는 것. 
		sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		String[] strarray = str.split("/");	// 문자열 쪼개는 메소드 리스트 반환
		for(int i = 0; i < strarray.length; i++)
			System.out.print(strarray[i] + " ");
		System.out.println();
		System.out.println(str.replace("/", " "));	// 문자열 다른 문자로 대체하는 메소드
		
		Scheduler sd1 = new Scheduler();
		Scheduler sd2 = new Scheduler();
		System.out.println(sd1.toString());
		System.out.println(sd1.equals(sd2));
		// Integer, Double, Char, Boolean 등 prime type 을 객체로 변환해주는 클래스
		// Wrapper Class	wrapping
		int[] array = new int[10];
		int a = 15;
		array[0] = (Integer)a;			// 첫 번째 방법.
		Integer it = new Integer(a);	// 두 번째 방법.
		array[1] = it;
		System.out.println(array[0] + " " + array[1]);	// 15 15
		// Integer 객체에서 값 추출. unwrapping
		int b = it.intValue();
		// String type conversion, casting (타입 변환)
		String st = "1234";
		array[2] = Integer.parseInt(st);
		System.out.println(array[2]);
		// auto boxing, unboxing
		Object[] ob = new Object[10];
		int c = 20;
		ob[0] = c;	// auto boxing (Integer)c 으로 자동처리해줌
		int d = (Integer)ob[0];	// auto unboxing
	}

}
