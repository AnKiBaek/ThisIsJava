package practice8_05.sec04;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUNE) {
			this.volume = MAX_VOLUNE;
		} else if (volume < RemoteControl.MIN_VOLUNE) {
			this.volume = MIN_VOLUNE;
		} else {
			this.volume = volume;
		}
		System.out.println("Audio볼륨: " + this.volume);

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 켭니다.");
	}
}
