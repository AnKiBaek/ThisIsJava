package practice9_01.sec07.exam01;

public class Car {
	
	private Tire tire1 = new Tire();
	// 1. 클래스타입 필드 선언하면서 익명객체화 방식사용
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체1 이 굴러갑니다.");
		};
	};
	
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	// 2. 클래스 메서드 선언부에서 익명객체화 사용
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Trie 객체2 가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	
	// 3. main에서 파라미터로 들어갈 tire 객체를 익명객체화 시키는방법
	public void run3(Tire tire) {
		tire.roll();
	}

}
