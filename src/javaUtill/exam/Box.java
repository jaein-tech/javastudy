package javaUtill.exam;

// Generic이라는 문법이 사용됨으로써 instance를 만들때 사용하는 타입을 지정하는 문법이 추가되었다.
public class Box<E> {  // 가상의 class E를 사용한다는 의미로 <E>를 추가
	private E obj;
	
	public void setObj(E obj) {
		this.obj = obj;
	}
	
	public E getObj() {
		return obj;
	}
}
