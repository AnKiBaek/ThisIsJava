package ch06.sec08.exam03;

public class Car {

	//필드선언
	int gas;
	
	//리턴값이 없는 메소드로 매개값을 받아서 gas  필드값 변경
	void setGas(int gas) {
		this.gas = gas;
	}
	
	//리턴값이 boolean인 메소드 gas 필드값이 0 이면 false 를 0 이아니면 true를 리턴
	//while 문과 함께 사용시 상태를 제어하기좋다
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스가없습니다.");
			return false;
		}
		System.out.println("가스가있습니다");
		return true;
	}	
	
	
	void run() {
	//리턴값이 없는 메소드 gas 필드값이 0이면 return 문으로 메서드를 종료
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. (가스잔량: "+gas+")");
				gas--;
				
			} else {
				System.out.println("멈춤니다. (가스잔량: "+gas+")");
				//메서드 종료
				return ;		
	          }
		}
	}
}
