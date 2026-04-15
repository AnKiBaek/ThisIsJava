package practice7_05.sec08.exam02;

public class ZoogerExample {

	public static void main(String[] args) {
		Zooger zooger =new Zooger();
		zooger.giveFood(new Animal());
		System.out.println();
		zooger.giveFood(new Tiger());
		System.out.println();
		Animal  fox = new Fox();
		
		System.out.println();
		zooger.giveFood(fox);

	}

}
