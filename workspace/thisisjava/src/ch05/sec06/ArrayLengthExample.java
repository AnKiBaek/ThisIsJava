package ch05.sec06;

public class ArrayLengthExample {
  
	public static void main(String[] args) {
		// 배열의길이 : 배열에 저장할수 있는 항목수 0부터시작한다.
		// 배열변수.length 는 읽기전용 이여서 값변경은 불가능하다.
		// intArray.length = 10; <<<<<< 불가능
		
		// 사용자입력 값이나 , API 배열값의 길이를 모를때 사용법
		//		String jsonValue = ? ;
		//		Stiring[] usersInfo = new String[jasonVal];
		//		for(int i =0;i< usersInfo.length ; i++) {
		//		}
		
		//배열변수 선언과 대입
		int[] scores = {84,90,96};
		
		//배열 항목의 총합 구하기
		int sum =0;
		// i < scores.length + 1 : 배열은 확장이불가한데 조건에 +1을 해서
		//java.lang.ArrayIndexOutOfBoundsException 발생한다.
		for(int i = 0; i < scores.length ; i++) {
			sum += scores[i];
		}
		System.out.println("총합: "+sum);
		
		// 평균 구하기
		double avg = sum / scores.length;
		
		System.out.println("평균: "+avg);
		
	}
}
