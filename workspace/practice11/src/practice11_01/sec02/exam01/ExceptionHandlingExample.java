package practice11_01.sec02.exam01;

public class ExceptionHandlingExample {

	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자수: " + result);
		} catch (NullPointerException e) {
		//	e.printStackTrace();
			System.out.println("에러 발생: " + e.getMessage()); // err가 아닌 out을 사용
		}finally {
			System.out.println("마무리실행\n");
		}
	}
	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("프로그램 종료");
		

	}

}
