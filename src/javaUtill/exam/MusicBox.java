package javaUtill.exam;

public class MusicBox {
//	synchronized ������ü�� ���� method�� ���ÿ� ȣ����� �ʵ��� �ϴ� ���
//	���� ȣ���� method�� ��ü�� ����(Monitoring Lock)�� ������ �ȴ�.
	public synchronized void playMusicA() {
		for(int i = 0; i < 10; i++) {
			System.out.println("�ų��� ����!!!");
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void playMusicB() {
		for(int i = 0; i < 10; i++) {
			System.out.println("���� ����!!!");
			
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
				
				System.out.println("ī�� ����!!!");
			}
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
