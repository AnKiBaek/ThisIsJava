package ch08.sec05;

// 구현클래스
public class Audio implements RemoteControl {

	private int volume;
	private int memoryVolume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재Audio 볼륨: " + this.volume);
	}

	@Override
	public void setMute(boolean mute) {
		if (mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음처리합니다");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
			this.volume = this.memoryVolume;
		}
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return this.volume;
	}
}
