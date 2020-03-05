package javaUtill.exam;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class SetExam {
//	중복이 없고 순서도 없는 자료구조, Hashset, Treeset
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		boolean flag1 = set1.add("hello");
		boolean flag2 = set1.add("bye");
		boolean flag3 = set1.add("hello");
		
		System.out.println(set1.size());
		
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
                                                 // set의 부모 class인 collection이 가지고 있는
		Iterator<String> iter = set1.iterator(); // iterator 인터페이스를 이용하면 값을 하나씩 꺼내볼 수 있다.
		while(iter.hasNext()) { // hasNext라는 method를 가지고 있는데 지금 현재 이 set자료구조에 데이터가 있는지 확인하는 method
			String str = iter.next();
			System.out.println(str);
		}
	}

}
