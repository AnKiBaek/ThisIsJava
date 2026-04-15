package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		
		// 컴파일오류
		//Singleton object1 = new Singleton();
		
		//싱글톤클래스(클래스자체는 퍼블릭임) 의  변수를 생성 하고 getInstance로 객체의위치를 가리킴.
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1==obj2);
	}

}
