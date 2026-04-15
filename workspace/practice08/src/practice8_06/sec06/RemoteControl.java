package practice8_06.sec06;

public interface RemoteControl {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void setVol(int vol);
	void setMute(boolean mute);
	void turnOn();
	void turnOff();
}
