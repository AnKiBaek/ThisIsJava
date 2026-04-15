package ch15.sec03.exam02;

public class Member {

	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//hashCode 재정의
	@Override
	public int hashCode() {
		// name 해시코드의 값과 age 만 같다면 Member클래스에서 만들어진 객체가 여러개있어도,
		// 동일한 해시코드가 리턴된다.
		return name.hashCode()+age;
	}
	
	//equals 재정의
	@Override
	public boolean equals(Object obj) {
		
		// 대입되는 객체가 멤버인지 확인한다. 이후  target 객체와 Member 객체의 값이 같은지 비교
		if(obj instanceof Member target) {
			// 이후  target 객체와 Member 객체의 값이 같은지 비교한다음 true 가 반환되면
			// 마지막에 true 를 리턴한다.
			return target.name.equals(name)&&(target.age==age);
		} else {
			//아니면 false 를 리턴한다.
			return false;
		}
			
		
	}

}
