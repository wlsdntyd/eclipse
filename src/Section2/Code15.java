package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code15 {
	// ���� �������̰� �����ϰ� ���. String.compareTo(String)
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
			for(int j = 0; j < i; j++) {	// compareTo ������ ũ�� �������, ������ 0����, ������ ũ�� ��������
				if(name[j].compareTo(name[j+1]) > 1) {	// compareToIgnoreCase ��ҹ��� ���о���.
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
