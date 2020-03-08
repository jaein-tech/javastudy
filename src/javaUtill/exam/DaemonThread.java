package javaUtill.exam;

public class DaemonThread implements Runnable {
//	Daemon
//	������, ���н� �迭�� �ü������ ��׶���� �����ϴ� ���α׷�
//
//	Java DaemonThread - �ڹٿ��� ����� �����ϰ� �����ϴ� ������
//	DaemonThread�� ����� ����� Thread��  Daemon������ �ϸ� �ȴ�.

//	�ڹ����α׷��� ���� �� ��׶��忡�� Ư���� �۾��� ó���ϰ� �ϴ� �뵵�� �����.
//	ex) �ֱ������� �ڵ�����, �����͸� ����µ� �����ð����� ����� �˻�, ��

//	DaemonThread�� �Ϲ�Thread(main ��)�� ��� ����Ǹ� ���������� ����Ǵ� Ư¡�� ������ �ִ�.
	
	
	@Override
	public void run() {
		while(true) {
			System.out.println("���� �����尡 �������Դϴ�.");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new DaemonThread());
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���� �����尡 ����˴ϴ�.");
		
	}
}
