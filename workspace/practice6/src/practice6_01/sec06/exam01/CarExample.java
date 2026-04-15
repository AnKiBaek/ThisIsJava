package practice6_01.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		// 객체생성
		Car car = new Car();
		Car car2 = new Car(true,300);
		
		
		//car 객체 필드읽기
		System.out.println(car.model);
		System.out.println(car.start);
		System.out.println(car.speed);
		
		System.out.println();
		
		//car2 객체 필드읽기

		System.out.println(car2.model);
		System.out.println(car2.start);
		System.out.println(car2.speed);
		
		
	}

}
