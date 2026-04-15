package practice6_07.sec14;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setSpeed(40);
		System.out.println(car.getSpeed());
		if(!car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println(car.getSpeed());

	}

}
