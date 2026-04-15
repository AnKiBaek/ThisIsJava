package practice9_02.sec.exam01;

public class MainExample {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(a));
	}
}
