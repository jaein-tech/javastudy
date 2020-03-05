package javaUtill.exam;

public class JvUtil {

	public static void main(String[] args) {
//		java의 기본제공 package중에서 많이 쓰이는 util package, 유용한 class를 많이 가지고 있다
//		ex) 자료구조와 관련된 interface와 class  / 날짜와 관련된 date, calendar
//		
//		deprecated - 더이상 지원하지 않는 기능이므로 사용을 자제

	
//		자료구조 = 자료를 저장할 수 있는 구조 
		
//		 .. Collection Interface
//		Collection Framework에서 가장 기본이 되는 인터페이스
//		+ add(Object) : boolean - 컬렉션에 자료를 추가하는 메소드
//		+ iterator() : iterator - 자료를 하나씩 꺼내기위한 이터레이터 인터페이스를 반환
//		+ size() : int - 저장된 자료의 수를 반환하는 메소드

//		Collection은 저장된 순서를 기억못함
		
//		 .. Iterator Interface
//		Collection Interface는 저장된 자료를 하나씩 꺼낼 수 있는 Iterator Interface를 반환한다
//		+ hasNext(): boolean - 꺼낼 자료가 있는 없는지 확인
//		+ next() : Object - 하나씩 자료를 꺼낼때 사용하는 메소드
		
//		 .. Set Interface
//		Collection Interface를 상속받고 중복을 허용하지 않는다.
//		+ add(Object) : boolean - 같은 자료가 있으면 false반환

//		 .. List Interface
//		Collection Interface를 상속받고 중복을 허용, 순서를 기억하는 자료구조
//		+ get(int) : Object - 순서를 기억하고 n번째 자료를 꺼내줄 수 있음

//		 .. Map Interface
//		Set Interface에 의존하며 key와 value를 가지고 있다.
//		map에 저장된 모든 key들은 중복된 값을 가지면 안된다.
//		+ put(object, object) : void - 저장할때 사용, method를 통해서 key와 value를 함께 저장
//		+ get(object) : Object - 원하는 값을 꺼낼때 사용, key를 매개변수로 받아들여 값을 꺼낸다
//		+ keySet() : Set - 자신이 가지고 있는 모든 key들에 대한 정보를 읽어올 수 있는 set을 반환하는 method


//		util package에는 위에서 설명한 interface를 구현하고 있는 class들을 많이 가지고 있다
		
//		프로그래밍을 잘 하려면 컬렉션 프레임워크에 인터페이스와 구현 클래스들을 잘 다룰줄 알아야 한다

	}

}
