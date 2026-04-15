package practice6_06.sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setOil(10);
		
		if (car.isLeftOil()) {
			System.out.println("출발합니다.");
			car.run();
		}
		
		System.out.println("오일을 채우세요");
	}

}
