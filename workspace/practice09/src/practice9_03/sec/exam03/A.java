package practice9_03.sec.exam03;

public class A {
public void method1(int a) {
	int var = 1;
	class B{
		public void method2(){
			System.out.println(var);
			System.out.println(a);
		}
	}
	
	//로컬클래스에서 외부클래스의 변수가 들어가게 되어 활용되어진다면 
	//로컬클래스안에서 는 물론이고 외부에서도 값을 변경할수없다.
	//var = 10;
	//a = 10;
	
	System.out.println("a: "+a);
	System.out.println("var: "+var);
}

public static void main(String[] args) {
	A a =new A();
	a.method1(3);
}
}
