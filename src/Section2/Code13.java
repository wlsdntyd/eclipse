package Section2;

public class Code13 {

	public static void main(String[] args) {
		for(int i = 2; i <= 100000; i++) {
			boolean isPrime = true;
			for(int j = 2; j*j < i && isPrime; j++) {
				if(i % j == 0)	// j=1�� �ϸ� �������� �׻� 0�̵Ǽ� �� false�� �ȴ�. 
					isPrime = false;
			}
			if(isPrime)
				System.out.print(i + " ");
		}
	}

}
