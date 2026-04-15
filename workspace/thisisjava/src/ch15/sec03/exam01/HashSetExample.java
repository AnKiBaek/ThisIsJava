package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		//HashSet 컬랙션 생성
		Set<String> set = new HashSet<>();
		
		
		//객체생성
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java"); // 중복객체이므로 저장하지않는다.
		set.add("Spring");
		
		//저장된 객체수 출력 
		System.out.println("Set 객체의 수 : "+ set.size());
		

	}

}
