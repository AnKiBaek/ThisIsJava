package ch01_2.sec09;

public class Study {

	public static void main(String[] args) {
		
		String str1 = "기라티나";
		String str2 = "기라티나";
		
		String str3 = new String("기라티나");
		String str4 = new String("기라티나");
		
		//출력
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println("str3: "+str3);
		System.out.println("str4: "+str4);
		
		//비교
		System.out.println("리터럴 초기화방식: " + (str1 == str2));
		System.out.println("객체화방식(객체 따로생성): " + (str3 == str4));
		
		//값 비교
		System.out.println("equals()메서드 이용비교: " + str3.equals(str4));
		
		//객체주소기반 해시코드 출력
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
		
	}
}
