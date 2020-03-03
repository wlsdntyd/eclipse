package chapter1;

public class Code4 {

	public static void main(String[] args) {
		// 소수 찾는 코드. 101이 소수임을 증명하는 짧은 실행은 어떤 숫자의 절반 숫자 이상에서 나눌 시 나머진 항상 발생
		// 따라서 100 이하의 소수를 찾을 땐 나누는 수를 50까지만 해도됨. 또 더 나아가자면 숫자에 루트를 씌운 수까지만 해도됨.
		// 코드로 치자면 루트j를 찾는건 까다로우므로 i*i로 하면 된다.
		for(int i = 2; i < 100; i++) {
			boolean isPrime = true;
			for(int j = 2; j*j < i && isPrime; j++) {	// a가 false가 되면 실행 안됨. break 같은 동작
				if(i % j == 0) {
					isPrime = false;
				}
			}
			if(isPrime)
				System.out.println(i);
		}
	}
}
