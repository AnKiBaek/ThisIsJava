package practice5_1.sec04;

public class GarbageObjectExample {
	public static void main(String[] args) {
		
		
		String hobby ="여행";
		hobby =null; // "여행" 에해당하는 String 객체를 쓰레기로 만듬
		
		String kind1 = "자동차";
		String kind2 = kind1; //kind1 변수에 저장되어있는 번지를 kind2 변수에 대입
		
		System.out.println(System.identityHashCode(kind2));
		System.out.println(System.identityHashCode(kind1));
		
		System.out.println(kind1 == kind2);
		
		kind1 =null; // "자동차" 객체자체는 유지됨
		
		System.out.println(kind2);
	}

}
