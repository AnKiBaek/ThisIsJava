package practice6_03.sec14;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.setSpeed(40);
		
		if(!car.isStop()) {
			car.setStop(true);
		}

	}

}
