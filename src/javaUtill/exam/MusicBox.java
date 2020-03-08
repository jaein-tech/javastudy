package javaUtill.exam;

public class MusicBox {
//	synchronized 공유객체가 가진 method를 동시에 호출되지 않도록 하는 방법
//	먼저 호출한 method가 객체의 사용권(Monitoring Lock)을 가지게 된다.
	public synchronized void playMusicA() {
		for(int i = 0; i < 10; i++) {
			System.out.println("신나는 음악!!!");
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void playMusicB() {
		for(int i = 0; i < 10; i++) {
			System.out.println("슬픈 음악!!!");
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void playMusicC() {
		for(int i = 0; i < 10; i++) {
			synchronized (this) {
				
				System.out.println("카페 음악!!!");
			}
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
