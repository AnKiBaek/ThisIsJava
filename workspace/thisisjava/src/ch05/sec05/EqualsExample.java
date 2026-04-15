package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		String strVar1 ="홍길동";
		String strVar2 ="홍길동";
		
		if(strVar1==strVar2) {
			System.out.println("strVal1과 strVal2는 참조하는위치가 같다.");
		} else {
			System.out.println("strVal1과 strVal2는 참초하는위치가 다르다.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVal1과 strVal2는 문자열 값이 같다.");
		}
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3==strVar4) {
			System.out.println("strVal3과 strVal4는 참조위치가 같음.");
		} else {
			System.out.println("strVal3과 strVal4는 참조위치가 다름.");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVal3과 strVal4는 문자열 값이 같다.");
		}
	}
}
