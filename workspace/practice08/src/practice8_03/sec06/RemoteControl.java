package practice8_03.sec06;

public interface RemoteControl {
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	int getVolume();

	void setMute(boolean mute);

	void setVolume(int volume);

	void turnOn();

	void turnOff();

}
