package practice7_08.sec04.exam01;

public class Computer extends Calculator {

	@Override
	public double circleMethod(double r) {
		System.out.printf("Computer 객체의 메서드실행: ");
		return Math.PI *r*r;
	}
	
}
