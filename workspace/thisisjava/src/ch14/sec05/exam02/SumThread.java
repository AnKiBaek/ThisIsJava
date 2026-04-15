package ch14.sec05.exam02;

//스레드를 상속받는 SumThread 클래스 선언
public class SumThread extends Thread{

	// 필드 long 타입 sum 선언
	private long sum ;
	
	
	//Getter , Setter
	public long getSum() {
		return sum;
	}



	public void setSum(long sum) {
		this.sum = sum;
	}



	//Thread 클래스 의 run() 메서드 오버라이드 
	// i를 sum 변수에  계속 더하기
	@Override
	public void run() {
		for(int i = 1 ; i<=100 ; i++) {
			sum+= i;
		}
	}
	
}
