package practice5_4.sec07;

public class StackMethodExample {
	
	private int foo(int x ) {
		
		int y = 10;
		return x *y ;
	}
	
	private int val (int y ) {
		
		int l = 10;
		System.out.println("foo호출 드가자!");
		return foo(y-l);
	}

	public static void main(String[] args) {
		StackMethodExample ex = new StackMethodExample();
		 System.out.println(ex.val(202));

	}

}
