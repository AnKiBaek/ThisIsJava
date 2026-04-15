package practice9_03.sec.exam01;

public class MainExample {

	public static void main(String[] args) {
		A a = new A();
		a.method();
		
		
		A.B b = a.new B();
		b.methodB();
	}
}
