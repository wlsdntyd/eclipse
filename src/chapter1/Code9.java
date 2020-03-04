package chapter1;

import java.util.Scanner;

public class Code9 {

	public static void main(String[] args) {
		//bubble sort 버블 정렬 크,,, 힌트를 좀 얻긴했지만 스스로 풀어서 뿌듯,,,
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		sc.close();
		
		while(n != 1) {	// for(int i=n-1; i>0; i--) 대체 가능.
			for(int i = 0; i < n-1; i++) {	// for(int j=0; j<i; j++)
				if(array[i] > array[i+1]) {	// swap 자리 바꾸기
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}						
			n--;
		}
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

}
