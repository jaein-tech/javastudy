package javaUtill.exam;

// Thread�� ����Ǿ��ٰ� ����ٰ� �ϴ°��� �ݺ��ϴµ� �̰��� ������ �Ͼ�� ���� Thread�� ��� ���ÿ� �����ϴ°�ó�� ���̴� ���̴�.

// New Thread�� Thread�� �����ϰ� start() method�� �����ϰ� �Ǹ� Thread�� ����ǰ� �ȴ�.
// Runnable - ���డ���� ������ Thread
// Running - �������� ������ Thread
// Thread�� ����Ǹ� Runnable�� Running�� �Դٰ��� �ϰ� �ȴ�.

// Thread�ȿ��� sleep() method�� Object�� ������ �ִ� wait() method�� ȣ���̵Ǹ� Thread�� Blocked���°� �ȴ�.

// sleep() method�� Ư���ð��� ������ �ڱ� ������ Blocked���¿��� �������� Runnable�̳� Running���°� �ȴ�.
// wait() method�� �ٸ� Thread�� notify() method�� ȣ���ϱ� ������ Blocked���¿��� ���� �� ����.
// ���� wait() method�� ȣ���� �Ǹ� Monitoring Lock(��ü�� ����)�� ���� �Ǳ⶧���� ������� �ٸ� method�� ����ǰ� �ȴ�.


// Thread�� run() method�� ����ǰ� �Ǹ� Thread�� ����, Dead���°� �ȴ�.

// yield() method�� ȣ��ǰԵǸ� �ش� Thread�� �ٸ� Thread���� �ڿ��� �纸�ϰ� �ȴ�.
// ��, �ٸ� Thread�� ���� ������ ����ǰ� �� �� �ִ�.

public class MyThread5 extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("MyThread5 : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
