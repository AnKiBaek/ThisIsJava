package practice7_04.sec04.exam02;

public class Car {
	
	public int speed;
	
	public void speedUp() { 
		speed += 1;
	}
	
	// final 메서드는 오버라이드 불가능
	public final void stop () {
		speed = 0;
		
	}

}
