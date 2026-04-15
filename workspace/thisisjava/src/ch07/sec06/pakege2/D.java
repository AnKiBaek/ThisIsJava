package ch07.sec06.pakege2;

import ch07.sec06.pakege1.A;

public class D extends A {

	//생성자 선언
	public D() {
		
		//A 생성자호출의 바른예
		super();
		
	}
	
	//메소드 선언
	public void method1() {
		//A 필드값 변경
		this.field = "value";
		//A 메소드 호출
		this.method();
	}
	
	//메소드 선언
	public void method2() {
//		A a = new A(); <<< 불가능
	
	}
}
