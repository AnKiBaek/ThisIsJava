package practice9_03.sec07.exam01;

public class Car {

	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명객체1 Tire가 굴러갑니다.");
		};
	};
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
			System.out.println("익명객체2 Tire가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}
}
