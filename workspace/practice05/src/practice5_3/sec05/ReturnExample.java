package practice5_3.sec05;

public class ReturnExample {

	private int sedae(int x) {
		int result = x *3;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnExample re = new ReturnExample();
		
		int result = re.sedae(1023);
		System.out.println(result);

	}

}
