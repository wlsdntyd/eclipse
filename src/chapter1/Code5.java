package chapter1;

import java.util.Scanner;

public class Code5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int[] array = new int[max];
		
		for(int i = 0; i < max; i++)
			array[i] = sc.nextInt();
		sc.close();
		
		int count = 0;
		
		for(int i = 0; i < max-1; i++) {		// Àç¹Õ±¸¸¸.
			for(int j = 1+i; j < max; j++) {
				if(array[i] == array[j])
					count++;
			}				
		}
		System.out.println(count);
	}

}
