package practice6_02.sec08.exam03;

import java.util.Scanner;

public class Cellphone {
	
	int battery;
	String choice;
	
	Scanner scanner = new Scanner(System.in);
	
	//setter
	void setBattery(int battery) {
		this.battery = battery;
	}
	
	
	boolean powerOn() {
	
		System.out.println("배터리가 있습니다.");
		System.out.println("전원을 켭니까? y/n");
		 choice = scanner.nextLine();
		 switch(choice) {
		 
		 // y 클릭시 true
		 case  "y" : 
			 System.out.println("전원을 켭니다.");
			 return true;
			 
		 // n 클릭시 false
		 case  "n" : 
			 System.out.println("전원을 안 켭니다.");
			 return false;
		 // 기본값 false	 
		 default : return false;
		 }
		 
		
	}
	
	void batteryLow() {

		while(true) {
			// 배터리가 0일경우 while 문 탈출
			if(battery == 0) {
				System.out.println("배터리가없습니다. 배터리 잔량: "+battery);
				return ;
				// 배터리가 0이상일경우 배터리 1감소
			} else if(battery > 0 ) {
				System.out.println("실행중... 배터리 잔량: " + battery);
				battery--;
				// 감소중에 배터리가 10 남으면 배터리충전 선택지
				if(battery == 10) {
					System.out.println("배터리가 "+battery+"% 남았습니다");
					System.out.println("충전한다 y / n");
					 choice = scanner.nextLine();
					 
					 switch(choice) {
					 case  "y" : 
						 System.out.println("충전합니다.");
						 battery += 10;  break;
						 
					 case  "n" : 
						 System.out.println("충전안합니다."); break;	 
						 
					default : 
						System.out.println("잘못입력했습니다."); break;
				}
			}
		}
	  }
	}
}
