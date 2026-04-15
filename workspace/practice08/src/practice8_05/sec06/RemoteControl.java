package practice8_05.sec06;

public interface RemoteControl {

	//public static final 생략가능
	int MAX_VOLUME =10;
	int MIN_VOLUME = 0;
	
	//추상메서드 선언
	void turnOn();
	void turnOff();
	void setVol(int vol);
	void setMute(boolean mute);
}
