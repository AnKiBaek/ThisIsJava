package practice6_07.sec08.exam03;

public class Cellphone {
	
	int battery;
	
	void setBattery(int battery) {
		this.battery = battery;
	}
	
	boolean checkBattery() {
		if(0==battery) {
			System.out.println("배터리 x"); return false;
		}
		System.out.println("배터리 O"); return true;
	}
	
	void batteryLow() {
		while(battery> 0) {
			System.out.println("실행중... 배터리: " +battery +"%");
			battery--;
			
		}
		System.out.println("배터리 out");
	}
	

}
