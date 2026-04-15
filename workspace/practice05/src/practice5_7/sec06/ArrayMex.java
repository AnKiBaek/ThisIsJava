package practice5_7.sec06;

public class ArrayMex {
	
	private static void method(int[]arr) {
		for(int i: arr) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		method(new int[] {1,2,3});

	}

}
