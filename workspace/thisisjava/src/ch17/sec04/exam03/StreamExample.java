package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
	// 스트림은 객체를 다루기 때문에 static sum 선언한다
	public static int sum;
	public static void main(String[] args) {
		
		//IntStream.range(1, 100);  1 ~ 99까지 포함
		
		//IntStream.rangeClosed(1, 100);  1 ~ 100까지 포함
		
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a->sum += a);
		System.out.println("총합: "+ sum);

	}

}
