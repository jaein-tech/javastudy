package javaUtill.exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {
//	��ü�� �����Ҷ� �پ��� ���丮 �޼ҵ带 ����Ѵ�.
//	��ü �ڱ� �ڽ��� Ư�� ��Ҹ� ������ instance�� object�� �����ϴ� ��쿡 of method�� ȣ���ϸ� �ȴ�.
//	�ٸ� Ÿ������ �����Ҵ�� from�̶�� method�� ȣ���ϸ� �ȴ�.
//	string���� parameter�� �޾Ƽ� ����ϰ� �ȴ�.
	public static void main(String[] args) {
		
		LocalDateTime timePoint = LocalDateTime.now();
		System.out.println(timePoint); // ���� �ð��� ���� ������
		
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);
		System.out.println(ld1); // 2012-12-12
		
		LocalTime lt1 = LocalTime.of(17, 18);
		System.out.println(lt1); // 17:18, 17�� 18��
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2); // 10:15:30, 10��15��30��
		
		LocalDate theDate = timePoint.toLocalDate();
		System.out.println(theDate); // 2020-03-05, ��,��,�� ���
		Month month = timePoint.getMonth();
		System.out.println(timePoint.getMonth()); // MARCH
		System.out.println(month.getValue()); // 3
		System.out.println(timePoint.getHour()); // �ð��� ���� ����
		
		// get~ method�� ���� �������� ������ �� �� �ִ�.

	}

}
