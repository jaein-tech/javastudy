package javastudy;

public class WrapperExam {

	public static void main(String[] args) {
//		java는 기본적으로 다양한 package를 제공한다.
//		그중에서 가장 중요한 package인 java.lang package를 알아보자
		
//		java.lang package는 import하지 않아도 사용할 수 있다.
//		[wrapper, object, string, stringBuffer, stringBilder, system, math, ...등]
		
//		wrapper는 기본형 데이터 타입을 객체로 변환시킬때 사용한다.
//		wrapper라는 실제 class가 존재하는것은 아니고 8개의 기본형 데이터 타입(boolean, byte, char, ...등)을
//		각각 객체로 변환시킬 수 있는 class가 존재하는데 각각의 class를 모두 모아 wrapper class라고 한다.
//		 wrapper class -- 기본형 데이터 타입의 객체화를 가능하게 도와주는 class들
		
		int i = 5; // 기본형타입
		Integer i2 = new Integer(5); // 실제 int를 객체로 바꿔주는 wrapper class중 하나
		// i는 기본형 타입이기 때문에 객체가 아니다.(참조형 아님)
		// i2와 같이 선언해야 참조형으로 사용할 수 있다.
		
		Integer i3 = 5; // 원래 기본형이지만 자동으로 Integer로 형변환된 상태 = (오토박싱)
		//오토박싱 == 기본 타입 데이터를 객체 타입의 데이터로 자동 형변환 시켜주는 기능
		
		int i4 = i3.intValue();

		int i5 = i3; // java5 이후부터 위처럼 intValue()라는 method를 호출하지 않아도 바로 꺼내서 사용가능하다. = (오토언박싱)
		
		// 오토언박싱 == 오토박싱과 반대로 객체타입의 데이터를 기본형 타입데이터로 자동 형변환
	}

}
