package ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		// 작업 1 (생성자 객체값으로  Thread 객체화)
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0 ; i < 5 ; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}});
		
		
		thread.start();
		
		// 작업 2
//		for(int i = 0 ; i < 5 ; i++) {
//			System.out.println("띵");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		Thread thread2 = new Thread(new Task());
		
		thread2.start();
		

	}

}
