package javaUtill.exam;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class SetExam {
//	�ߺ��� ���� ������ ���� �ڷᱸ��, Hashset, Treeset
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		boolean flag1 = set1.add("hello");
		boolean flag2 = set1.add("bye");
		boolean flag3 = set1.add("hello");
		
		System.out.println(set1.size());
		
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
                                                 // set�� �θ� class�� collection�� ������ �ִ�
		Iterator<String> iter = set1.iterator(); // iterator �������̽��� �̿��ϸ� ���� �ϳ��� ������ �� �ִ�.
		while(iter.hasNext()) { // hasNext��� method�� ������ �ִµ� ���� ���� �� set�ڷᱸ���� �����Ͱ� �ִ��� Ȯ���ϴ� method
			String str = iter.next();
			System.out.println(str);
		}
	}

}
