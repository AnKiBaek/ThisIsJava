package ch09.sec03.exam01;

public class A {
	
	// 중첩 클래스 선언
	static class B {
		void methodB() {
			System.out.println("메소드B실행");
		}
	}
	
	// B 타입 필드선언
	B field = new B();
	
	// A 객체없어도 static 클래스이기떄믄에 정적필드 선언 가능
	static B field2 = new B();
	
	A(){
		
	}
	
	void method1() {
		B field1 = new B();
	}
	
	// 같은 원리이다.
	static void method2() {
		B field1 = new B();
	}

}
