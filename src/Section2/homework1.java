package Section2;

public class homework1 {	//  1 ~ 100000 ������ ������ �߿� ���� ���� 50����
							//	�Ҽ��� ã�� �� ���� ���Ͽ� ����ϴ� ���α׷� �� �ۼ�
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
