package ch04.sec03;

public class SwitchExpressonsExample {

	public static void main(String[] args) {
		char grade = 'b';
		
		switch(grade) {
		case 'A','a'->{
			System.out.println("우수회원입니다.");
		}
		case 'B','b'->{
			System.out.println("일반회원입니다.");
		}
		case 'C','c'->{
			System.out.println("손님입니다.");
		}
		}
		
		
		// 실행문이 하나인 경우엔 중괄호를 생략할수있다.
		switch (grade) {
		case 'A','a'->System.out.println("우수회원입니다.");
		case 'B','b'->System.out.println("일반회원입니다.");
		case 'C','c'->System.out.println("손님입니다.");
		}

	}

}
