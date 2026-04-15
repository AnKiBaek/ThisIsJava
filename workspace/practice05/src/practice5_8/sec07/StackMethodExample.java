package practice5_8.sec07;

public class StackMethodExample {

	public static int  method1 (int a) {
		return a *2;
	}
	
	int method(int b) {
		return method1(b*2);
	}
	public static void main(String[] args) {
		
		StackMethodExample ex = new StackMethodExample();
		
		System.out.println(ex.method(2));
		

	}

}
