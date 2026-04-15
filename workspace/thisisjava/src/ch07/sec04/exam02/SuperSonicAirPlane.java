package ch07.sec04.exam02;

public class SuperSonicAirPlane extends Airplane {
	
	//상수선언
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//상태필드 선언
	public int flyMode = NOMAL;
	
	//메소드재정의
	@Override
	public void fly() {
	
	//만약 fly 의 상태가 슈퍼 소닉이면 초음속 비행
	if(flyMode==SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
	} else {
			// 아니면 부모클래스의 fly 메서드 내용 실행
			super.fly();
	  }
	}
}
