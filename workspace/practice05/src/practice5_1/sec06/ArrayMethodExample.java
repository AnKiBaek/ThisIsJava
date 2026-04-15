package practice5_1.sec06;

public class ArrayMethodExample {

	void test (int[] val) {
		System.out.println(val[0]);
		System.out.println(val[1]);
		System.out.println(val[2]);
		
	}
	public static void main(String[] args) {
		
		ArrayMethodExample ex = new ArrayMethodExample();
		ex.test(new int[] {3,1,2});
	}
}
