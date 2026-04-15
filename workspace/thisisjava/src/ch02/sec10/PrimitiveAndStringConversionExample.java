package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("문자열 -> 기본타입");
		System.out.println("parseInt : " + value1);
		System.out.println("parseDouble : " + value2);
		System.out.println("parseBoolean : " + value3);
		
		System.out.println();
	
		
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("기본타입 -> 문자열");
		System.out.println("valueOf : " + str1);
		System.out.println("valueOf : " + str2);
		System.out.println("valueOf : " + str3);

	}

}
