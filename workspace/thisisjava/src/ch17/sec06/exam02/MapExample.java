package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {

	public static void main(String[] args) {
		//배열생성
		int[] intArray = {1,2,3,4,5};
		//스트림 생성
		IntStream intStream = Arrays.stream(intArray);
		intStream
		//double 타입 스트림으로 변경
		.asDoubleStream().forEach(d -> System.out.println(d));
		
		System.out.println();
		
		intStream = Arrays.stream(intArray);
		//int 타입 요소  -> INTEGER(wrraper) 타입으로 변경  
		intStream.boxed()
		//값 출력
		.forEach(w -> System.out.println(w.intValue()));

	}

}
