package ch16.sec05.exam03;

public class Person {

	//객체생성시 자동으로 값주입
	public Member getMember1(Creatable creatable) {
		String id = "winter";
		Member member = creatable.create(id);
		return member;
	}
	//객체생성시 자동으로 값주입2
	public Member getMember2(Creatable2 creatable) {
		String id = "winter";
		String name = "한겨울";
		Member member = creatable.create(id,name);
		return member;
	}
}
