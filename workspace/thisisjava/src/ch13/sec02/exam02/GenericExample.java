package ch13.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {
		//1.대여 인터페이스에 제네릭타입으로 임시 타입을주고 Rentable<P> 제네릭타입 추상메서드 P rent(); 선언을 한다.
		//2.대여할 객체의 클래스를 만든다. Home , Car
		//3.대여할 객체의상속과 대여 인터페이스의 구현을위한 클래스를 만든다. HomeAgency , CarAgency
		//4.구현 클래스에서는 rent() 를 오버라이드해서 리턴값으로 Home 과  Car 의 객체를 넘긴다.
		//4.실행클래스에서 각각의 구현클래스를 객체화 함으로써 박싱하고
		//5. 대여객체의 타입과 변수를 선언후 구현객체의 rent(); 를통해 각각의 대여객체를 주입받는다.
		
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car mycar = carAgency.rent();
		
		mycar.run();

	}

}
