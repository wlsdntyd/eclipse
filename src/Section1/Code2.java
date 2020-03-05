package Section1;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		// 숫자 입력받아 합계랑 최대값 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 개수를 입력하세요 : ");
		int max = sc.nextInt();
		int[] array = new int[max];	// variable length array.
		int i = 0;
		System.out.printf("%d 개의 숫자를 입력하세요.\n", max);
		while(i < max) {
			System.out.printf("%d 번째 숫자를 입력하세요.\n", i+1);
			array[i] = sc.nextInt();
			i++;
		}
		sc.close();
		int sum = 0;
		int maxnum = array[0];	// maxnum = 0 으로 하면 음수일 때 처리가 안됨.
		for(int j = 0; j < max; j++) {
			sum += array[j];
			if(maxnum < array[j])
				maxnum = array[j];
		}
		System.out.printf("sum is : %d .\n max is : %d", sum, maxnum);
	}

}
