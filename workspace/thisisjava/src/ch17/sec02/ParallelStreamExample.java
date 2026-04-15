package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		 
		List<String>list = new ArrayList<>();
		for(int i = 0 ; i<1000 ; i++) {
			list.add("홍길동"+i);
		}
	
		
		
		//병렬처리 : parallelStream() 
		Stream<String> stream = list.parallelStream();
		// 요소값의 갯수기반 현재 CPU 의 코어 성능에 맞게 멀티스레드 작업
		// 요소값 : 스레드의 이름 출력
		stream.forEach(name -> {Thread thread =Thread.currentThread();
		System.out.println(name +": "+thread.getName());} );
		

	}

}
