package practice5_10.sec07;
public class StackMethodExample {
	
	int foo(int x) {
		int y = 10;
		
		return x*y +10;
	}
	
	int var (int a) {
		int b = 2;
		return foo(a*b);
		
	}

	public static void main(String[] args) {
		
		StackMethodExample ex = new StackMethodExample();
		System.out.println(ex.var(20));

	}

}
