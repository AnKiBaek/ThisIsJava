package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//HashSet 컬랙션 생성 타입은 Member로.
		Set<Member> set = new HashSet<>();
		
		// Member 객체 set 컬랙션에 추가.
		set.add(new Member ("홍길동",30));
		set.add(new Member ("홍길동",30));//서로 다른 객체이지만 동등한 값을 가졌기 때문에 set에는 하나만 저장한다.
		
		//저장된 Set객체의 수 출력
		System.out.println("Set 객체 갯수: " + set.size()+"개");

	}

}
