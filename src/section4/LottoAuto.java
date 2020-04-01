package section4;

import java.util.Scanner;

public class LottoAuto {
	
	private static Scanner sc = new Scanner(System.in);
	private static int[][] lottos = null;
	
	public static void main(String[] args) {
		
		int menu;
		boolean running = true;
		
		while(running) {
			System.out.print("���� �Է� 1: �ζ� �ڵ� ����\n\t2: �ζ� ���� ����\n\t3: �ζ� ���\n\t4: �׸�\n");
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				lottos = createLottosAuto();
				break;
			case 2:
				lottos = createLottoManual();
				break;
			case 3:
				printLottos(lottos);
				break;
			case 4:
				running = false;
				break;
			}
		}
	}

	private static void printLottos(int[][] lottos) {
		for(int i=0; i<lottos.length; i++) {
			for(int j=0; j<lottos[i].length; j++)
				System.out.print(lottos[i][j] + " ");
			System.out.println();
		}
	}

	private static int[][] createLottoManual() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int[][] createLottosAuto() {
		System.out.print("������ �Է��ϼ��� : ");
		int n = sc.nextInt();
		lottos = new int[n][6];
		for(int i=0; i<n; i++)
			for(int j=0; j<6; j++) {
				lottos[i][j] = (int)(Math.random()*45)+1;
				
				for(int k=j-1; k>=0; k--)
					if(lottos[i][j] == lottos[i][k])
						lottos[i][j] = (int)(Math.random()*45)+1;
			}
		
		return lottos;
	}

	private static int inputMenu() {
		return sc.nextInt();
	}
}
