package javaUtill.exam;

public class LambdaExam {
//	Interface�߿��� method�� �ϳ��� ������ �ִ� Interface�� �Լ��� Interface��� �Ѵ�.
//	ex) Runnable Interface
	public static void main(String[] args) {
//		new Thread(new Runnable() {      Thread�� ����ɶ� Thread ������ �ȿ��ٰ� ���� Run�̶�� method�� ����Ƕ�� �� �� �ִ�.
//			
//			@Override
//			public void run() {
//				for(int i = 0; i < 10; i++) {
//					System.out.println("hello");
//				}
//				java�� method�� �Ű������� ������ ����� ����. instance�� ������ �� �ִ�.
//				���⿡���� run()�̶�� method�� ������ �ִ� Runnable�� ��ü�� ���� ������ ���̴�.
//			}
//		}).start();

		
		new Thread(()-> {        // ()-> {~~}�� Lambda�� �̶�� �Ѵ�. (�ٸ����� �͸� method)
				for(int i = 0; i < 10; i++) {
					System.out.println("hello");
				}
		}).start();
	}

}
