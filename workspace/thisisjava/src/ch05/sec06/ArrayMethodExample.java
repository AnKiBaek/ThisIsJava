 package ch05.sec06;

public class ArrayMethodExample {

	void test(int[] val) {
		System.out.println(val[0]);
		System.out.println(val[1]);
		System.out.println(val[2]);
	
	}
	
	public static void main(String[] args) {
		ArrayMethodExample arrayMethodExample =  new ArrayMethodExample();
		
		//arrayMethodExample.test({6,5,4});
		arrayMethodExample.test(new int[] {4,3,1,8});

	}

}
