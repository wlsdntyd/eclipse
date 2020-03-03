package chapter1;

import java.util.Scanner;

public class Code6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int[] array = new int[max];
		
		for(int i = 0; i < max; i++)
			array[i] = sc.nextInt();
		
		sc.close();
		int maxnum = 0;
		for(int i = 0; i < max; i++) {
			for(int j = i; j < max; j++) {
				int sum = 0;
				for(int k = i; k <= j; k++)
					sum += array[k];
				
				if(sum > maxnum)
					maxnum = sum;
			}
		}
		System.out.println(maxnum);
	}

}
