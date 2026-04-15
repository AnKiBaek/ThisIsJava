package practice7_01.sec09;
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
public class InstanceofExample {

 
	public static void main(String[] args) {
		A a = new B();
		
		A a1 = new A();
		if (a instanceof B b) {
			System.out.println("true");
			b.read();
		}
		
		System.out.println(a1 instanceof B);
	}
}
