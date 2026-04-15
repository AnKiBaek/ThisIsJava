package practice6_01.sec15;

public class Singleton {
	
	//싱글톤 객체 만드는법
	private static Singleton singleton = new Singleton();
	private Singleton() {}
	//외부에서 연결할수있는 메서드만 만듬
	public static Singleton getInstance() {
		return singleton;
	}

}
