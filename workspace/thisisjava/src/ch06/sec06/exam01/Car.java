package ch06.sec06.exam01;

public class Car {
	
	//필드선언
	String model ;
	boolean start ;
	int speed ;
	
	Car(){
		
	}
	
	Car(boolean start ,int speed ){
		this("람보", start, speed);
	}
	
	Car(String model,boolean start ,int speed ){
		this.model =model;
		this.speed =speed;
		this.start =start;
		
	}
//	"모델명을 안 주면 기본값으로 '람보' 넣고
//	나머지는 공통 생성자에게 맡긴다"
	
	
	
}
