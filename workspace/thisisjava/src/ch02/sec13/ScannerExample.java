package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// 키보드로부터 데이터를 읽는 객체를 만들어라
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("x 값 입력 :");
		//nextLine() : 키보드로부터 값을 기다리는 메서드
		String strX = scanner.nextLine();
		//x
		int x = Integer.parseInt(strX);
		System.out.println("입력값은"+strX+"입니다.");
		System.out.println(x);
		
		//y
		System.out.printf("y 값 입력 :");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		System.out.println("입력값은"+strY+"입니다.");
		
		int  result = x+y;
		System.out.println("x+y : " +(x+y));
		System.out.println("result : "+result);
		
		//while(true) 무한 반복
		while(true) {
			System.out.print("입력문자열(q :중지) : ");
			String data = scanner.nextLine();
			
			// 만약 data 의 값이 q 면 무한반복 중지
			if(data.equals("q")) {
				System.out.println("q를 입력했습니다. 중지");
				break;
			}
			
			System.out.println("출력문자열:"+data);
			System.out.println();
		}

	}

}
