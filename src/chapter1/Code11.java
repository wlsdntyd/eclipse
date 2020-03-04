package chapter1;

import java.util.Scanner;

public class Code11 {

	public static void main(String[] args) {
		// 입력받은 수 바로 바로 정렬. 어렵다 나중에 다시 풀어보자.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for(int i=0; i<n; i++) {
			int temp = sc.nextInt();

			int j = i-1;
			while(j>=0 && array[j]>temp) {
				array[j+1] = array[j];
				j--;
			}
			
			array[j+1] = temp;
			
			for(int k=0; k<=i; k++)
				System.out.print(array[k] + " ");
			System.out.println();
		}
		sc.close();
	}
}
