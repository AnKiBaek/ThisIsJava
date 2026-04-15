package practice6_05.sec14;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.setSpeed(40);
		System.out.println(car.getSpeed());
		
		if(!car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println(car.getSpeed());

	}

}
