package javaUtill.exam;

public class BoxExam {

	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj(new Object());               object타입의 자식 class는 무엇이든 들어올 수 있다.
//		Object obj = box.getObj();              (부모 클래스는 자식이 가진 메소드에 접근 할 수 없다!!!!!)
//		
//		box.setObj("hello");                    box에 string값을 넣는다.
//		String str = (String)box.getObj();      문자열로 값을 넣어서 문자열로 값을 받아서 쓰고 싶지만 object타입을 반환하기로
//		System.out.println(str);                되어 있어서 왼쪽과 같이 형변환을 거친후 문자열을 받아 써야 한다.
//		                                    
//		box.setObj(1);
//		int value = (int)box.getObj();
		
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();        // instance를 만들때 <>안에 어떤 타입을 받아드릴 수 있도록 생성할건지 설정한다.
		box2.setObj("hello");                  // 그럼 <>안에 타입이 return된다.
		String str= box2.getObj();
		
		Box<Integer> box3 = new Box<>();
		box.setObj(4);
		int v2 = box3.getObj();
		
	}

}
