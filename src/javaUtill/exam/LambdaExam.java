package javaUtill.exam;

public class LambdaExam {
//	Interface중에서 method를 하나만 가지고 있는 Interface를 함수형 Interface라고 한다.
//	ex) Runnable Interface
	public static void main(String[] args) {
//		new Thread(new Runnable() {      Thread가 실행될때 Thread 생성자 안에다가 넣은 Run이라는 method가 실행되라고 할 수 있다.
//			
//			@Override
//			public void run() {
//				for(int i = 0; i < 10; i++) {
//					System.out.println("hello");
//				}
//				java는 method만 매개변수로 전달할 방법이 없다. instance만 전달할 수 있다.
//				여기에서는 run()이라는 method를 가지고 있는 Runnable을 객체로 만들어서 전달한 것이다.
//			}
//		}).start();

		
		new Thread(()-> {        // ()-> {~~}를 Lambda식 이라고 한다. (다른말로 익명 method)
				for(int i = 0; i < 10; i++) {
					System.out.println("hello");
				}
		}).start();
	}

}
