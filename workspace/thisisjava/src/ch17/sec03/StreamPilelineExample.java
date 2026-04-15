package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPilelineExample {

	public static void main(String[] args) {
		//list
		List<Student>list = Arrays.asList(
				new Student("홍길동",10),
				new Student("신라면", 20),
				new Student("신길동", 30));
		//list2
		List<Student>list2 = Arrays.asList(
				new Student("홍길동",10),
				new Student("신라면", 50),
				new Student("신길동", 30));
		
		
		//방법 1
		//list 스트림만들기
		Stream<Student>studentStream = list.stream();
		
		// 중간처리
		// 정수값으로 score 값만 골라내는 스트림 생성 ( IntStream )
		IntStream scoreStream =studentStream.mapToInt(student->student.getScore());
		
		// 최종 평균 구하기
		// score 스트림 나눠서 double 타입으로 변경
		double avg = scoreStream.average().getAsDouble();
		
		System.out.println("방법1 평균 : "+ avg);
		
		//방법 2 ( 메서드 체이닝 방식 )
		// 간략하게
		double avg2 = list2.stream().mapToInt(student -> student.getScore())
				.average()
				.getAsDouble();
		
		System.out.println("방법2 평균 : "+ avg2);
		
		

	}

}
