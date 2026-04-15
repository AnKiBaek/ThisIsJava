package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		//객체생성
		Car car = new Car();
		Car car1 = new Car(true,300);
		
		//car 객체 필드값읽기
		System.out.println("모델명: " + car.model);
		System.out.println("시동여부: " + car.start);
		System.out.println("현재속도: "+ car.speed);
		
		//car 객체 필드값읽기
				System.out.println("car1 모델명: " + car1.model);
				System.out.println("car1 시동여부: " + car1.start);
				System.out.println("car1 현재속도: "+ car1.speed);
		
		car.speed=400;
		
		car.model = "아우디";
		
	
		car.start = true;
		//car 객체 필드값읽기
				System.out.println("모델명: " + car.model);
				System.out.println("시동여부: " + car.start);
				System.out.println("현재속도: "+ car.speed);
				
		
		
		
		
		

	}

}
