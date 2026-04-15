package practice6_08.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car car =new Car();
		Car car1 = new Car(true,200);
		
		System.out.println(car.model);
		System.out.println(car.speed);
		System.out.println(car.start);

		System.out.println(car1.model);
		System.out.println(car1.speed);
		System.out.println(car1.start);

	}

}
