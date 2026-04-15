package ch16.sec02.exam01;

public class Person {

	// Workable 인터페이스를 구현한 객체를 파라미터로 넣으면 work() 실행
	// 즉 람다식도 활용가능
	public void action(Workable workable) {
		workable.work();
	}
}
