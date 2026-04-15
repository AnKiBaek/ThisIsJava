package ch09.sec06.exam03;

public class Shampoo {

	private ShampooEventListener shampooEventListener;
	
	public void setShampooEventListener(ShampooEventListener shampooEventListener) {
		this.shampooEventListener = shampooEventListener;
	}
	
	public void push() {
		shampooEventListener.shampooPush();
	}
	
	//중첩인터페이스
	public static interface ShampooEventListener {
		public void shampooPush();
		
	}
	
	
}
