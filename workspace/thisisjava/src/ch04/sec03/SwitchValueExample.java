package ch04.sec03;

public class SwitchValueExample {
	public static void main(String[] args) {
		String grade = "B";
		
		// 스위치 문에서 변수를 생성해서 사용하는방법
		
		//Java11이전문법
		int score1= 0 ;
		
		switch(grade) {
		case "A":
			score1 =100;
			break;
		case "B":
			int  result =100-20;
			score1 =result;
			break;
			
			default:
			score1 =60;
		}
		System.out.println("score1: "+score1);
		
		
		//Java 12부터가능
		int score2 = switch(grade) {
		 case "A" ->100;
		 case "B" ->{
			int result =100-20;
			yield result;
		 }
		default ->60;
		};
		System.out.println("score2: "+score2);
		
		
		int score3 = switch(grade){
		case "A" ->100;
		case "B" ->{
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		};
		
		
		int score4 = switch(grade) {
		
		case "A" ->100;
		case "B" ->{
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		};
		
		
		
	}

}
