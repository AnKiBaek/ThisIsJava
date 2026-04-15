package ch14.sec02;

public class MainThreadExample {

	public static void main(String[] args) {
		
		System.out.println("실행");
		
		//현재스레드 객체를 currentThread 변수에 대입 
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());
		
		System.out.println("종료");

	}

}
