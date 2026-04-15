package ch16.sec05.exam01;

public class LamdaExample {

	public static void main(String[] args) {
		
		// Person 객체화
		Person person = new Person();
		
		
		// 기존의 람다식
		
		System.out.println("기존의 방식");
		person.action((x,y) -> {
			return Computer.staticMethod(x, y);
		});
		
		System.out.println();
		
		//person.action((x,y) -> Computer.staticMethod(x, y));
		// 메서드 참조 형식으로 변환
		
		System.out.println("스태틱 메서드 참조방식Computer::staticMethod");
		person.action(Computer::staticMethod);
		
		System.out.println();
		
		System.out.println("인스턴스 메서드 참조방식computer::instanceMethod");
		
		Computer computer = new Computer();
		
	    person.action(computer::instanceMethod);
		
		
	}
	
	

}
