package practice7_03.sec09;
class A {
	public void sound() {
		System.out.println("A클래스");
	}
	
}

class B extends A {
	@Override
	public void sound() {
		// TODO Auto-generated method stub
	System.out.println("B클래스");
	}
	
	public void read() {
		System.out.println("멍멍");
	}
}

public class InstanceOfExample {

	public static void main(String[] args) {
		A a = new B();
		
		a.sound();
		
		if(a instanceof B b) {
			b.read();
		}
	}
}
