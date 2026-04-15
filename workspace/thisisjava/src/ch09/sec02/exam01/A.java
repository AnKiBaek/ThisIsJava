package ch09.sec02.exam01;

public class A {
	
	//B타입 변수 생성 가능하다.
	B feild ;
	
	
	
	A(){
		B b = new B();
		b.methodB();
	}
	
	
	
	void methodA() {
		System.out.println("아래출력결과는   A메서드에서 객체화 , 메서드B 호출한거임");
		B b = new B();
		b.methodB();
		
	}
	
	
	
	
 public class B {
	 //같은 클래스여서 public 아니여도 가능
	  void methodB() {
		System.out.println("클래스 B 메서드 실행");
	}
 }
}
