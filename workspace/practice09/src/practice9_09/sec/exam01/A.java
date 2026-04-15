package practice9_09.sec.exam01;

public class A {

	A (){
		System.out.println("A 생성자에서 B클래스에 들은 스태틱메서드 methodB 실행");
		
		B.methodB();
	}
	
	public class B {
		public static void methodB() {
			System.out.println("static 메서드B");
		}
	}
}
