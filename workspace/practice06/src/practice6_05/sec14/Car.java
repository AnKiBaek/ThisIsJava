package practice6_05.sec14;

public class Car {
	int speed;
	boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		// speed가 0 보다 작으면 0 으로 변환
		if(0>speed) {
			speed = 0;
		// 아니면 정상적용
		} else {	
			this.speed = speed;	
		}
		
	}
	// 멈췄는지 검사할수있는 장치
	public boolean isStop() {
		return stop;
	}
	// 멈추게하는장치 
	public void setStop(boolean stop) {
		if(stop == true) {
			this.speed = 0;
		}
		this.stop = stop;
	}
	
	

}
