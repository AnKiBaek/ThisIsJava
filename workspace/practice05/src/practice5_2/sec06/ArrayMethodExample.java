package practice5_2.sec06;

public class ArrayMethodExample {
	
	private void test(int[]arr) {
		for(int a : arr) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		
		ArrayMethodExample ex = new ArrayMethodExample();
		
		ex.test(new int[] {1,2,3,1,2,3,1,2,3,2,1,3,2,1,3,1,3,2,1,3,2,1,3,1,2});

	}

}
