package practice7_06.sec08.exam02;

public class ChefExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chef chef =new Chef();
		chef.cook(new ChinseFood());
		
		Food kFood = new KoreanFood();
		
		chef.cook(kFood);
		
		FrancheFood fFood =new FrancheFood();
		chef.cook(fFood);
	}

}
