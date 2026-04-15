package practice7_01.sec04.exam02;

public class SuperSonicAirPlane extends Airplane {

	//상수선언
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//상태필드 선언
	public int flyMode = NOMAL;
	
	//메서드 재정의
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly();
		}
		
	}
}
