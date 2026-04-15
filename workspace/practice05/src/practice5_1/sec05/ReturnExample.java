package practice5_1.sec05;

public class ReturnExample {

	private int doobae(int x) {
		
		int result = x *2;
		return result;
	}
	
	public static void main(String[] args) {
		
		ReturnExample returnExample  = new ReturnExample();
		
		
		int result = returnExample.doobae(30);
		
		System.out.println(result);
		
		

	}

}
