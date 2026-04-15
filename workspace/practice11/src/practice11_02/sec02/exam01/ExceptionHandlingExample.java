package practice11_02.sec02.exam01;

public class ExceptionHandlingExample {

	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println(result);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("마무리 동작");
		}
	}
	
	public static void main(String[] args) {
		
		String str1 = "ThisIsJava";
		String str2 = null;
		
		printLength(str1);
		
		printLength(str2);
	}
}
