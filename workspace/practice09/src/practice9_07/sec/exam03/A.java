package practice9_07.sec.exam03;

public class A {
 public void method1(int arg) {
	 int var =30;
	 class B {
		 public void method2() {
			 System.out.println(var);
			 System.out.println(arg);
		 }
	 }
//	 var =30;
//	 arg =30;
	 System.out.println(arg);
	 System.out.println(var);
 }
 public static void main(String[] args) {
	A a =new A();
	a.method1(20);
}
}
