package javaUtill.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
// 	Map�� Key�� Value�� ������ �����ϴ� �ڷᱸ��
//	Key�� �̿��ؼ� value�� ã�� �� �ֵ��� �����Ǿ��ֱ� ������ key�� �ߺ��� �� ����.
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("001", "Kim");
		map.put("002", "lee");
		map.put("003", "choi");
		
		map.put("001", "kang"); // ���� �Ȱ��� Ű�� ����ؼ� �ȵȴ�.
		
		System.out.println(map.size());
		
		System.out.println(map.get("001")); // kang�� ���, ���� Ű�� ���� �� �������� ������ ���� ���ε��� ������ �����Ѵ�.
		System.out.println(map.get("002"));
		
		System.out.println(map.keySet()); // [001, 002, 003] key���� set�ڷᱸ���� �־��ش�.
		Set<String> keys = map.keySet() ;
		
		Iterator<String> iter = keys.iterator(); // iterator method���
		while(iter.hasNext()) {                  // while�� ���
			String key =  iter.next();           // .next method��� ���� ���� key 
			String value =  map.get(key);        // key���� �޾Ƽ� map�� ������ �ִ� get�̶�� method�̿� ����
			System.out.println(key + ":" + value);
		}
	}

}
