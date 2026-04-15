package ch01_4.sec12;

public class Calculator {

	public static void main(String[] args) {
		float fVal1 = 3.14F;
		float fVal2 = 3.14F;
		float fVal3 = 3.14F;
		
		double result = fVal1 + fVal2 + fVal3;
		
		fVal1 = (int)result;
		fVal2 = (float)result;
		
		System.out.println(result);
		
		System.out.println(fVal1);
		
		System.out.println(fVal2);
		
	}

}
