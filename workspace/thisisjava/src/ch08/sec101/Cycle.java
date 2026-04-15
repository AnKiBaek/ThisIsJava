package ch08.sec101;

public interface Cycle {

	//회사마다 다른세팅이필요한 기능들
	void setDrailer();
	void setBreak();
	
	
	
	
	//공통된 구현부를 가지는 기능들
	default void pedaling(boolean Rolling) {
		if(Rolling) {
			System.out.println("페달링을 합니다");	
		} else {
			System.out.println("페달링을 멈춥니다.");
		}
		
	}
	
	default void breaking() {
		System.out.println("브레이크를 겁니다.");
	}
	
	default int gireUp(int gear) {
		if(gear>8) {
			gear = 8;
			System.out.println("더이상 기어를 올릴수없습니다.");
		}
		gear++;
		System.out.println("기어비를 올립니다. 현재기어: "+gear);
		
		return gear; 
	}
	
	default int gireDown(int gear) {
		if(gear<0) {
			gear = 0;
			System.out.println("더이상 기어를 내릴수없습니다.");
		}
		gear--;
		System.out.println("기어비를 내립니다. 현재기어: "+gear);
		
		return gear; 
	}
	
	
}
