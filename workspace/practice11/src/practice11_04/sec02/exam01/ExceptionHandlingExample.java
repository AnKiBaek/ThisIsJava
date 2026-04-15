package practice11_04.sec02.exam01;

public class ExceptionHandlingExample {
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println(result);
		} catch (NullPointerException e) {
		System.err.println(e.getMessage());
		} finally {
			System.out.println("마무리 동작");
		}
	}
public static void main(String[] args) {
	
	
	printLength("안기백안기백안기백안기백");
	printLength(null);
	
}
}
