package practice6_05.sec08.exam03;

import java.util.Scanner;

public class Cellphone {
	
	int battery ; 
	String  choice;     
	
	Scanner scanner = new Scanner(System.in);
	
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	boolean isLeftBattery() {
		if(battery == 0) {
			System.out.println("배터리가 없습니다."); return false;
		}
		System.out.println("배터리가 있습니다."); return true;
	}
	
	void batteryLow() {
		while(true) {
			if(battery > 0) {
				System.out.println("실행중..." + battery);
				battery--;
			} else {
				System.out.println("배터리없음"+ battery); return;
			}
			
		
					
			
		}
	}
}
