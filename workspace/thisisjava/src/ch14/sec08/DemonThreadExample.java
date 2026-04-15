package ch14.sec08;

public class DemonThreadExample {

	public static void main(String[] args) {
		Thread thread = new AutoSaveThread();

		thread.setDaemon(true);
		
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			
		}
		thread.interrupt();

	}

}
