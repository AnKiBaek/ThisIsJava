package ch09.sec04.exam03;

public class A {
	public void method1(int arg) {
		int var =1;
		
		// 로컬클래스 로컬 변수 사용시 바꿔치기 안됌
		class B{
			void method2() {
				System.out.println("arg: "+ arg);
				System.out.println("var"+ var);
			}
		}
		//로컬클래스에서 로컬 변수가 한번들어가면 로컬변수의값은 파이널 특성을 가지기 떄문에 수정할경우 오류발생 외부에서도 바꿀수없다.
//		arg =2;
//		var =2;
		
		System.out.println("arg: "+ arg);
		System.out.println("var"+ var);
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.method1(3);
	}

}
