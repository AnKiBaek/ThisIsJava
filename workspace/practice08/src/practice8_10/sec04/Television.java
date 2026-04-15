package practice8_10.sec04;

public class Television implements RemoteControl{

	private int volume;
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
	System.out.println("Tv가 꺼졌음.");	
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
	System.out.println("Tv가 켜졌음");	
	}
	
	@Override
	public void setVolume(int volume) {
	if(volume > MAX_VOLUME) {
		this.volume = MAX_VOLUME;
	} else if(volume < MIN_VOLUME) {
		this.volume = MIN_VOLUME;
	} else {
		this.volume =volume;
	}
		System.out.println("Tv볼륨: " + this.volume);
	}
}
