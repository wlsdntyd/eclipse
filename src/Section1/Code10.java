package Section1;

import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		// bubble sort 이중 포문으로 해보기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for(int i=0; i<n; i++)
			array[i] = sc.nextInt();
		sc.close();
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(int i=0; i<n; i++)
			System.out.print(array[i] + " ");
	}

}
