package ch15.sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExample {

	public static void main(String[] args) {
		
		//List 불변 컬랙션 생성 (수정불가)
		List<String>immutableList1 = List.of("A","B","C");
		
		//Set
		Set<String>immutableSet1 = Set.of("A","B","C");
		
		//Map
		Map<Integer,String>immutableMap1 = Map.of(
				1,"A",
				2,"B",
				3,"C");
		
		//List 컬랙션을 불변 컬랙션으로 복사
		List<String>list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String>immutableList2 =List.copyOf(list);
		
		//Set 컬랙션을 불변 컬랙션으로 복사
		Set<String>set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String>immutableSet2 =Set.copyOf(set);
		
		//Map 컬랙션을 불변 컬랙션으로 복사
		Map<Integer,String>map = new HashMap<>();
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		Map<Integer,String>immutableMap2 =Map.copyOf(map);
		
		//배열로부터 List 불변 컬랙션 생성
		String[]arr={"A","B","C"};
		List<String>immutableList3 = Arrays.asList(arr);
		
		
		
		

	}

}
