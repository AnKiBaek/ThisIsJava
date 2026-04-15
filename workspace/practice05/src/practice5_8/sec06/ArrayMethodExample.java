package practice5_8.sec06;

public class ArrayMethodExample {
	
	private void test(int[] arr) {
		for(int i: arr) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		ArrayMethodExample ex = new ArrayMethodExample();
		ex.test(new int[] {2,1,3,2,1,3});

	}

}
