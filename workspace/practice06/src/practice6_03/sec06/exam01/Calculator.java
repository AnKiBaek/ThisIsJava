package practice6_03.sec06.exam01;

public class Calculator {

	//리턴값이 없는 메서드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 정수 두개를 파라미터로 받아서 정수값을 리턴하는 메서드
	int plus (int x , int y) {
		int result = x + y;
		
		return result;
	}
	
	// 정수값 두개를 받아서 더블 값을 리턴하는 메서드
	double divide (int x , int y) {
		double result = (double)x /(double) y;
		
		return result;
	}
	
}
