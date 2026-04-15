package practice6_05.sec08.exam03;

public class CellphoneExample {

	public static void main(String[] args) {
	
		Cellphone cellphone = new Cellphone();
		
		cellphone.setBattery(20);
		
		if(cellphone.isLeftBattery()) {
			System.out.println("실행합니다.");
			cellphone.batteryLow();
		}
		System.out.println("배터리가 없습니다.");

	}

}
