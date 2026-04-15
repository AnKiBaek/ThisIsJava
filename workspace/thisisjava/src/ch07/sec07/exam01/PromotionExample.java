package ch07.sec07.exam01;

class Hero{
	
	public void attak() {
		System.out.println("공격실행");
	}
}

class Warrior extends Hero{
	@Override
	public void attak() {
	System.out.println("검으로 공격");
	}
}

class Mage extends Hero{
	@Override
	public void attak() {
	System.out.println("스태프로 공격");
	}
}

class Archer extends Hero{
	@Override
	public void attak() {
	System.out.println("활로 공격");
	}
}

public class PromotionExample {
	public static void main(String[] args) {
		
		Hero hero =  new Warrior();
		hero.attak();
		
		hero =  new Archer();
		hero.attak();
		
		hero =  new Mage();
		hero.attak();
	}


}
