package Section2;

import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Code12 c = new Code12();
		int result = c.power(a, b);
		System.out.println(result);
		
		sc.close();
	}
	
	public int power(int a, int b) {
		int prod = 1;
		for(int i = 0; i < b; i++)
			prod = prod * a;
		return prod;
	}

}
