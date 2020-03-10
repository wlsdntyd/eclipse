package chapter2;

public class PersonExam {

	public static void main(String[] args) {
		Person1 first;
		first = new Person1();	// person��ü ����.
		
		int a = 10;	// ���������� �ٸ��� �⺻Ÿ��(primitive type)
		// a������ �ٷ� 10 ����.
		
		first.name = "jinwoo";	// ���� ������� ��ü�� name�� ���� ���Ե�. first�ʹ� ����. 
		first.number = "01012345678";
		
		System.out.println(first.name + " " + first.number);
		System.out.println(first);	// first�� ��������(reference type)
			// first���� ���� ������� ��ü�� �ּҰ� ����ִ�.
		Person1 second;
		second = first;	// second�� first�� �����ϰ� �ִ� �ּҰ��� ���Ե�.
		
		System.out.println(second.name + " " + second.number);
		second.name = "kim";
		System.out.println(first.name + " " + first.number);
		System.out.println(second.name + " " + second.number);
		
		int[] numbers = new int[10];	// 10ĭ¥�� �迭 ��ü ����, numbers�� �� �迭�ּҸ� ��� �ִ�.
		numbers[0] = 10;	// �� �迭�� Ÿ���� intŸ���� primitive ����
		numbers[1] = numbers[0];	// �ּҰ� ����Ȱ� �ƴ϶� intŸ���� ��10�� ���ԵȰ���.
		System.out.println(numbers[1]);
		
		Person1[] members = new Person1[10];// Person1Ŭ���� 10�� �迭�� ���� �� �ּҸ� members�� ������ ����.
		members[0] = first;	// members[0] ���� Person1�� �������� ���ο� ��ü�� ����� ����ϴ���
		members[1] = second;	// �̷��� �����ϴ� ���� �־��ִ��� �ؼ� ���.
		members[2].name = "haha";
		members[2].number = "123123";
		System.out.println(members[2].name); 	// ����. ���������� �����ϴ� ��ü�� ����.
	}

}
