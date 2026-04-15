package practice6_04.sec06.exam01;

public class Car {
	
	String model;
	boolean start;
	int speed;
	
	Car(){
		
	}
	Car(boolean start, int speed){
		this("아반테",start,speed);
	}
	Car(String model, boolean start, int speed){
		this.model = model;
		this.start = start;
		this.speed = speed;
	}

}
