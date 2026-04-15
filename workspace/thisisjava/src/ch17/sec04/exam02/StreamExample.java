package ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		// 문자열 배열 스트림 얻기
		String[] strArray = {"홍길동","신민아","김길동"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.print(item+","));
		System.out.println();
		
		// 정수형 배열 스트림 얻기
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(item -> System.out.print(item+","));
		System.out.println();

	}

}
