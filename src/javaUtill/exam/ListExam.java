package javaUtill.exam;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
//	�迭�� ����Ʈ�� ����ϰ� ���Ǵ� �ڷᱸ���̴�.
//	list - ��������� �ʿ信 ���� ����, �������� �ߺ��� ���� �� �ְ� ������ �ִ�.
//	array - �ѹ� �����ϸ� ũ�� ���� �Ұ�
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Kim");
		list.add("Kang");
		list.add("Kim");
		
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
	}

}
