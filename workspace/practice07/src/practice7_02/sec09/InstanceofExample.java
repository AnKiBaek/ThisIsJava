package practice7_02.sec09;
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
		 
		 a.sound();
		 
		 // 만약 변수 a 가 B 클래스의 객체라면 B클래스타입의 변수 b 로 새로 생성해라
		 if(a instanceof B b) {
			 // 이후  B 클래스에 소속된 read() 메서드 실행
			 b.sound();
			 b.read();
		 }
		 
	}

}
