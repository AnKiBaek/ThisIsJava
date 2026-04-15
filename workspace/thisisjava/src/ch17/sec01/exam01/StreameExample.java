package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreameExample {

	public static void main(String[] args) {
		
		// 외부 반복자 방식 1 : for반복문 방식
		System.out.println("외부 반복자 방식");
		Set<String>set = new HashSet<>();
		set.add("홍길동");
		set.add("김길동");
		set.add("김자바");
		
		for(String item : set) {
			System.out.println(item);
		}
		System.out.println();
		// 외부 반복자 방식 2 : Iterator 방식
		System.out.println("외부 반복자 방식2");
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String item = iterator.next();
			
			System.out.println(item);
		}
		
		// 내부 반복자 방식
		System.out.println();
		System.out.println("내부 반복자 방식");
		Stream<String> stream = set.stream();
		// 스트림에서 하나씩 흘러가는 요소가 item 변수에 들어감
		stream.forEach(item -> System.out.println(item));

	}

}
