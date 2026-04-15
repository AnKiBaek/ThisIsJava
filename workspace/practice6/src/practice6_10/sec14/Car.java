package practice6_10.sec14;

public class Car {

	private int speed;
	private boolean stop;
	public int getSpeed() {
		return speed;
	}
	// 0 미만 값 방지
	public void setSpeed(int speed) {
		if(speed <0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
		
	}
	
	public boolean isStop() {
		return stop;
	}
	
	// 강제로 정지 상태 만들기
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) {
			this.speed = 0;
		}
	}
	
	
}
