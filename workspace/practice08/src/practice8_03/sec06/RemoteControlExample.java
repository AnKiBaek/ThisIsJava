package practice8_03.sec06;

public class RemoteControlExample {
public static void main(String[] args) {
	Television tv = new Television();
	tv.setVolume(100);
	tv.setMute(true);
	System.out.println(tv.getVolume());
	tv.setMute(false);
	System.out.println(tv.getVolume());
}
	
	
}
