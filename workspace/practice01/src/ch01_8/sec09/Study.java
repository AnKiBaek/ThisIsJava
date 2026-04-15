package ch01_8.sec09;

public class Study {

	public static void main(String[] args) {
	String str1 = "리터럴";
	String str2 = "리터럴";
	String str3 = new String("객체화");
	String str4 = new String("객체화");
	
	//출력
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);
	
	// 비교연산자 == (객체주소값비교)
	System.out.println(str1 == str2);
	//넌 객체주소가 달라서 false 란다.
	System.out.println(str3 == str4);
	//값으로 비교하면 ture 뜰걸?
	System.out.println(str3.equals(str4));
	
	//객체주소 해시코드형 박제
	System.out.println(System.identityHashCode(str4));
	System.out.println(System.identityHashCode(str3));
	//str1 , str2 같은이유가 객체주소가 같아서 그랴
	System.out.println(System.identityHashCode(str2));
	System.out.println(System.identityHashCode(str1));
	
	
	

	}

}
