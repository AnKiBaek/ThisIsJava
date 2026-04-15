package practice7_04.sec04.exam02;

import practice7_01.sec04.exam02.SuperSonicAirPlane;

public class SuperSonicAirPlaneExample {
	
	public static void main(String[] args) {
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperSonicAirPlane.NOMAL;
		sa.fly();
		sa.land();
	}

}
