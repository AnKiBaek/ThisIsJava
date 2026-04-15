package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		//SumThread 작업스레드 객체생성
		SumThread sumThread = new SumThread();
		
		// sumThread(작업스레드)실행대기
		sumThread.start();
		
		// join() : 작업스레드의 작업이 끌날때까지는 대기
		try{ sumThread.join();
			
		//예외처리
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 이후 sum 값 출력
		System.out.println(sumThread.getSum());

	}

}
