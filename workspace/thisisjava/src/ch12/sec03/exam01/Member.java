package ch12.sec03.exam01;

public class Member {

	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	//Obj 클래스메서드 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			if(id.equals(target.id)) {
				return true;
			}
		}
		
		return false;
		
	}
}
