package practice5_4.sec05;

public class ReturnExample {
	
	private int gobhagi(int x , int y) {
		int result = x * y ;
		
		return result;
	}

	public static void main(String[] args) {
		
		ReturnExample re = new  ReturnExample();
		
		int result = re.gobhagi(10, 30);
		
		System.out.println(result);

	}

}
