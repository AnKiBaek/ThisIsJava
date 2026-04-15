package practice8_05.sec06;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc =new Television();
		
		if(rc instanceof Television tv) {
			tv.setVol(20);
			tv.setMute(true);
			System.out.println(tv.getVol());
			tv.setMute(false);
			System.out.println(tv.getVol());
		}
	}
}
