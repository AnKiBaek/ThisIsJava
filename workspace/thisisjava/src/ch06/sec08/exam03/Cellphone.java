package ch06.sec08.exam03;

import java.util.Scanner;

public class Cellphone {
	//전원을켠다
	boolean power;
	int battery;
	
	// 초기 배터리값 설정
		int setBattey(int battery){
			this.battery = battery;
			
			return battery;
		} 
	
	
	void powerOn() {
		// 전원키면 power=true 리턴 하는메서드
	
		System.out.println("전원을 켭니까? y/n");
		Scanner scanner = new Scanner(System.in);
		String choice =scanner.nextLine();
		switch(choice) {
		case "y" : power = true;
				if((battery!=0 )&&power==true) {
					
					System.out.println("전원을 켭니다");
					batteryOff();
				};
				break;
		
		case "n" : power = false;
				System.out.println("전원을 켜지 않았습니다.");
		}
		
		
	} 
		
	//배터리가 없으면꺼진다.
	void batteryOff() {
		
		if(battery > 0 ) { 
			batteryLow();
		 }
	}
	
	
	
	//배터리 줄어드는 매서드
	int batteryLow() {
		
		while(battery>0) {
			battery--;
			System.out.println("남은배터리: "+battery);
			if(battery==10) {
			    System.out.println("배터리 10프로남았습니다");
			} else if (battery==0) {
				 System.out.println("배터리가 없습니다.");
			  }
		 }
		return  battery;
	}
	
	
	
	

}
