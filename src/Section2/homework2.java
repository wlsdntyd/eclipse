package Section2;

import java.util.Scanner;

public class homework2 {		// Â¦¼ö ÇÕ¿¡¼­ È¦¼ö ÇÕ »©´Â ¹®Á¦

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0 < n < ??? : ");
		int n = sc.nextInt();
		int[] array = new int[n];
		int even_sum = 0;	// Â¦¼ö
		int odd_sum = 0;	// È¦¼ö
		
		for(int i = 0; i < n; i++) {
			System.out.print(i+1 + " : input : ");
			array[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < n; i++) {
			if(array[i] % 2 == 0)
				even_sum += array[i];
			else
				odd_sum += array[i];
		}
		System.out.println(even_sum - odd_sum);
	}

}
