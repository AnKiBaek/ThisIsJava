package practice5_4.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		
		
		String str1 = new String("100");
		
		String str2 = new String(str1);
		
		
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str1));
		System.out.println(str1.equals(str2));
		str1 = null;
		System.out.println(str2);

	}

}
