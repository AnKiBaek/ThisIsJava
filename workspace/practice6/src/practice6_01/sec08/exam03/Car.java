package practice6_01.sec08.exam03;

public class Car {
	
	//필드선언
	int gas;
	
	//리턴값이 없는 메서드로 매개값을 받아서 gas 값 변경
	void setGas(int gas) {
		this.gas = gas;
	}
	
	//리턴값이 boolean인 메서드  gas 필드값이 0이면 false 를 0 이아니면 true를 리턴
	//while 문과 함께 사용할경우 제어하기좋다.
	boolean isLeftGas() {
		if(gas==0){
			System.out.println("가스가 없습니다.");
		}
		System.out.println("가스가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. (가스잔량:" + gas + ")");
				gas--;
			} else {
				System.out.println("멈춥니다.(가스잔량: "+ gas +")");
				
				return;
			}
		}
	}

}
