package practice6_02.sec15;

public class Singleton {
	
	private  static Singleton singleton = new Singleton();
	private Singleton() {}
	public static Singleton getInstance() {
		return singleton;
	}
	
//	의문점 정리
//	1. 객체화를 왜 진행했는가.
	//싱글톤객체는 말그대로 실체가 하나여야만 한다 외부에서 생성할수없어야한다는 얘기이다.
	
//	2. 기본적으로 생성자가 있는데 굳이 새로만든이유는 무엇인가
	//생성자는 public 이 기본으로 생성된다. 그래서 private로 새로 설정해줘야지 외부에서 생성자를 쓸수없다.
//	3. 스태틱으로사용한이유는 알겠으나 굳이 그래야할이유가있는가
	//클래스안에 객체를 미리만들어둔다음 다른클래스에서는 객체화를 하지않아도
	// getInstance() 를 통해사용할수있게 만드는것이다.
	

}
