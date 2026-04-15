package ch11.sec03.exam03;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		String[] array = {"10","1oo",null,"2000"};
		
		for( int i = 0 ; i<=4; i++) {
			try {
				System.out.println(array[i].length());
				int value = Integer.parseInt(array[i]);
			
			}catch(NumberFormatException e){
			 System.out.println("숫자로 변환 할수없음");
			}catch(NullPointerException | ArrayIndexOutOfBoundsException e) {
		     System.out.println("문자열이 없거나 항목수가 부족합니다.");
			}catch(Exception e) {
			 System.out.println("예상치못한 에러가 발생했습니다");
			 }
		}	
	}
}
