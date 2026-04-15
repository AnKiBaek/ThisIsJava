package practice5_10.sec06;

public class ArrayMethodExample {

	private void test (int[]arr) {
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	}
	public static void main(String[] args) {
		ArrayMethodExample ex = new ArrayMethodExample();
		
		ex.test(new int[]{1,2,3});

	}

}
