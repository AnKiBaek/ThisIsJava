package ch02_3.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		int hour = 3;
		int min = 23;
		System.out.println(hour + "시간" + min + "분");
		
	
		int totalmin = hour *60 + min ;
		System.out.println(totalmin + "분");
		
		//byte -> int
		byte bVal = 100;
		int iVal = bVal;
		
		System.out.println(iVal);
		
		//short -> int 
		short sVal =1003;
		int iVal2 = sVal;
		System.out.println(iVal2);
		
		//char -> int
		char cVal = '가';
	    int iVal3 = cVal;
	    
	    System.out.println(iVal3);
	    
	    //int -> long 
	    int iVal4 = 10233;
	    long lVal = iVal4;
	    
	    System.out.println(lVal);
	    
	    //long -> float
	    
	    lVal =1023;
	    
	    float fVal = lVal;
	    
	    System.out.println(fVal);
	    
	    
	    //float -> double
	    fVal =10.4F;
	    
	    double dVal = fVal;
	    
	    System.out.println(dVal);
	}
	
	
}
