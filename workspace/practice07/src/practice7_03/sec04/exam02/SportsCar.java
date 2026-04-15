package practice7_03.sec04.exam02;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// final 메서드는 재정의 불가
}
