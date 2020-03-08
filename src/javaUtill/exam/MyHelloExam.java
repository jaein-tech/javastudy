package javaUtill.exam;

import java.lang.reflect.Method;

public class MyHelloExam {

	public static void main(String[] args) {
		MyHello hello = new MyHello();
		
		try {
			Method method = hello.getClass().getDeclaredMethod("hello");
//		getClass()�� Object�� ���� class�ε� �ش� instance�� ���鶧 ����� class�� ������ return�Ѵ�.
//		getDeclaredMethod()�� ���� class�� ���� ������ ��� �� ������ ���� ()�ȿ� method�� ���� ������ ���϶�� ���̴�.
			
			if(method.isAnnotationPresent(Count100.class)) {
//				.isAnnotationPresent()�� Ư�� ������̼��� method�� ����Ǿ� �ִ��� �˾Ƴ� �� �ִ� �κ�
				for(int i = 0; i < 100; i++) {
					hello.hello();
				}
			}else {
				hello.hello();
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
