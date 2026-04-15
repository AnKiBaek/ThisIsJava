package practice9_06.sec.exam01;

public class MainExample {

	public static void main(String[] args) {
		
		A a = new A();
		a.methodA();
		
		
		
		A.B b = a.new B();
		
		b.methodB();
		
	}
}
