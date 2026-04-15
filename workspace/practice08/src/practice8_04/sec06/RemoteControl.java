package practice8_04.sec06;

public interface RemoteControl {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void setVolume(int volume);
	void setMute(boolean mute);
	void turnOn();
	void turnOff();
}
