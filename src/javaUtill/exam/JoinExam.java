package javaUtill.exam;

public class JoinExam {

	public static void main(String[] args) {
		MyThread5 thread = new MyThread5();
		thread.start();
		
		System.out.println("시작");
		
		try {
			thread.join();    // join() method는 Thread가 멈출때까지 기다리게 한다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("종료");

	}

}
