package practice8_09.sec04;

public interface RemoteControl {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public void setVolume(int volume);
	public void turnOn();
	public void turnOff();
}
