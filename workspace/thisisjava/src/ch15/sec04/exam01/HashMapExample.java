package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Map 컬랙션 생성
		Map<String,Integer> map = new HashMap<>();
		//객체저장 (key 는 중복될수없음 즉 홍길동은 나중에 저장된 홍길동 : 95 만  남게 됌)
		map.put("김철수", 90);
		map.put("홍길동", 90);
		map.put("안이수", 90);
		map.put("홍길동", 95);
		System.out.println("총 Entity 수 : "+map.size());
		//키로 값얻기
		String key ="홍길동";
		int val = map.get(key);
		System.out.println(val);
		System.out.println(map.get("홍길동"));
		System.out.println();
		
		//key set
		//Set 컬랙션을 얻고 , 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String k  = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k+v);
		}
		System.out.println();
		
		
		// entry set
		
		//엔트리 Set 컬랙션을 얻고 , 반복해서 키와 값을 얻기
		Set<Entry<String,Integer>>entrySet = map.entrySet();
		// 반복하기
		Iterator<Entry<String,Integer>> entryIterator = entrySet.iterator();
		// entryIterator 에 값이 있을때 까지
		while(entryIterator.hasNext()) {
			// entry 변수에 entryIterator 전달
		   Entry<String,Integer> entry = entryIterator.next();
		   
		   //entry 노드(?)에 key는 k변수 value 는 v 변수에 저장해서 출력
		   String k  = entry.getKey();
		   Integer v = entry.getValue();
		   System.out.println(k+v);
		}
		
	}
}
