package ch14.sec06.exam02;

public class ThreadB extends Thread {

	private WorkObject wotkObject;
	
	public ThreadB(WorkObject wotkObject) {
		setName("ThreadB");
		this.wotkObject = wotkObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10 ; i++) {
			wotkObject.methodB();
		}
	}
}
