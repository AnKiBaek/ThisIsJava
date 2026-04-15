package ch14.sec04;

public class ThreadNameExample {

	public static void main(String[] args) {
		// 스레드 이름 주소값 참조얻기
		Thread mainThread = Thread.currentThread();
		
		// 스레드 이름 출력
		System.out.println(mainThread.getName());
		
		
		// 익명객체  3개
		for(int i = 0; i<3 ; i++) {
			Thread threadA = new Thread() {
			@Override
			public void run() {
				System.out.println(getName());
			}
		};
		
		threadA.start();

	    }
		
		//익명객체 (이름변경)
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName());
			}
		};
		chatThread.setName("chat-thread");
		chatThread.start();
	}
}
