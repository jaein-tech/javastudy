package javaUtill.exam;

public class MyThread1 extends Thread {
//	쓰레드(Thread) - 하나의 프로세스 안에서 여러개의 흐름을 동작할 수 있게 하는것
//	프로세스(process)란 현재 실행되고 있는 프로그램을 말한다.
	
//	동시에 여러가지 작업을 수행할 수 있게 한다.
//	프로그램이 여러개의 작업을 동시에 하게 만들고 싶다면 Thread를 알아야 한다.
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
