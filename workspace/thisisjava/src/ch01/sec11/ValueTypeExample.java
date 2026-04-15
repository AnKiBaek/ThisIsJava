package ch01.sec11;

public class ValueTypeExample {

	public static void main(String[] args) {
		
		// boolean : 참(true) or 거짓(false) 저장가능 
		// 기본값 false
		boolean booleanValue = false;
		
		// char : 문자하나씩 값 저장가능
		char charValue = 'A';
		
		// byte : -128 ~ 127 
		//byte byteValue1 = -129; 
		byte byteValue2 = -128;
		byte byteValue3 =  127;
		//byte byteValue4 =  128;
		
		
		//short : -32,768 ~ 32,767 
		//short shortValue1 = -32769;
		short shortValue2 = -32768;
		short shortValue3 =  32767;
		//short shortValue4 =  32768;
		
		//int :  –2,147,483,648 ~ 2,147,483,647
		//int intValue1 = -2_147_483_649;
		int intValue2 = -2_147_483_648;
		int intValue3 =  2_147_483_647;
		//int intValue4 =  2_147_483_648;
		
		//long : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		//long longValue1 = -9223372036854775809L;
		long longValue2 = -9223372036854775808L;
		long longValue3 =  9223372036854775807L;
		//long longValue4 =  9223372036854775808L;
		
		
		// 실수형
		float floatValue = 3.14F;
		//double : 
		double doubleValue = 3.14;

	}

}
