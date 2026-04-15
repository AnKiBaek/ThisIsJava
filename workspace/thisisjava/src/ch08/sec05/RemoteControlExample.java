package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(11);
		rc.setVolume(-1);
		rc.setVolume(5);
		
		
		// 무음처리시 5였던 tv 볼륨 임시저장 안됨
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println(rc.getVolume());
		
		// 임시저장 메서드로 값 보존한 Audio 클래스로 변환
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(11);
		rc.setVolume(-1);
		rc.setVolume(5);
		
		// 무음처리시 5였던 audio 볼륨 임시저장
		rc.setMute(true);
		rc.setMute(false);
		System.out.println(rc.getVolume()); 
		
		System.out.println();
				
		
		
		
		
		

	}

}
