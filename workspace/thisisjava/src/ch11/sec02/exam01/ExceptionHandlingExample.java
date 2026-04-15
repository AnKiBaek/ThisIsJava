package ch11.sec02.exam01;

public class ExceptionHandlingExample {

	public static void printLength(String data) {
		try {
			int result =data.length();
			System.out.println("문자수: "+ result);
		} catch(NullPointerException e) {
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());   
			e.printStackTrace(); // 제일 자세한 예외보고
		} finally {
			System.out.println("마무리 실행\n");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작\n");
		
		printLength("ThisIsJava");
		
		// 컴파일러는 모르는 예외상황발생
		printLength(null);
		
		System.out.println("프로그램 종료");

	}

}
