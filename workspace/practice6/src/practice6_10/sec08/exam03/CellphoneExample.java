package practice6_10.sec08.exam03;

public class CellphoneExample {

	public static void main(String[] args) {
		Cellphone cellphone = new Cellphone();
		
		cellphone.setBt(20);
		
		if(cellphone.power()) {
			System.out.println("켬");
			cellphone.btLow();
		}
		System.out.println("종료");

	}

}
