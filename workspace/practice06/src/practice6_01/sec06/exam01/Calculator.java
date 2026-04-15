package practice6_01.sec06.exam01;

public class Calculator {

	//리턴값이 없는 메서드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	//리턴값이 없는 메서드 
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//호출시  두정수 값을 전달 받고 
	//호출한 곳으로 결과값 int 타입 값을 리턴하는 메서드 
	int plus(int x, int y ) {
		int result = x+y;
		return result; // 리턴값 지정
	}
	
	double divide(int x , int y ) {
		double result = (double)x /(double)y; 
		return result;
	}
}
