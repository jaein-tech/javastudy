package javastudy;

public class Student {
//	object클래스 - 모든 클래스의 최상위 클래스
	
//	아무것도 상속받지 않으면 자동으로 object를 상속받는다. object가 가지고있는 method는 모든 클래스가 사용가능하다
//	아래는 object클래스에서 가장 많이 사용되는 method인데 사용할때 모두 Overriding해서 사용해야 한다.
//	equals - 객체가 가진 값을 비교할 때 사용
//	toString - 객체가 가지고 잇는 값을 문자열로 반환
//	hashCode - 객체의 해시코드 값 반환, 해시코드는 자료구조에서 많이 사용된다.
	
	String name;
	String number;
	int birthyYear;
	
//	상단 tab에 source클릭후 generate hashCode() and equals()누르면 자동으로 override해줌
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}
//	알고리즘을 따로 공부해야한다.


	@Override
	public boolean equals(Object obj) {
		if (this == obj)  //  method에 parameter로 들어온 object와 자기자신을 비교한다.
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())  //  getClass()는 object가 가지고 있는 method로 class에 대한 정보를 가지고 있다.
			return false;                  //  자기자신의 클래스 정보와 object의 클래스정보를 비교한다.
		Student other = (Student) obj;  //  object를 student로 형변환
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number)) // 자신의 number와 object의 number를 비교한다.
			return false;
		return true;
	}

	
//	상단 tab에 source클릭후 generate toString()누르면 자동으로 override해줌

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthyYear=" + birthyYear + "]";
	}


	// main + ctrl + space로 main method를 간단하게 생성 할 수 있다.
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.number = "1234";
		s1.birthyYear = 1995;
		
		Student s2 = new Student();
		s2.name ="홍길동";
		s2.number = "1234";
		s2.birthyYear = 1995;
		
		if(s1.equals(s2))
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1);
		System.out.println(s1.toString());//위와 같음
	}
}
