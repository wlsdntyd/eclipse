package Section2;

import java.util.Scanner;

public class homework5 {	// n보다 크거나 같으면서 가장 작은 2의 거듭제곱수를 찾아서
//  출력하는 프로그램을 작성하라. 예를 들어 n=12이면 출력은 24=16이다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 1;
		sc.close();
		
		if(n == 1)
			System.out.println("0");
		
		for(int i = 1; i < n; i++) {	// 지수
			num *= 2;
			if(num >= n) {
				System.out.println(i);
				break;
			}
		}

	}

}
