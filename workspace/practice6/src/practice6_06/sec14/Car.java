package practice6_06.sec14;

public class Car {
	private int speed;
	private boolean stop;
	
	public void setSpeed(int speed) {
		if(speed<0) {
			speed = 0;
		} else {
			this.speed =speed;
		}
		
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setStop(boolean stop) {
		if(stop == true) {
			this.speed = 0;
		}
		this.stop = stop;
	}
	
	public boolean isStop() {
		return stop;
	}
	

}
