package Section1;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		// ���� �Է¹޾� �հ�� �ִ밪 ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ������ �Է��ϼ��� : ");
		int max = sc.nextInt();
		int[] array = new int[max];	// variable length array.
		int i = 0;
		System.out.printf("%d ���� ���ڸ� �Է��ϼ���.\n", max);
		while(i < max) {
			System.out.printf("%d ��° ���ڸ� �Է��ϼ���.\n", i+1);
			array[i] = sc.nextInt();
			i++;
		}
		sc.close();
		int sum = 0;
		int maxnum = array[0];	// maxnum = 0 ���� �ϸ� ������ �� ó���� �ȵ�.
		for(int j = 0; j < max; j++) {
			sum += array[j];
			if(maxnum < array[j])
				maxnum = array[j];
		}
		System.out.printf("sum is : %d .\n max is : %d", sum, maxnum);
	}

}
