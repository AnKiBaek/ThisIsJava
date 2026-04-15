package ch05.sec06;

public class ArrayCreateByVaueListExample {

	public static void main(String[] args) {
		//배열(참조변수) null 허용
		//배열은 같은 타입의 값만 관리할수있다.
		// 배열의 길이는 늘리거나 줄일수 없다.
		// for 반복문과 궁합이좋다.
		
		// 배열의 선업 방식
		//타입[] 변수; <== 관례적으로 많이쓴다.
		//타입 변수[];
		
		// 타입[] 변수 = {값0,값1,값2....}
		
		// 변수는 스택에 저장(번지수를 저장)
		// 값은 힙에저장(번지수에서 값을 참조)
		
		
		//배열값이 문자열이니 문자열 배열변수 선언
		String[] season = {"Spring","Summer","Fall","Winter"};
		
		//배열의 항목값 읽기
		System.out.println("season[0]"+season[0]);
		System.out.println("season[1]"+season[1]);
		System.out.println("season[2]"+season[2]);
		System.out.println("season[3]"+season[3]);
		
		
		//인덱스 1번 항목의 값 변경
		season[1] = "여름";
		System.out.println("season[1]"+season[1]);
		System.out.println();
		
		
		
		
		
		
		int[] score = {83,90,87};

		//총합 평균 구하기
		int sum=0;
		
		for(int i = 0 ; i < score.length ;i++) {
			sum += score[i];
		}
		System.out.println("총합: "+ sum);
		
		double avg = (double)sum /3;
		System.out.println("평균: "+ avg);
		
		//배열변수 생성후 값넣는법
		String[] names =null;
		
		names = new String[] { "신용재","허각","박존"};
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
	}

}
