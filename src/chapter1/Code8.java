package chapter1;

import java.util.Scanner;

public class Code8 {

	public static void main(String[] args) {
		// ���� �迭 ���� ���ڵ� �� �Ҽ��̸鼭 �ִ밪 ���
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		sc.close();
		
		int max = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				int val = 0;
				boolean isPrime = true;
				
				for(int k = i; k <= j; k++)
					val = val * 10 + array[k];
				
				for(int k = 2; k < val; k++)		
					if(val % k == 0)
						isPrime = false;
				
				if(isPrime && val > 1 && val > max)	// 1�� �Ҽ��� �ƴϹǷ� ó������ߵȴ�.
					max = val;
			}
		}
		if(max > 0)
			System.out.println(max);
		else
			System.out.println("No prime number");	// prime number : �Ҽ�
	}

}
