package chapter1;

import java.util.Scanner;

public class Code7 {
	// code6 보다 간단하게.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int[] array = new int[max];
		
		for(int i = 0; i < max; i++)
			array[i] = sc.nextInt();
		sc.close();
		
		int maxnum = 0;
		for(int i = 0; i < max; i++) {
			int sum = 0;
			for(int j = i; j < max; j++) {
				sum += array[j];
				if(sum > maxnum)
					maxnum = sum;
			}				
		}
		System.out.println(maxnum);
	}

}
