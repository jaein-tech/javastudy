package javaUtill.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
// 	Map은 Key와 Value를 쌍으로 저장하는 자료구조
//	Key를 이용해서 value를 찾을 수 있도록 설정되어있기 때문에 key는 중복될 수 없다.
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("001", "Kim");
		map.put("002", "lee");
		map.put("003", "choi");
		
		map.put("001", "kang"); // 위와 똑같은 키를 사용해서 안된다.
		
		System.out.println(map.size());
		
		System.out.println(map.get("001")); // kang이 출력, 같은 키로 값이 또 들어왔을때 기존의 값을 새로들어온 값으로 변경한다.
		System.out.println(map.get("002"));
		
		System.out.println(map.keySet()); // [001, 002, 003] key값을 set자료구조에 넣어준다.
		Set<String> keys = map.keySet() ;
		
		Iterator<String> iter = keys.iterator(); // iterator method사용
		while(iter.hasNext()) {                  // while문 사용
			String key =  iter.next();           // .next method사용 꺼낸 값이 key 
			String value =  map.get(key);        // key값을 받아서 map이 가지고 있는 get이라는 method이용 가능
			System.out.println(key + ":" + value);
		}
	}

}
