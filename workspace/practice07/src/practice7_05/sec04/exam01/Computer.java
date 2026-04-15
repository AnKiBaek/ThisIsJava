package practice7_05.sec04.exam01;

public class Computer extends Calculator{
 
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 메서드 실행");
		// TODO Auto-generated method stub
		return Math.PI *r*r;
	}
	
}
