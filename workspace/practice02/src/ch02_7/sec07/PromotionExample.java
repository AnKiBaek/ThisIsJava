package ch02_7.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		int year = 27;
		int mon = 3;
		int day = 25;
		
		day = (year *365) + (3*30) +day;
		
		System.out.println("00년생 살아온날짜수: "+ day);
		
		//byte -> int
		byte bVal = 103;
		
		int iVal = bVal;
		
		System.out.println(iVal);
		
		//char -> int
		char cVal = '마';
		int iVal2 =cVal;
		
		System.out.println(iVal2);
		
		//short -> int
		short sVal =2321;
		int iVal3 =  sVal;
		System.out.println(iVal3);
		
		//int -> long
		int intVal = 1231232;
		long lVal = intVal;
		System.out.println(lVal);
		
		//long -> float
		lVal =123;
		float fVal = lVal;
		System.out.println(fVal);
		
		//float -> double
		fVal = 123.34F;
		
		double dVal = fVal;
		
		System.out.println(dVal);
		
		
		float fval1 = fVal + fVal;
		 
		System.out.println(fval1);
	
		
		

	}

}
