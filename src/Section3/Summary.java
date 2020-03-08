package Section3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Summary {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] names = new String[1000];
		int[] numbers = new int[1000];
		int n = 0;
		
		while(sc.hasNext()) {
			names[n] = sc.next();
			numbers[n] = sc.nextInt();
			n++;
		}
		sc.close();
		
		bubbleSort(n, names, numbers);
		
		for(int i = 0; i<n; i++) {
			System.out.println("name : " + names[i] + " number : " + numbers[i]);
		}
		
	}

	public static void bubbleSort(int n, String[] names, int[] numbers) {
		for(int i = n-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(names[j].compareTo(names[j+1]) > 0) {
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
					
					int tmp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = tmp;
				}
			}
		}
		
	}
	
}
