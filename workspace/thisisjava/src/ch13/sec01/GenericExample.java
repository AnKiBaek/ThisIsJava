package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
		Box<String> content = new Box<>();
		
		
		content.content ="안녕";
		
		String hello = content.content;
		
		Box<Integer>value = new Box<>();
		//박싱
		value.content = 100;
	    // 언박싱
		int val = value.content;
		
		System.out.println(val);
		System.out.println(hello);

	}

}
