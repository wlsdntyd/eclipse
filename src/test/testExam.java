package test;

public class testExam {
	
	public static void main(String[] args) {
		JoinTest jt = new JoinTest();
		jt.start();
		System.out.println("시작");
		try {
			jt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("종료!");
	}
}
