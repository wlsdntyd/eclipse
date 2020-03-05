package Section2;

public class Code13 {

	public static void main(String[] args) {
		for(int i = 2; i <= 100000; i++) {
			boolean isPrime = true;
			for(int j = 2; j*j < i && isPrime; j++) {
				if(i % j == 0)	// j=1로 하면 나머지가 항상 0이되서 다 false가 된다. 
					isPrime = false;
			}
			if(isPrime)
				System.out.print(i + " ");
		}
	}

}
