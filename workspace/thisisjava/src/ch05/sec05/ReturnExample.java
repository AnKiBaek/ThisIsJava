package ch05.sec05;

public class ReturnExample {
	
	private int doobae(int x) {
		int result = x *2;
		return result;
	}
	
	public static void main(String[] args) {
		
		ReturnExample returnExample = new ReturnExample();
		
		int value = returnExample.doobae(10);
		
		
		
		System.out.println(value);
		
	}

}
