package ch01_9.sec09;

public class Study {

	public static void main(String[] args) {
		String st1 = "기백";
		String str2 = "기백";
		String st3 = new String("기백");
		String str4 = new String("기백");
		
		System.out.println(st1);
		System.out.println(str2);
		System.out.println(st3);
		System.out.println(str4);
		
		//변수가 바뀌어도 같구나..
		System.out.println(st1 == str2);
		System.out.println(st3 == str4);
		
		//넌 값으로 비교 했늗덷그러네
		System.out.println(st3.equals(str4));
		
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(st3));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(st1));
		
		//이거맞지?
		//keepgoing
		
		
		

	}

}
