package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
						// 텍스트로 읽어 온 이중 배열에서 각 위치마다 모든 방향으로의 숫자들의 소수만
public class Code16 {	// 출력하는 코드, 아직 중복도 있고 불안한 느낌이 있다.
	static int n;
	static int[][] grid;
		
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("dlistnums.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		n = sc.nextInt();
		grid = new int[n][n];	
		for(int x = 0; x < n; x++) {
			for(int y = 0; y < n; y++) {
				grid[x][y] = sc.nextInt();
				System.out.println(grid[x][y]);
			}
		}
		sc.close();
		
		for(int x=0; x<n; x++) {
			for(int y=0; y<n; y++) {
				for(int dir=0; dir<8; dir++) {
					for(int len=1; len<=n; len++) {
						int val = computeValue(x,y,dir,len);
						if(val != -1 && isPrime(val))
							System.out.println(val);
					}
				}
			}
		}
	}

	public static boolean isPrime(int val) {
		for(int i = 2; i*i <= val; i++)
			if(val % i == 0)
				return false;
		return true;
	}

	public static int computeValue(int x, int y, int dir, int len) {
		int value = 0;
		for(int i=0; i<len; i++) {
			int digit = getDigit(x, y, dir, i);
			if(digit == -1)
				return -1;
			value = value * 10 + digit;
		}
		return value;
	}

	public static int getDigit(int x, int y, int dir, int i) {
		int newX = x, newY = y;
		switch(dir) {
		case 0: newY -= i; break;
		case 1: newX += i; newY -= i; break;
		case 2: newX += i; break;
		case 3: newX += i; newY += i; break;
		case 4: newY += i; break;
		case 5: newX -= i; newY += i; break;
		case 6: newX -= i; break;
		case 7: newX -= i; newY -= i; break;
		}
		if(newX<0 || newX>=n || newY<0 || newY>=n)
			return -1;
		return grid[newX][newY];
	}
}
