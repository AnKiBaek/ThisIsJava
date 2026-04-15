package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score =70;
		
		
		
		
		
		while(true) {
			
			char rank = (score > 89) ?'A':(score > 79)?'B':'C';
			System.out.println("당신의 등급은: "+ rank+"랭크 입니다.");
			
			if(rank=='C') {
				
				++score;
				System.out.println("등급을 올리기위해공부중입니다..");
				System.out.println("당신의 점수 : "+score+"(등급: "+rank+")");
			} else if (rank=='B')  {
				++score;
				System.out.println("등급을 올리기위해공부중입니다..");
				System.out.println("당신의 점수 : "+score+"(등급: "+rank+")");
			} else if (rank=='A')  {
				++score;
				System.out.println("등급을 올리기위해공부중입니다..");
				System.out.println("당신의 점수 : "+score+"(등급: "+rank+")");
			}
			
			if(score>=100) {
				System.out.println("100점 입니다.");
				break;
			}
		}
	

	}

}
