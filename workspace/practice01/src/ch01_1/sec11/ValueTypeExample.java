package ch01_1.sec11;

public class ValueTypeExample {

	public static void main(String[] args) {
		//boolean : 참 , 거짓 저장가능
		// 기본값 : false
		boolean booleanValue =false;
		
		//char : 문자 하나씩 값 저장 가능
		char charValue = 'A';
		
		//byte :  -128 ~ 127 범위 벗어나면 스택오버플로걸린다
		//byte byteValue1 = -129;
		byte byteValue2 = -128;
		byte byteValue3 = 127;
		//byte byteValue4 = 128;
		
		//short : -32,768 ~ 32,767
		//short shortValue1 = -32769;
		short shortValue2 = -32768;
		short shortValue3 = 32767;
		//short shortValue4 = 32768;
		
		//int : -2,147,483,648 ~ 2,147,483,647
		//int intValue1 = -2_147_483_649;
		int intValue2 = -2_147_483_648;
		int intValue3 = 2_147_483_647;
		//int intValue4 = 2_147_483_648;
		
		//long : 이건걍 몰라 무한에 가까워
		
		//실수형 float 타입은 F 붙힐것
		float floatValue = 3.14F;
		//double
		double doubleValue = 3.14;
		
		

	}

}
