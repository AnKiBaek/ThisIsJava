package ch05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		//문자열 방식
		
		// 리터럴 방식 : 상수 풀공간 객체생성
		// 서로 같은 메모리 공간을 참조
		String str1 = "JAVA";
		String str2 = "JAVA";
		
		// new 방식 : 힙공간에 객체 생성
		// 서로 다른 메모리공간을 참조
		String str3 = new String("JAVA");
		String str4 = new String("JAVA");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		//문자열의 값을 비교
		System.out.println(str1.equals(str4));
		
		// 문자열 배열 값 비교 방식
		String[] str5 = new String[3];
		
		str5[0]="기백";
		str5[1]= new String("기백");
		str5[2]="기백";
		
		System.out.println("서로다른 힙공간 비교: "+str5[0]==str5[1]);
		// 같은 객체 참조
		System.out.println("힙공간 객체비교: "+str5[0]==str5[2]);
		//값비교
		System.out.println("리터럴 끼리만 비교: "+str5[0].equals(str5[1]));

		
	

	}

}
