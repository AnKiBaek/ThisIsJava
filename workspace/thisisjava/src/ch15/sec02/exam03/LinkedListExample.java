package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	
	//ArrayList의 경우 데이터의 삽입삭제시 모든인덱스에 영향을 주기떄문에
	//데이터량이 많아지면 병목현상이생긴다.
	//LinkedList의 경우 데이터의 삽입삭제시 연결정보만 바꿔주기때문에 시간이 오래걸리지않는다.
	//ArrayList의 경우 조회용으로는 LinkedList 를 압도한다.
	//LinkedList 의 경우 삽입삭제는 간편하지만 위치정보가 난잡하게 엮여있어서 조회는오래걸린다.
	// 반면 ArrayList 의경우엔 삽입삭제는 오래걸리지만 각자 위치에 인덱스가 순서대로 정렬되어있기 때문에
	// 조회는 압도적으로 ArrayList가 빠르다.
	
	public static void main(String[] args) {
		//ArrayList 객체 생성
		List<String>list1 = new ArrayList<>();
		//LinkedList 객체 생성
		List<String>list2 = new LinkedList<>();
		
		
		// 연산시작 시간
		// 연산끝 시간
		long startTime;
		long finishTime;
		
		
		//연산시작
		startTime = System.nanoTime();
		
		//ArrayList
		for(int i = 0 ; i <= 100000; i++) {
			list1.add(0,String.valueOf(i));
		}
		
		//연산끝
		finishTime = System.nanoTime();
		
		System.out.println("ArrayList 걸린시간: "+ (finishTime - startTime));
		
	    //연산 시작
		startTime = System.nanoTime();
		
		
		//LinkedList
		for(int i = 0 ; i <= 100000; i++) {
			list2.add(0,String.valueOf(i));
		}
		
		//연산끝
		finishTime = System.nanoTime();
		
		System.out.println("LinkedList 걸린시간: "+ (finishTime-startTime));

	}

}
