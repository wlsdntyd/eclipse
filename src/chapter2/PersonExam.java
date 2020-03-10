package chapter2;

public class PersonExam {

	public static void main(String[] args) {
		Person1 first;
		first = new Person1();	// person객체 생성.
		
		int a = 10;	// 참조변수와 다르게 기본타입(primitive type)
		// a변수에 바로 10 대입.
		
		first.name = "jinwoo";	// 새로 만들어진 객체의 name에 값이 대입됨. first와는 별개. 
		first.number = "01012345678";
		
		System.out.println(first.name + " " + first.number);
		System.out.println(first);	// first는 참조변수(reference type)
			// first에는 새로 만들어진 객체의 주소가 담겨있다.
		Person1 second;
		second = first;	// second에 first가 참조하고 있는 주소값이 대입됨.
		
		System.out.println(second.name + " " + second.number);
		second.name = "kim";
		System.out.println(first.name + " " + first.number);
		System.out.println(second.name + " " + second.number);
		
		int[] numbers = new int[10];	// 10칸짜리 배열 객체 생성, numbers가 그 배열주소를 담고 있다.
		numbers[0] = 10;	// 각 배열의 타입은 int타입의 primitive 변수
		numbers[1] = numbers[0];	// 주소가 저장된게 아니라 int타입의 값10이 대입된거임.
		System.out.println(numbers[1]);
		
		Person1[] members = new Person1[10];// Person1클래스 10개 배열로 생성 그 주소를 members가 가지고 있음.
		members[0] = first;	// members[0] 또한 Person1의 참조변수 새로운 객체를 만들고 사용하던지
		members[1] = second;	// 이렇게 참조하는 값을 넣어주던지 해서 사용.
		members[2].name = "haha";
		members[2].number = "123123";
		System.out.println(members[2].name); 	// 오류. 참조변수에 참조하는 객체가 없음.
	}

}
