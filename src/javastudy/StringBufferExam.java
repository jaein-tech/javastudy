package javastudy;

public class StringBufferExam {

	public static void main(String[] args) {
//		String class는 자기 자신이 변하지 않는 불변 class이다.
//		반면에 StringBuffer class는 자기 자신이 변하는 class이다.
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello"); // append - 추가하는 method
		sb.append(" ");
		sb.append("world");
		
//		toString() method로 string값을 return
		String str = sb.toString(); 
		System.out.println(str); // hello +  + world반환
//		stringBuffer가 가지고 있는 method들은 대부분 자기 자신을 반환한다.
//		sb.append가 실행된 후에 반환되었던 것은 자기 자신이었다.
		
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello"); // .append는 자기 자신, 즉 this가 반환. 반환된 자기자신을 sb3에 넣었다.
		if(sb2 == sb3)
			System.out.println("sb2 == sb3"); // 따라서 sb2와 sb3는 같다.
//		stringBuffer는 계속해서 자기 자신을 return하는 것을 이용해 자기 자신을 호출하면서 자신의 값을 바꿔나간다. = (메소드 체이닝)
//		 메소드 체이닝(method chaining) -- 자기자신을 return해 자신의 method를 호출하는 방식
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);
	}

}
