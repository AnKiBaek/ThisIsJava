package practice5_5.sec06;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		//2차원 배열 생성후 요소의 갯수 , 총합 , 평균 구하기
		int[][] arr = {{1,2,3},{1,2,3}};
		
		int totalVal =0;
		int totalCount = 0;
		double avg = 0;
		
		for(int i = 0; i < arr.length ; i++) {
			
			totalCount += arr[i].length;
			for(int k  =0 ; k < arr[i].length; k++) {
				totalVal += arr[i][k];
			}
			
			System.out.println(totalCount);
			System.out.println(totalVal);
			avg = totalVal / totalCount;
			System.out.println(avg);
		}

	}

}
