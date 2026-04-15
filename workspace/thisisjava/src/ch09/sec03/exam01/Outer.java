package ch09.sec03.exam01;

public class Outer {
	
	int x = 10;
	
	void method() {
		class Inner {
			
			void method() {
				System.out.println(x);
			}
		
		}
	}
	
	int intMethod() {
		 int result = x * x;
		 
		 
		 return result;
		 
	}
	

	

}
