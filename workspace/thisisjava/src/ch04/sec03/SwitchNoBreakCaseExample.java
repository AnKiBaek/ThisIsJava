package ch04.sec03;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		
		// Math.random() >>> 0~1 사이 난수를생성
		// 뒤에 *n 을 곱하면 무조건 n값은 나올수없음
		// 즉 3.99999... 까지 나오는데 정수형으로 캐스팅시 3으로 변형됌
		// 8~11 사이값이 time 에 리터럴
		int time = (int)(Math.random()*4)+8;
		System.out.println(time);
		switch(time){
		case 8 :
			System.out.println("출근합니다");
			break;
		case 9 :
			System.out.println("회의합니다");
			break;
		case 10 :
			System.out.println("업무봅니다");
			break;
		default :
			System.out.println("외근입니다");
			break;
		}

	}

}
