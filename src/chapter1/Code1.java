package chapter1;

import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) {
		// �̸� ���� ���� �Է¹޾Ƽ� ���.
		String name;
		int age;
		String gender;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("name : ");
		name = sc.nextLine();
		
		System.out.print("age : ");
		age = sc.nextInt();
		
		System.out.print("gender : ");
		gender = sc.next();
		
		sc.close();
		// %d > number & %s > String
		System.out.printf("your name : %s age : %d gender : %s", name, age, gender);
	}

}
