package practice7_01.sec03.exam01;

public class SmartPhone extends Phone {
	
	// 자식 생성자 선언
	public SmartPhone(String model, String color) {
		super();
		this.color = color;
		this.model = model;
		
		System.out.println("SmartPhone 생성자 실행");
	}

}
