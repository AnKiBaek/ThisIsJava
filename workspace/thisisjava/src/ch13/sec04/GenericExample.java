package ch13.sec04;

public class GenericExample {
	
	public<T extends Number>boolean compare(T t1, T t2){
		
	System.out.println(t1.getClass().getSimpleName() + t2.getClass().getSimpleName());	
		
		
		//Number 의 메서드 사용
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return (v1==v2);
	}
	
	public static void main(String[] args) {
		
		GenericExample genericExample  = new GenericExample();
		
		boolean result = genericExample.compare(10, 20);
		
		System.out.println(result);
		
		System.out.println();
		
		boolean result2 = genericExample.compare(4.5, 4.5);
		
		
		System.out.println(result2);
	}
}
