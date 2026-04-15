package practice6_08.sec08.exam03;

public class Car {
	
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("연료가없습니다");
			return false;
		}
		System.out.println("연료가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. 남은연료: " + gas);
				gas--;
			} else {
				System.out.println("멈춥니다. 남은연료: " +gas);
				return;
			}
		}
	}

}
