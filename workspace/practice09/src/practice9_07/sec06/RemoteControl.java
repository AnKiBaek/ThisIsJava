package practice9_07.sec06;

public class RemoteControl {
	private ButtonListener buttonListener ;
	
	public void setButtonListener(ButtonListener buttonListener) {
		this.buttonListener = buttonListener;
	}
	
	public void powerOn() {
		buttonListener.powerOn();
	}
	public void powerOff() {
		buttonListener.powerOff();
	}
	

	public static interface ButtonListener {
		public void powerOn();
		public void powerOff();
	}
}
