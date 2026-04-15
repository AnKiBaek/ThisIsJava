package practice6_01.sec06.exam01;

public class Car {
	
	//필드선언
	String model;
	boolean start;
	int speed;
	
	Car(){
		
	}
	
	Car(boolean start , int speed){
		this("람보",start,speed);
	}
	
	Car(String model , boolean start , int speed){
		this.model = model;
		this.start = start;
		this.speed = speed;
	}

}
// 모델명을 안주면 기본값으로 '람보' 를 넣고
// 나머지는 공통 생성자에게 맡긴다.

// 이러한 방법을 생성자 체이닝이라고 부르며, 기본값을 지정할수있지만 파라미터의 대입순서 , 종류 ,갯수가
//동일하게 대입되는 생성자가있어야한다.