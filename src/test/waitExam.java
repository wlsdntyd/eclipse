package test;

public class waitExam {

	public static void main(String[] args) {
		WaitTest wt = new WaitTest();
		wt.start();
		
		synchronized (wt) {
			try {
				System.out.println("b�� �Ϸ�� �� ���� ��ٸ��ϴ�.");
				wt.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Total is : " + wt.total);
		}
	}
}
