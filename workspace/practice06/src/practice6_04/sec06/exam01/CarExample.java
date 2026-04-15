package practice6_04.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		//객체생성
		Car car = new Car();
		
		Car hyendaiCar = new Car(true,200);
		
		// 객체 값 출력
		System.out.println("현다이 차 값 출력");
		System.out.println(hyendaiCar.model);
		System.out.println(hyendaiCar.start);
		System.out.println(hyendaiCar.speed);
		
		System.out.println();
		System.out.println("기본 생성자로 출력한 값");
		System.out.println(car.model);
		System.out.println(car.start);
		System.out.println(car.speed);

	}

}
