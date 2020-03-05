package javaUtill.exam;

import java.util.Calendar;

// calendar class
// date class�� ������ �ذ����ش�.

public class CalendarExam {

	public static void main(String[] args) {
//		calendar�� �߻�Ŭ������ �̿ϼ��� method�� ������ �־ new�� ����� instance�� ������ �� ����.
//		getInstance() class�� ȣ���ϰ� �Ǹ� calendar�� abstract class�� �ڱ� �ڽ��� return�� ���� ���µ��� 
//		calendar�� return �ȴٴ� ���� calendar�� ��ӹ޴� �ڽ��� gregorian calendar�� instance�� ���� return �Ǵ� ���̴�.
		
		Calendar cal = Calendar.getInstance();
//		calendar�� ����� ���� ������ �ִ�
		System.out.println(cal.get(Calendar.YEAR)); // ��� ����Ҷ��� Ŭ������.OO���� ����ؾ� �Ѵ�.
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5); // �ð��� 5�ð� �߰�
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		
	}

}
