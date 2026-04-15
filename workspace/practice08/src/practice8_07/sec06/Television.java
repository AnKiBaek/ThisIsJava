package practice8_07.sec06;

public class Television implements RemoteControl{

	private int volume;
	private int memoryVolume;
	@Override
	public void setMute(boolean mute) {
	if(mute) {
		this.memoryVolume = this.volume;
		this.volume = MIN_VOLUME;
		System.out.println("음소거");
	} else {
		this.volume =this.memoryVolume;
		System.out.println("음소거해제");
	}
		
	}@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("Volume: " + this.volume);
		
	}
}
