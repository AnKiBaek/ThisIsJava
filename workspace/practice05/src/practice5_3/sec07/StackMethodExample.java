package practice5_3.sec07;

public class StackMethodExample {
	
	String authorAge(int age) {
		return String.valueOf(age);
	}

	
	String writer(String name , String title) {
		return name +": "+ title;
	}
	
	public static void main(String[] args) {
		
		StackMethodExample ex= new StackMethodExample();
		String age = ex.authorAge(23);
		String bookInfo = ex.writer("생텍쥐베리", "어린왕자") + "\n나이: " +age;
		
		System.out.println(bookInfo);
	
		
	}
	
	
}
