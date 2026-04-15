package practice5_8.sec05;

public class ReturnExample {
	
	private String haha(String name) {
		String result = "가 웃습니다. 하하하하..";
		return name + result;
	}

	public static void main(String[] args) {
		
		ReturnExample returnExample = new ReturnExample();
		
		String result = returnExample.haha("기백이");
		
		System.out.println(result);

	}

}
