package javastudy;

public class StringExam2 {

	public static void main(String[] args) {
//		
		String str1 = "hello world";
		String str2 = str1.substring(5); // substring(n); n번째 문자열부터 잘라서 뒤에 내용 반환
		System.out.println(str1);
		System.out.println(str2);

		String str3 = str1 + str2; 
		System.out.println(str3);
//		문자열은 + 연산을 실행할 수 있는데, 문자열을 더할때마다 
//		java는 자동으로 아래와 같이 StringBuffer 객체를 만들고 이 객체가 가진 append method를 사용하여 문자열을 누적시킨 후에 
//		toString으로 다시 string객체로 변환 시킨 후에 return을 하는거다.
		
		String str4 = new StringBuffer().append(str1).append(str2).toString(); // 위 str3와 같은 코드
		System.out.println(str4);
		
//		string class의 문제점
		String str5 = "";
		for(int i = 0; i < 100; i++) { // 반복문에서는 반복할때마다 내부적으로 new StringBuffer 객체를 생성해 내야 한다.
			str5 = str5 + "*";         // java에서는 new연산자가 많이 사용될수록 프로그램에 속도가 느려진다.
		}
		System.out.println(str5);      // 문자열을 반복문 안에서 사용하는것은 성능상으로 문제가 생길 수 있기때문에 반드시 피한다.
		
//		차라리 StringBuffer를 하나 만들어서 아래와 같이 작성하는것이 훨씬 더 효율적이다. (위에 str5와 결과는 같다.)
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 100; i++) {
			sb.append("*");
		}
		String str6 = sb.toString();
		System.out.println(str6);
	}

}
