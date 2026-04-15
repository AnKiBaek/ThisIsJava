package practice7_09.sec04.exam01;

public class Computer extends Calculator{

	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 메서드실행");
		return Math.PI *r*r;
	}
}
