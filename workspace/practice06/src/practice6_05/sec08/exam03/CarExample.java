package practice6_05.sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		// 가스를 5로 충전
		car.setGas(-5);
		
		// car.isLeftGas() 메서드가 true 를 리턴하면 run()메서드 실행
		if(car.isLeftGas()) {
			
			System.out.println("출발합니다.");
			// gas가 0아래가 되면 return을 만나서 메서드 탈출 후 아래 "주유하세요" 출력문으로 넘어감
			car.run();
		} 
		System.out.println("주유하세요");

	}

}
