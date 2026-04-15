package practice7_05.sec04.exam02;

public class SuperSonicPlane extends AirPlane{

	public static final int SUPERSONIC = 2;
	public static final int NOMAL = 1;
	
	public int flyMode = NOMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly();
		}
		
	}
}
