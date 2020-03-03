package chapter1;

import java.util.Scanner;

public class Code3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int[] array = new int[max];
		
		for(int i = 0; i < max; i++)
			array[i] = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < max; i++)
			System.out.print(array[i] + " ");
		
		int temp = array[0];		// ¾ÕÀ¸·Î ÇÑ Ä­¾¿ ¶¥°ÜÁÜ.
		for(int i = 0; i < max-1; i++)
			array[i] = array[i+1];
		array[max-1] = temp;
		
		System.out.println();
		for(int i = 0; i < max; i++)
			System.out.print(array[i] + " ");
	}

}
