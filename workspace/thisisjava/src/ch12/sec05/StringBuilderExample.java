package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("ABC");
		sb.append("DEF");
		String result1 = sb.toString();
		
		System.out.println(result1);
		
		
		String result = new StringBuilder()
				.append("ABC")
				.append("DEF")
				//최종 문자열 생성
				.toString();
		
		System.out.println(result);
		
		System.out.println(result.equals(result1));
		

	}

}
