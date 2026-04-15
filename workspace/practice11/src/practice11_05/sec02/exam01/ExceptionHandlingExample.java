package practice11_05.sec02.exam01;

public class ExceptionHandlingExample {
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println(result + "개");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("마무리동작");
		}

	}

	public static void main(String[] args) {
		printLength(null);
		printLength("안기백");
	}
}
