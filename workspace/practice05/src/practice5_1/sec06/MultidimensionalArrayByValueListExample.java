package practice5_1.sec06;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] score = {{20,10,20},{20,30}};
		
		//배열의 길이 조회
		System.out.println("score 배열 길이: " + score.length);
		System.out.println("score[0]배열 길이: " + score[0].length);
		System.out.println("score[1]배열 길이: " + score[1].length);

		
		System.out.println();
		
		//점수의 합산
		int groupValCount = 0;
		int groupTotalVal = 0;
		double groupValAvg = 0;
		
		//2차원 배열 score 의 길이만큼 반복한다.
		for(int i = 0; i < score.length; i++) {
			// score 배열의 i 번째 인덱스 배열의 길이를
			// groupValCount 에 더한다.
			groupValCount +=score[i].length;
			//i 번째 인덱스의 요소길이를 k변수에저장한다.
			for(int k =0 ; k <score[i].length; k++) {
				//groupTotalVal변수에 score[i][k] 즉 2차원배열의값을 하나씩 더한다
				groupTotalVal += score[i][k];
			}
			groupValAvg = groupTotalVal/groupValCount;
			
			System.out.println(groupTotalVal);
			System.out.println(groupValCount);
			System.out.println(groupValAvg);
			
		}
		
		
		
	}

}
