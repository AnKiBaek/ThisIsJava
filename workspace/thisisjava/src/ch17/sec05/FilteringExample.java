package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<String>list = new ArrayList<>();
		list.add("김희민");
		list.add("이병건");
		list.add("이대호");
		list.add("이병건");
		list.add("안유진");
		
		
		//중복요소제거 (이병건 제거)
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();
		
		//"이" 로 시작하는 요소만 찾기
		list.stream().filter(n-> n.startsWith("이"))
		.forEach(n-> System.out.println(n));
		System.out.println();
		
		
		//두개 동시에 쓰기
		list.stream().distinct()
		.filter(n->n.startsWith("이"))
		.forEach(n -> System.out.println(n));

	}

}
