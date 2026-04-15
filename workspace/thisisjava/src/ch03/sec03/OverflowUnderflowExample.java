package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		
		byte var1 = 125;
		
		for(int i=0;i<5;i++) {
			
			var1++;
			
			if(var1 < 125) {
			    System.out.println("overflow : "+ var1);
			} else {
				System.out.println("var1 : "+ var1);
			}
		}
		
		System.out.println("-----------------------");
		
		byte var2 =-125;
		
		for(int i=0;i<5;i++) {
			
			var2--;
			
			if(var2 > -124) {
				System.out.println("underflow : " + var2);
			} else {
				System.out.println("var2 : " + var2);
			}
		}
	}
}
