package ch14.sec06.exam02;

public class ThreadA extends Thread {

	private WorkObject wotkObject;
	
	public ThreadA(WorkObject wotkObject) {
		setName("ThreadA");
		this.wotkObject = wotkObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10 ; i++) {
			wotkObject.methodA();
		}
	}
}
