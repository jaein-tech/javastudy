package javaUtill.exam;

public class MyThread2 implements Runnable {
//	�������� Thread�� ��ӹ޾����� �̹����� Runnable �������̽��� �����ϵ��� �ٲ��־���.
//	java�� ���� ��Ӹ� �����ϱ� ������ �̹� �ٸ� class�� ��ӹ��� �������� Thread class�� ��ӹ��� �� ����.
//	���� �������̽��� �����ؼ� ��밡���ϵ��� �ϴ� ����� �˾Ƶθ� ����.
	
	
	String str;
	public MyThread2(String str) {
		this.str = str;
	}
	
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
			
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
