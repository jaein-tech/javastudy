package javaUtill.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
//		ctrl + space
		Date date = new Date(); // �⺻ �����ڸ� �̿��ؼ� ����, ���� �ð��� ��¥ ������ date instance�� ������ �ȴ�.
//		���� ��¥, �ð� ���
		System.out.println(date.toString()); // Thu Mar 05 18:37:57 KST 2020
		
		// y = �⵵, M = ��, d = ��, yyyy = 4�ڸ�, MM = ���ڸ�
		// h = ��, m = ��, s = ��
		// zzz = timezone
		// M(��)�� �빮�ڷ� ǥ��, m(��)�� �ð����� ���� �ǹ���
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		
		System.out.println(ft.format(date)); // 2020.03.05 at 06:37:57 ���� KST
		
		System.out.println(date.getTime()); // 1583401160553
		
		long today = System.currentTimeMillis(); // 1583401160645
		System.out.println(today);
		
//		today�� ������ �ð� - ������ date ������ �ð�
		System.out.println(today - date.getTime()); // �ڵ尡 ����Ǵµ� �ɸ��� �ð� ���ϱ�
	}

}
