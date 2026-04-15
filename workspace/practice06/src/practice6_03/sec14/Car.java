package practice6_03.sec14;

public class Car {
	
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(0>speed) {
			speed = 0;
		}
		this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		if(stop == true) {
			speed = 0;
		}
		this.stop = stop;
	}
	
	

}
