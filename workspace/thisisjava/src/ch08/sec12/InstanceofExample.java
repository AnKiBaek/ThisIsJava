package ch08.sec12;

public class InstanceofExample {

	public static void main(String[] args) {
		 
		// 구현객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		//ride() 메소드 호출시 구현 객체를 매개값으로 전달
		ride(taxi);
		ride(bus);
	}
	//스태틱 메서드 ride()정의
	public static void ride(Vehicle vehicle) {
		//만약 vehicle 인스턴스 변수가 Bus객체를 참조한다면 Bus 로 다운캐스팅
		// 변수 bus에 담겠다.
		if(vehicle instanceof Bus bus) {
			//Bus객체 메소드 호출
			bus.checkFare();
		}
		// vehicle변수에 객체를 대입받아서 오버라이드된 run 을 실행한다.
		vehicle.run();
	}
}
