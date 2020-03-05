package javaUtill.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
//		ctrl + space
		Date date = new Date(); // 기본 생성자를 이용해서 만듬, 현재 시간과 날짜 정보를 date instance가 가지게 된다.
//		현재 날짜, 시간 출력
		System.out.println(date.toString()); // Thu Mar 05 18:37:57 KST 2020
		
		// y = 년도, M = 월, d = 일, yyyy = 4자리, MM = 두자리
		// h = 시, m = 분, s = 초
		// zzz = timezone
		// M(월)은 대문자로 표현, m(분)은 시간에서 분을 의미함
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		
		System.out.println(ft.format(date)); // 2020.03.05 at 06:37:57 오후 KST
		
		System.out.println(date.getTime()); // 1583401160553
		
		long today = System.currentTimeMillis(); // 1583401160645
		System.out.println(today);
		
//		today가 생성된 시간 - 맨위에 date 생성된 시간
		System.out.println(today - date.getTime()); // 코드가 실행되는데 걸리는 시간 구하기
	}

}
