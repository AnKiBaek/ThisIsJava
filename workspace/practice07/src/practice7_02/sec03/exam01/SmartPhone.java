package practice7_02.sec03.exam01;

public class SmartPhone extends Phone{

	//SmartPhone 생성자 선언
	public SmartPhone(String model , String color) {
		//super() : 부모생성자 실행
		super();
		this.model = model;
		this.color = color;
		
		System.out.println("자식생성자 실행");
	}
}
