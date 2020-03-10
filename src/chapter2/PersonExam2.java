package chapter2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonExam2 {
	
	static Person1[] members = new Person1[100];
	static int n = 0;
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("input.txt"));
			while(in.hasNext()) {
				members[n] = new Person1();	// 객체 생성 후 접근.
				members[n].name = in.next();
				members[n].number = in.next();
				n++;
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not exist");
		}
		
		bubbleSort();
		
		for(int i = 0; i < n; i++)
			System.out.println(members[i].name + " : " + members[i].number);
		

	}

	public static void bubbleSort() {
		for(int i = n-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(members[j].name.compareToIgnoreCase(members[j+1].name) > 1) {
					Person1 tmp = members[j];	// 클래스 안에 이름과 번호가 있으므로 참조변수를
					members[j] = members[j+1];	// 서로 바꿔주면 된다.
					members[j+1] = tmp;
				}				
			}
		}
	}

}
