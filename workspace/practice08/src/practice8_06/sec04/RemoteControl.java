package practice8_06.sec04;

public interface RemoteControl {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public void setVol(int volume);
	public void turnOn();
	public void turnOff();
}
