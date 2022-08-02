package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {
	public static void main(String[] args) {
		Map<String, Integer> map= new HashMap<String, Integer>();
		
		//객체 저장
		map.put("반장", 100); //맵은 add가 아니라 push다
		map.put("홍묵", 90);
		map.put("세영", 95);
		
		
		System.out.println(map.put("세영", 100));
		System.out.println(map.put("세영", 85));
		System.out.println("크기" + map.size());
		
		//객체 찾기
		
		System.out.println("반장 키값 : " + map.get("반장"));
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet(); // key값 Set얻기
		Iterator<String> keyit = keySet.iterator();
		
		while(keyit.hasNext()) {
			String key = keyit.next();
			Integer value = map.get(key);
			System.out.println("key : " + key +",value :" + value);
		}
		
		
		//객체 삭제
		map.remove("반장");
		System.out.println(map.size());
		
		
		//entrySet() 메소드를 통해서 객체의 키와 값을 출력!
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryit = entrySet.iterator();
		
		while(entryit.hasNext()) {
			entryit.next();
				Map.Entry<String, Integer> entry = entryit.next();
				String name = entry.getKey();
				Integer num = entry.getValue();
				
				System.out.println("엔트리 키 : " + name + ", 값 : " + num);
		}
		
	}
}



















