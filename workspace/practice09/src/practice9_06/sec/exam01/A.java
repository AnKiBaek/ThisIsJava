package practice9_06.sec.exam01;

public class A {
	
	public void methodA() {
		System.out.println("A메서드");
	}
	
	
	A(){
		B b = new B();
		b.methodB();
	}
	
	
	
public class B {
	public void methodB () {
		System.out.println("B메서드");
	}
}
}
