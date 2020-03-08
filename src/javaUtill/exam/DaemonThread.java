package javaUtill.exam;

public class DaemonThread implements Runnable {
//	Daemon
//	리눅스, 유닉스 계열의 운영체제에서 백그라운드로 동작하는 프로그램
//
//	Java DaemonThread - 자바에서 데몬과 유사하게 동작하는 쓰레드
//	DaemonThread를 만드는 방법은 Thread에  Daemon설정을 하면 된다.

//	자바프로그램을 만들 때 백그라운드에서 특별한 작업을 처리하게 하는 용도로 만든다.
//	ex) 주기적으로 자동저장, 에디터를 만드는데 일정시간마다 맞춤법 검사, 등

//	DaemonThread는 일반Thread(main 등)가 모두 종료되면 강제적으로 종료되는 특징을 가지고 있다.
	
	
	@Override
	public void run() {
		while(true) {
			System.out.println("데몬 쓰레드가 실행중입니다.");
			
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
		System.out.println("메인 쓰레드가 종료됩니다.");
		
	}
}
