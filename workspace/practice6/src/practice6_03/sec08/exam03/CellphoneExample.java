package practice6_03.sec08.exam03;

public class CellphoneExample {

	public static void main(String[] args) {
		Cellphone cellphone = new Cellphone();
		
		cellphone.setBattery(20);
		
		if(cellphone.powerOn()) {
			System.out.println("전원을 켭니다.");
			cellphone.batteryLow();
		}
		System.out.println("전원이 꺼집니다.");

	}

}
