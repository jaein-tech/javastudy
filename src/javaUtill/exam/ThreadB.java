package javaUtill.exam;

public class ThreadB extends Thread {
//	wait와 notify는 동기화된 블록안에서 사용해야 한다. 
//	wait를 만나게 되면 해당 Thread는 해당 객체의 모니터링 락에 대한 권한을 가지고 있다면 모니터링 락의 권한을 놓고 대기한다.
	int total;
	
	public void run() {
		synchronized (this) {
			for(int i = 0; i < 5; i++) {
				System.out.println(i+"를 더합니다.");
				total += i;
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify();
		}
	}
}
