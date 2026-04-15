package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		//Car 객체 생성
		Car car = new Car();
		
		//Tire 객체장착
		car.tire = new Tire();
		car.run();
		
		// 한국타이어
		car.tire = new HankookTire();
		car.run();
		
		// 금호 타이어
		car.tire = new KumhoTire();
		car.run();


	}

}
