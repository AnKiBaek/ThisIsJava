package practice6_04.sec08.exam03;

public class CarExample {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setGas(0);
		
		if(car.isLeftGas()) {
			System.out.println("출발합니다");
			car.run();
			
		}
		System.out.println("기름을 보충하세요");
	}

}
