package practice7_03.sec04.exam01;

public class Computer extends Calculator{
	
	private double r;
	
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 메서드 실행");
		return Math.PI *r*r;
	}
	
	public void method() {
		
		System.out.println("Computer 메서드 2");
	}
	

}
