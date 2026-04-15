package practice7_02.sec04.exam02;

public class Car {
	
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		speed = 0;
	}

}
