package javaUtill.exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {
//	객체를 생성할때 다양한 팩토리 메소드를 사용한다.
//	객체 자기 자신의 특정 요소를 가지고 instance와 object를 생성하는 경우에 of method를 호출하면 된다.
//	다른 타입으로 변경할대는 from이라는 method를 호출하면 된다.
//	string값을 parameter로 받아서 사용하게 된다.
	public static void main(String[] args) {
		
		LocalDateTime timePoint = LocalDateTime.now();
		System.out.println(timePoint); // 현재 시간에 대한 데이터
		
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);
		System.out.println(ld1); // 2012-12-12
		
		LocalTime lt1 = LocalTime.of(17, 18);
		System.out.println(lt1); // 17:18, 17시 18분
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2); // 10:15:30, 10시15분30초
		
		LocalDate theDate = timePoint.toLocalDate();
		System.out.println(theDate); // 2020-03-05, 년,월,일 출력
		Month month = timePoint.getMonth();
		System.out.println(timePoint.getMonth()); // MARCH
		System.out.println(month.getValue()); // 3
		System.out.println(timePoint.getHour()); // 시간에 대한 정보
		
		// get~ method를 통해 여러가지 정보를 얻어낼 수 있다.

	}

}
