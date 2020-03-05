package javaUtill.exam;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
//	배열과 리스트는 비슷하게 사용되는 자료구조이다.
//	list - 저장공간이 필요에 따라 자유, 데이터의 중복이 있을 수 있고 순서도 있다.
//	array - 한번 생성하면 크기 변경 불가
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
