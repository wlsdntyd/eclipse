package test;

import java.util.Scanner;

public class Main{
	
	int[] ages;
	int sum = 0;
	
	public Main(int i) {
		ages = new int[i];
	}
	
	public void insert(int i, int age) {
		ages[i] = age;
		sum += age;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("input array's length : ");
		int i = sc.nextInt();
		Main ag = new Main(i);
		
		for(int k = 0; k < ag.ages.length; k ++) {
			System.out.print("input age : ");
			int age = sc.nextInt();
			ag.insert(k, age);
		}
		int j = 0;
		int max = ag.ages[0];	// 음수일 경우에 오류.
		while(j < ag.ages.length) {
			if(max < ag.ages[j]) {
				max = ag.ages[j];
			}
			j ++;
		}
		System.out.println("sum is " + ag.sum);
		System.out.println("max is " + max);
		sc.close();	
	}
}