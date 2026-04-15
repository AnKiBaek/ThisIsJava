package practice6_07.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		Computer computer  = new Computer();
		int result1 = computer.minus(100,1000,10,20);
		int result2 = computer.minus();
		int result3 = computer.minus();
		
		
		System.out.println(result2 == result3);
		String str1 = String.valueOf(result3);
		String str2 = String.valueOf(result2);
		
		
		
		
		System.out.println(result2);
		System.out.println(result1);

		System.out.println(str1.equals(str2));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str1));
		
		System.out.println(System.identityHashCode(result1));
		System.out.println(System.identityHashCode(result2));
		
		
		

	}

}
