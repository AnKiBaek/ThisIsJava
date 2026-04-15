package practice7_03.sec04.exam02;

public class Car {

	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("멈춥니다.");
		speed = 0;
	}
}
