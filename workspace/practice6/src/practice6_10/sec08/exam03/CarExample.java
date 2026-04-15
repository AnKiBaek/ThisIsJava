package practice6_10.sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.setGas(10);
		
		if(car.isLeftGas()) {
			System.out.println("출발합니다");
			car.run();
		}
		System.out.println("연료를 채워주세요");

	}

}
