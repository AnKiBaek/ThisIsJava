package ch08.sec06;

// 구현클래스
public class Television implements RemoteControl {
	
	private int volume;
	
 @Override
 public void turnOn() {
	// TODO Auto-generated method stub
	System.out.println("Tv를 켭니다.");
 }

 @Override
 public void turnOff() {
	// TODO Auto-generated method stub
		System.out.println("Tv를 끕니다.");
	
 }

 @Override
 public void setVolume(int volume) {
	if(volume>RemoteControl.MAX_VOLUME) {
		this.volume = MAX_VOLUME;
	} else if (volume < MIN_VOLUME) {
		this.volume = MIN_VOLUME;
	} else {
		this.volume = volume;
	}
	System.out.println("현재TV 볼륨: "+ this.volume);
 }
 
 @Override
public int getVolume() {

	return this.volume;
}
}
