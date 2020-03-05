package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code14 {

	public static void main(String[] args) {
		// 파일읽어 오고 출력.
		Scanner sc = null;
		
		try {
			sc = new Scanner(new File("input.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("No file");
		}
		
		String[] name = new String[1000];
		String[] number = new String[1000];
		int n = 0;
		
		while(sc.hasNext()) {
			name[n] = sc.next();
			number[n] = sc.next();
			n++;
		}
		for(int i = 0; i < n; i++)
			System.out.println(name[i] + " : " + number[i]);		
	}

}
