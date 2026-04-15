package ch06.sec08.exam02;

public class Computer {
	//가변길이 매개변수를 갖는 메서드
	int sum (int...values) {
	
	//배열식으로 사용하는법
	 // int sum(int[] values) {
		//sum 변수 선언
		int sum =0;
		
		//values는 배열타입의 변수처럼이용
		for(int i=0; i<values.length;i++) {
			sum += values[i];
		}
		
		return sum;
	}

}
