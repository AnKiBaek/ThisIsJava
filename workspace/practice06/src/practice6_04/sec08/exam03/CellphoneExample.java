package practice6_04.sec08.exam03;

public class CellphoneExample {

	public static void main(String[] args) {
		Cellphone cellphone = new Cellphone();
		
		cellphone.setBattery(20);
		
		if(cellphone.isLeftBattery()) {
			System.out.println("휴대폰을 킵니다.");
			cellphone.batteryLow();
		}
		System.out.println("휴대폰이 꺼졌습니다.");

	}

}
