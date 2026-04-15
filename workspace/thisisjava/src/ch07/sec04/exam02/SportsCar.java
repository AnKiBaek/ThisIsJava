package ch07.sec04.exam02;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		speed +=10;
	}
	
	//파이널 메서드는 재정의불가
//	@Override
//	public void stop() {
//		speed=-1;
//	}
}
