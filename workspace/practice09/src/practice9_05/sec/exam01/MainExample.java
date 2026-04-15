package practice9_05.sec.exam01;

public class MainExample {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		
		b.methodB();

	}

}
