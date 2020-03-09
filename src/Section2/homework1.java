package Section2;

public class homework1 {	//  1 ~ 100000 사이의 정수들 중에 가장 작은 50개의
							//	소수를 찾아 그 합을 구하여 출력하는 프로그램 을 작성
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for(int i = 2; i < 100000; i++) {
			boolean isPrime = true;
			for(int j = 2; j*j <= i && isPrime; j++) {
				if(i % j == 0)
					isPrime = false;				
			}
			if(isPrime) {
				sum += i;
				count++;
				if(count == 50)
					break;
			}
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
