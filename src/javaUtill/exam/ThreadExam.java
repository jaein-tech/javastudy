package javaUtill.exam;

public class ThreadExam {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		
//		Thread 동작시 run()이 아닌 start()를 호출한다. Thread가 실행할 준비를 하게 해준다.
		t1.start();
		t2.start();
		
		System.out.println("main end !!!");

	}

}
