package practice9_08.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.run1();
		car.run2();
		car.run3(new Tire() {
			@Override
			public void roll() {
				// TODO Auto-generated method stub
			System.out.println("3번익명객체 바퀴가 굴러갑니다.");
			}
		});
	}
}
