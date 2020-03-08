package javaUtill.exam;

public class ThreadExam2 {

	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2("-");
		MyThread2 t2 = new MyThread2("*");

//		Thread를 상속받은 것이 아니기 때문에 start() method를 가지고 있지 않는다.
		Thread thread1 = new Thread(t1); // Thread 객체를 만들어 준다.
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("main end !!!");
		
		
	}

}
