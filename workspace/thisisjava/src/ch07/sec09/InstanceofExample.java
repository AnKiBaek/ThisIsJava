package ch07.sec09;
class A {
	public void sound() {
		System.out.println("A 클래스");
		
	}
}

class B extends A {
	@Override
	public void sound() {
		System.out.println("B클래스");
	}
	
	public void read() {
		
		System.out.println("멍멍");
	}
}
public class InstanceofExample {


	public static void main(String[] args) {
		
	  A a = new B();
	  
	  a.sound();
	  
	  if (a instanceof B b) {
		  
		  System.out.println("true");
		  b.read();
		
		
	}
	  
	   

	}

}
