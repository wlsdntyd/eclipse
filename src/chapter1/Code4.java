package chapter1;

public class Code4 {

	public static void main(String[] args) {
		// �Ҽ� ã�� �ڵ�. 101�� �Ҽ����� �����ϴ� ª�� ������ � ������ ���� ���� �̻󿡼� ���� �� ������ �׻� �߻�
		// ���� 100 ������ �Ҽ��� ã�� �� ������ ���� 50������ �ص���. �� �� ���ư��ڸ� ���ڿ� ��Ʈ�� ���� �������� �ص���.
		// �ڵ�� ġ�ڸ� ��Ʈj�� ã�°� ��ٷο�Ƿ� i*i�� �ϸ� �ȴ�.
		for(int i = 2; i < 100; i++) {
			boolean isPrime = true;
			for(int j = 2; j*j < i && isPrime; j++) {	// a�� false�� �Ǹ� ���� �ȵ�. break ���� ����
				if(i % j == 0) {
					isPrime = false;
				}
			}
			if(isPrime)
				System.out.println(i);
		}
	}
}
