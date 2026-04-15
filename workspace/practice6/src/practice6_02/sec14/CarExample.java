package practice6_02.sec14;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.setSpeed(-20);
		
		System.out.println(car.getSpeed());
		
		car.setStop(true);
		System.out.println(car.getSpeed());

	}

}
