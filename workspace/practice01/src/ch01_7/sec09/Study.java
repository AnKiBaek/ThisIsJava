package ch01_7.sec09;

public class Study {

	public static void main(String[] args) {
		String rl1 = "rlqor";
		String rl2 = "rlqor";
		String rl3 = new String("기백");
		String rl4 = new String("기백");
		
		//출력
		System.out.println(rl1);
		System.out.println(rl2);
		System.out.println(rl3);
		System.out.println(rl4);
		
		// == 연산자 비교 ( 객체주소기반 )
		System.out.println(rl1 == rl2);
		System.out.println(rl3 == rl4);
		
		//스트링은 이퀄스로 비교해라
		System.out.println(rl3.equals(rl4));
		
		//해시코드 출력하기 (객체주소기반 해시코드)
		System.out.println(System.identityHashCode(rl4));
		System.out.println(System.identityHashCode(rl3));
		
		System.out.println("  ");
		//  rl1 하고 rl2 가 ture 가 뜨는 이유다 이거야 객체주소기반으로 비교를 하잖니
		System.out.println(System.identityHashCode(rl2));
		System.out.println(System.identityHashCode(rl1));
		
		
		
		
		

	}

}
