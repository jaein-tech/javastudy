package javaUtill.exam;

public class ThreadExam {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		
//		Thread ���۽� run()�� �ƴ� start()�� ȣ���Ѵ�. Thread�� ������ �غ� �ϰ� ���ش�.
		t1.start();
		t2.start();
		
		System.out.println("main end !!!");

	}

}
