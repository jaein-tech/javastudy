package javaUtill.exam;

public class MyThread1 extends Thread {
//	������(Thread) - �ϳ��� ���μ��� �ȿ��� �������� �帧�� ������ �� �ְ� �ϴ°�
//	���μ���(process)�� ���� ����ǰ� �ִ� ���α׷��� ���Ѵ�.
	
//	���ÿ� �������� �۾��� ������ �� �ְ� �Ѵ�.
//	���α׷��� �������� �۾��� ���ÿ� �ϰ� ����� �ʹٸ� Thread�� �˾ƾ� �Ѵ�.
	String str;
	public MyThread1(String str) {
		this.str = str;
	}
	
	
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
