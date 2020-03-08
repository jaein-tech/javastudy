package javaUtill.exam;

public class MyThread2 implements Runnable {
//	기존에는 Thread를 상속받았지만 이번에는 Runnable 인터페이스를 구현하도록 바꿔주었다.
//	java는 단일 상속만 지원하기 때문에 이미 다른 class를 상속받은 다음에는 Thread class를 상속받을 수 없다.
//	따라서 인터페이스를 구현해서 사용가능하도록 하는 방법도 알아두면 좋다.
	
	
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
