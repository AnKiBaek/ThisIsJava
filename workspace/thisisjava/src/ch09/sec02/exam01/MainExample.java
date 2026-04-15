package ch09.sec02.exam01;

public class MainExample {

	public static void main(String[] args) {
		// 외부클래스에서는 A클래스 먼저 객체화해야 B클래스 사용할수있음
		
	
		//A a = new A();
		//A.B b = a.new B();
		//b.methodB();
		
		// A생성자안에서 B객체 생성 및 b.methodB()자동호출 --> methodB() 정상호출!
		A a = new A();
		
		// A클래스 메서드에서 호출
		a.methodA();

	}

}
