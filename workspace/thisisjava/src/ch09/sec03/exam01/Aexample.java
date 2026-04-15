package ch09.sec03.exam01;

public class Aexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정적 네스티드클래스 의 객체화 방법
		A.B b = new A.B();
		
		// 네스티드클래스는 단독으로 사용할수없다.
		b.methodB();

	}

}
