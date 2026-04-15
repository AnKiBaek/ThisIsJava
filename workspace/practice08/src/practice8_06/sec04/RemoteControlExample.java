package practice8_06.sec04;

public class RemoteControlExample {
public static void main(String[] args) {
	RemoteControl tv = new Television();
	tv.turnOn();
	tv.setVol(20);
	tv.turnOff();
}
}
