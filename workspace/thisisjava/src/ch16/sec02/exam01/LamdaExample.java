package ch16.sec02.exam01;

public class LamdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		// person.action() 메서드는 인스턴스 멤버여서 매개변수를 필요로 한다.
		// 그안에는 Workable 인터페이스 객체만 들어갈수있는데,
		// Workable 인터페이스는 람다식으로 구현가능한, 즉 추상메서드가 1개인 인터페이스이다.
		
		
		// 실행문이 두개 이상인 경우 중괄호 필요
		person.action(()->{
			System.out.println("출근을합니다.");
			System.out.println("프로그래밍을 합니다.");
		});
		
		//실행문이 한개일 경우
		person.action(()->System.out.println("퇴근합니다."));
		

	}

}
