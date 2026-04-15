package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {

	public static void main(String[] args) {
		
		//문장 스트림을 단어 스트림으로 변환
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("i am a best developer");
		//list1 스트림으로 변환
		list1.stream().
		//공백 기준으로 요소 나누기
		flatMap(data -> Arrays.stream(data.split(" "))).
		//출력
		forEach(word -> System.out.println(word));
		
		System.out.println();
		
		//문자열 숫자 목록 스트림을 수자 스트림으로 변환
		List<String>list2 = Arrays.asList("10,20,30","40,50");
		//list2 스트림 만들기
		list2.stream().
		
		flatMapToInt(data -> {
			//문자열 배열 "," 기준으로 나누기 (5개)
			String[] strArr =data.split(",");
			// 정수 배열 생성 strArr 길이만큼
			int[] intArr = new int[strArr.length];
			// intArr[i] 인덱스에 strArr[i] 번 째 값을 나눠서 저장
			for(int i = 0 ; i < strArr.length ; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			//정수배열 값 리턴
			return Arrays.stream(intArr);
		})
		// number에담아서 출력
		.forEach(number -> System.out.println(number));

	}

}
