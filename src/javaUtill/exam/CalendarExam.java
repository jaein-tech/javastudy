package javaUtill.exam;

import java.util.Calendar;

// calendar class
// date class의 단점을 해결해준다.

public class CalendarExam {

	public static void main(String[] args) {
//		calendar는 추상클래스라 미완성된 method를 가지고 있어서 new를 사용해 instance를 생성할 수 없다.
//		getInstance() class를 호출하게 되면 calendar가 abstract class라 자기 자신을 return할 수는 없는데도 
//		calendar가 return 된다는 것은 calendar를 상속받는 자식인 gregorian calendar에 instance를 만들어서 return 되는 것이다.
		
		Calendar cal = Calendar.getInstance();
//		calendar는 상수를 많이 가지고 있다
		System.out.println(cal.get(Calendar.YEAR)); // 상수 사용할때는 클래스명.OO으로 사용해야 한다.
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5); // 시간에 5시간 추가
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		
	}

}
