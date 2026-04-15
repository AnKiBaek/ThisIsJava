package ch16.sec02.exam03;

public class LamdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		//매개변수는 굳이 같을 필요는 없다.
		person.action1((nameVal , workVal) ->{
			System.out.println(nameVal+"씨는"+workVal+"을 직업으로 합니다.");
		});
		
		//매개변수가 1개 일경우는 데이터 선언부 '()' 와 실행부 '{}'를 생략 가능하다.
		person.action2 (word->System.out.println(word+"라고 말합니다2."));
		

	}

}
