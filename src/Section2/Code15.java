package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code15 {
	// 파일 읽으들이고 정렬하고 출력. String.compareTo(String)
	static String[] name = new String[1000];
	static String[] number = new String[1000];
	static int n = 0;
	
	public static void main(String[] args) {

		Scanner sc = null;
		
		try {
			sc = new Scanner(new File("input.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("No file");
		}
		
		while(sc.hasNext()) {
			name[n] = sc.next();
			number[n] = sc.next();
			n++;
		}
		
		bubbleSort();
		
		for(int i = 0; i < n; i++)
			System.out.println(name[i] + " : " + number[i]);		
	}

	public static void bubbleSort() {
		for(int i = n-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {	// compareTo 앞쪽이 크면 양수리턴, 같으면 0리턴, 뒤쪽이 크면 음수리턴
				if(name[j].compareTo(name[j+1]) > 1) {	// compareToIgnoreCase 대소문자 구분없이.
					String tmp = name[j];
					name[j] = name[j+1];
					name[j+1] = tmp;
					
					String temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}
		}
	}
}
