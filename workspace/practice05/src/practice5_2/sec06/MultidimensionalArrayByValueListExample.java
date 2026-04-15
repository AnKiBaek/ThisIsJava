package practice5_2.sec06;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		//2차원배열 생성
		int[][] scores = {{10,20,20},{20,30}};
		
		int totalCount = 0;
		int totalVal = 0;
		double avg = 0;
		for(int i = 0; i<scores.length;i++) {
			totalCount += scores[i].length;
			
			for(int k = 0 ;k<scores[i].length;k++) {
				totalVal += scores[i][k];
			}
		}
		
		System.out.println("요소의 총 갯수: " + totalCount);
		System.out.println("요소의 총 합: " + totalVal);
		
		avg = totalVal / totalCount;
		
		System.out.println("평균(double타입): " + avg);

	}

}
