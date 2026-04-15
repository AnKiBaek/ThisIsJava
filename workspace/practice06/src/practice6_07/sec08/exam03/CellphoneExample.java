package practice6_07.sec08.exam03;

public class CellphoneExample {

	public static void main(String[] args) {
		Cellphone cellphone = new Cellphone();
		
		cellphone.setBattery(20);
		
		if(cellphone.checkBattery()) {
			System.out.println("실행");
			cellphone.batteryLow();
		}
		System.out.println("꺼짐");

	}

}
