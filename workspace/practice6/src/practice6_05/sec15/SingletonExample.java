package practice6_05.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(System.identityHashCode(obj2));
		System.out.println(System.identityHashCode(obj1));
		
		System.out.println(obj1.equals(obj2));

	}

}
