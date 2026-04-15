package practice6_06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = new Car(true,200);
		
		System.out.println(car.model);
		System.out.println(car.start);
		System.out.println(car.speed);
		
		
		System.out.println();

		System.out.println(car2.model);
		System.out.println(car2.start);
		System.out.println(car2.speed);
		
	}

}
