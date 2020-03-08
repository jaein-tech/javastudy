package javaUtill.exam;

import java.lang.reflect.Method;

public class MyHelloExam {

	public static void main(String[] args) {
		MyHello hello = new MyHello();
		
		try {
			Method method = hello.getClass().getDeclaredMethod("hello");
//		getClass()는 Object가 가진 class인데 해당 instance를 만들때 사용한 class의 정보를 return한다.
//		getDeclaredMethod()는 위에 class에 대한 정보를 얻고 그 정보로 부터 ()안에 method에 대한 정보를 구하라는 뜻이다.
			
			if(method.isAnnotationPresent(Count100.class)) {
//				.isAnnotationPresent()는 특정 어노테이션이 method에 적용되어 있는지 알아낼 수 있는 부분
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
