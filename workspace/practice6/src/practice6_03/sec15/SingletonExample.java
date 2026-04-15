package practice6_03.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(System.identityHashCode(obj2));
		System.out.println(System.identityHashCode(obj1));
		int obj1HashCode = obj1.hashCode();
		
		System.out.println(obj1HashCode);

	}

}
