package javastudy;

public class MathExam {

	public static void main(String[] args) {
//		Math class = 수학계산을 하기 위한 class
//		생성자 자체가 private으로 되어 있기 때문에 new 연산자로 객체를 생성할 수 없다.
//		객체를 생성할 수는 없지만 method와 속성들이 static으로 되어있기 때문에 객체를 생성하지 않고도 사용할 수 있다.
		
		int value1 = Math.max(5, 30);
		System.out.println(value1);
		
		int value2 = Math.min(5, 30);
		System.out.println(value2);
		
		System.out.println(Math.abs(-10)); // 절대값
		
		System.out.println(Math.random()); // 0~1사이의 랜덤값
		
		System.out.println(Math.sqrt(25)); // .sqrt = 제곱근을 구해준다.
	}

}
