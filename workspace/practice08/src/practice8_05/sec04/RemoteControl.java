package practice8_05.sec04;

public interface RemoteControl {

	int MAX_VOLUNE = 10;
	int MIN_VOLUNE = 0;
	
	public void setVolume(int volume);
	public void turnOn();
	public void turnOff();
}
