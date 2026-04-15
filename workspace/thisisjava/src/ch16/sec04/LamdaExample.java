package ch16.sec04;

public class LamdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action1((x,y)-> {
			double result = x+y;
			return result;
		});
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		// 리턴값이 1개일경우 괄호 및 'return' 생략가능
		person.action1((x,y)->x+y);
		
		// 정적메서드의 리턴값을  person 메서드의 실행부로써 사용한다.
		person.action1((x,y) -> sum(x, y));

	}
	
	public static double sum(double x , double y) {
		return (x + y);
	}

}
