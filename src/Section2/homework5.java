package Section2;

import java.util.Scanner;

public class homework5 {	// n���� ũ�ų� �����鼭 ���� ���� 2�� �ŵ��������� ã�Ƽ�
//  ����ϴ� ���α׷��� �ۼ��϶�. ���� ��� n=12�̸� ����� 24=16�̴�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 1;
		sc.close();
		
		if(n == 1)
			System.out.println("0");
		
		for(int i = 1; i < n; i++) {	// ����
			num *= 2;
			if(num >= n) {
				System.out.println(i);
				break;
			}
		}

	}

}
