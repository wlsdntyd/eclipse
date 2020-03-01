package test;

public class MusicBox {

	public synchronized void playMusicA() {
		for(int i = 0; i < 10; i ++) {
			System.out.println("Funny Music!");
		try {
			Thread.sleep((int)Math.random() * 1000);
		} catch(Exception e) {
			e.printStackTrace();
			}
		}
	}
	
	public synchronized void playMusicB() {
		for(int i = 0; i < 10; i ++) {
			System.out.println("Lonely Music!");
		try {
			Thread.sleep((int)Math.random() * 1000);
		} catch(Exception e) {
			e.printStackTrace();
			}
		}
	}
	
	public void playMusicC() {
		for(int i = 0; i < 10; i ++) {
			synchronized (this) {
			System.out.println("Cafe Music!");
			}
		try {
			Thread.sleep((int)Math.random() * 1000);
		} catch(Exception e) {
			e.printStackTrace();
			}
		}
	}
}
