package practice9_02.sec.exam01;

public class A {
public A() {
	B b = new B();
	b.methodB();
}
public class B {
	void methodB() {
		System.out.println("클래스 B 메서드 실행");
	}
}
}
