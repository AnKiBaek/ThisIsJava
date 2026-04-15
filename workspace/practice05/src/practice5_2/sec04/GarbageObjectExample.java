package practice5_2.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		
		hobby =null;
		
		// hobby 변수에 null을 대입함으로써 값을 쓰레기로 만듬 즉 변수는있지만 객체가없으니 가비지컬랙터의 정리대상이된다.
		
		String str1 = "기백";
		String str2 = str1;
		
		// 같은번지를 가리킨다. (객체는 하나)
		System.out.println(str1 == str2);
		
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str1));
		
		// "기백" 객체와 연결된 변수가 없을경우에 가비지컬렉터의 제거 대상이 된다.
		// 즉 str2 에 "기백" 객체가 연결되어있으므로 제거대상이아니다.
		str1 = null;
		System.out.println(str1 == str2);
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str1));
		
		
		
		
		
		
	}

}
