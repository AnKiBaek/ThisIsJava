package ch12.sec11.exam03;

public class GetResourceExample {

	public static void main(String[] args) {
		// clazz 변수에 Car 클래스 가져오기
		Class clazz = Car.class;
		
		//문자열 타입 변수에 이미지 리소스 경로 저장하기
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
