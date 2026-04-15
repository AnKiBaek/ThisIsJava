package practice7_09.sec04.exam02;

public class Car {
	
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	// final메서드 : 재정의 불가능
	public final void stop() {
		speed = 0;
	}

}
