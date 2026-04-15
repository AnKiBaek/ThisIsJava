package practice8_03.sec04;

public interface RemoteControl {
	
	//public static final 생략
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);	

}
